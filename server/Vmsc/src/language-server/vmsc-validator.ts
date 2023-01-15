import { ValidationAcceptor, ValidationChecks } from 'langium';
import { VmscAstType, VClass } from './generated/ast';
import type { VmscServices } from './vmsc-module';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: VmscServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.VmscValidator;
    const checks: ValidationChecks<VmscAstType> = {
        VClass: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class VmscValidator {

    checkPersonStartsWithCapital(person: VClass, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }

}
