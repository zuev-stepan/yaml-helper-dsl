/*
 * generated by Xtext 2.22.0
 */
package yaml.helper.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractYamlGenDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(yaml.helper.dsl.yamlGenDsl.YamlGenDslPackage.eINSTANCE);
		return result;
	}
}
