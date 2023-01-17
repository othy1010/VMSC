import { ValidationAcceptor, ValidationChecks } from 'langium';
import { VmscAstType, VStructuralComponent } from './generated/ast';
import type { VmscServices } from './vmsc-module';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: VmscServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.VmscValidator;
    const checks: ValidationChecks<VmscAstType> = {
        VStructuralComponent: validator.checkStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class VmscValidator {

    checkStartsWithCapital(component: VStructuralComponent, accept: ValidationAcceptor): void {
        if (component.name) {
            const firstChar = component.name.substring(1, 2);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'keyword should start with a capital.', { node: component, property: 'name' });
            }
        }
    }

}
