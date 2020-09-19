#!/bin/sh
if echo "from yamlgen_main import root" | python3 &> /dev/null; then
    pyinstaller --onefile --distpath . main.py
else
    echo "Root not found"
fi

