import sys
from enum import Enum

import messages


class Action(Enum):
    READ_NEXT = 0
    READ_ARRAY = 1
    END_READ_ARRAY = 2
    CONTINUE = 3
    UNDO = 4


def print_message(message):
    print(message)
    return Action.READ_NEXT


ACTIONS = [
    [
        messages.STRUCTURE_KEYWORD,
        lambda field, path: print_message('\n'.join(field.get_structure(path)))
    ],
    [
        messages.ARRAY_KEYWORD,
        lambda field, path: Action.READ_ARRAY
    ],
    [
        messages.END_ARRAY_KEYWORD,
        lambda field, path: Action.END_READ_ARRAY
    ],
    [
        messages.HELP_KEYWORD,
        lambda field, path: print_message(field.get_help(path))
    ],
    [
        messages.HINT_KEYWORD,
        lambda field, path: print_message(field.get_hint(path))
    ],
    [
        messages.UNDO_KEYWORD,
        lambda field, path: Action.UNDO
    ],
    [
        messages.GUIDE_KEYWORD,
        lambda field, path: print_message(messages.WELCOME)
    ],
    [
        messages.QUIT_KEYWORD,
        lambda field, path: sys.exit(0)
    ]
]


def get_answer(field):
    answer = sys.stdin.readline()[:-1]
    if answer[0] == '\\':
        answer = answer[1:]
        for action in ACTIONS:
            if answer[:len(action[0])] == action[0]:
                return [action[1](field, answer[len(action[0]):]), None]

    return [Action.CONTINUE, answer]


def get_bool_answer(field):
    while True:
        action, answer = get_answer(field)
        if action == Action.UNDO:
            return [action, answer]
        elif action == Action.READ_NEXT:
            continue

        if answer in messages.TRUE_ANSWER:
            return [Action.CONTINUE, True]
        if answer in messages.FALSE_ANSWER:
            return [Action.CONTINUE, False]
        print(messages.INCORRECT_BOOL_ANSWER)
