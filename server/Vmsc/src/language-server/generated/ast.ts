/******************************************************************************
 * This file was generated by langium-cli 1.0.0.
 * DO NOT EDIT MANUALLY!
 ******************************************************************************/

/* eslint-disable */
import { AstNode, AbstractAstReflection, Reference, ReferenceInfo, TypeMetaData } from 'langium';

export type VStructuralComponent = VClass | VDatatype | VEnum | VPackage;

export const VStructuralComponent = 'VStructuralComponent';

export function isVStructuralComponent(item: unknown): item is VStructuralComponent {
    return reflection.isInstance(item, VStructuralComponent);
}

export type VStructuralFeatures = VAttribute | VReference;

export const VStructuralFeatures = 'VStructuralFeatures';

export function isVStructuralFeatures(item: unknown): item is VStructuralFeatures {
    return reflection.isInstance(item, VStructuralFeatures);
}

export interface VAnnotation extends AstNode {
    readonly $container: VAttribute | VClass | VDatatype | VEnum | VOperation | VReference;
    readonly $type: 'VAnnotation';
    id: string
    name: string
    value?: string
}

export const VAnnotation = 'VAnnotation';

export function isVAnnotation(item: unknown): item is VAnnotation {
    return reflection.isInstance(item, VAnnotation);
}

export interface VAttribute extends AstNode {
    readonly $container: VClass;
    readonly $type: 'VAttribute';
    id: string
    IsDerived: boolean
    IsID: boolean
    IsNotChangeable: boolean
    IsNotOrdered: boolean
    IsNotUnique: boolean
    IsTransient: boolean
    IsUnsettable: boolean
    IsVolatile: boolean
    LowerBound?: number
    name: string
    UpperBound?: number
    VAnnotations: Array<VAnnotation>
    VType: string
}

export const VAttribute = 'VAttribute';

export function isVAttribute(item: unknown): item is VAttribute {
    return reflection.isInstance(item, VAttribute);
}

export interface VClass extends AstNode {
    readonly $container: VModel | VPackage;
    readonly $type: 'VClass';
    id: string
    IsAbstract: boolean
    IsInterface: boolean
    name: string
    VAnnotations: Array<VAnnotation>
    VOperations: Array<VOperation>
    VStructuralFeatures: Array<VStructuralFeatures>
    VSuperType: Array<Reference<VClass>>
}

export const VClass = 'VClass';

export function isVClass(item: unknown): item is VClass {
    return reflection.isInstance(item, VClass);
}

export interface VDatatype extends AstNode {
    readonly $container: VModel | VPackage;
    readonly $type: 'VDatatype';
    id: string
    IsSerializable: boolean
    name: string
    VAnnotations: Array<VAnnotation>
}

export const VDatatype = 'VDatatype';

export function isVDatatype(item: unknown): item is VDatatype {
    return reflection.isInstance(item, VDatatype);
}

export interface VEnum extends AstNode {
    readonly $container: VModel | VPackage;
    readonly $type: 'VEnum';
    id: string
    IsSerializable: boolean
    name: string
    VAnnotations: Array<VAnnotation>
    VEnumLiterals: Array<VLiteral>
}

export const VEnum = 'VEnum';

export function isVEnum(item: unknown): item is VEnum {
    return reflection.isInstance(item, VEnum);
}

export interface VLiteral extends AstNode {
    readonly $container: VEnum;
    readonly $type: 'VLiteral';
    id: string
    name: string
    value?: number
}

export const VLiteral = 'VLiteral';

export function isVLiteral(item: unknown): item is VLiteral {
    return reflection.isInstance(item, VLiteral);
}

export interface VModel extends AstNode {
    readonly $type: 'VModel';
    id: string
    name: string
    VPackage: Array<VPackage>
}

export const VModel = 'VModel';

export function isVModel(item: unknown): item is VModel {
    return reflection.isInstance(item, VModel);
}

export interface VOperation extends AstNode {
    readonly $container: VClass;
    readonly $type: 'VOperation';
    id: string
    name: string
    VAnnotations: Array<VAnnotation>
    VParameters: Array<VParameter>
    VType?: string
}

export const VOperation = 'VOperation';

export function isVOperation(item: unknown): item is VOperation {
    return reflection.isInstance(item, VOperation);
}

export interface VPackage extends AstNode {
    readonly $container: VModel | VPackage;
    readonly $type: 'VPackage';
    id: string
    name: string
    VComponents: Array<VStructuralComponent>
    VPrefix: string
    VUri: string
}

export const VPackage = 'VPackage';

export function isVPackage(item: unknown): item is VPackage {
    return reflection.isInstance(item, VPackage);
}

export interface VParameter extends AstNode {
    readonly $container: VOperation;
    readonly $type: 'VParameter';
    id: string
    name: string
    VType?: string
}

export const VParameter = 'VParameter';

export function isVParameter(item: unknown): item is VParameter {
    return reflection.isInstance(item, VParameter);
}

export interface VReference extends AstNode {
    readonly $container: VClass;
    readonly $type: 'VReference';
    id: string
    IsContainer: boolean
    IsContainment: boolean
    IsDerived: boolean
    IsID: boolean
    IsNotChangeable: boolean
    IsNotOrdered: boolean
    IsNotUnique: boolean
    IsTransient: boolean
    IsUnsettable: boolean
    IsVolatile: boolean
    LowerBound?: number
    name: string
    UpperBound?: number
    VAnnotations: Array<VAnnotation>
    VType: Reference<VClass>
}

export const VReference = 'VReference';

export function isVReference(item: unknown): item is VReference {
    return reflection.isInstance(item, VReference);
}

export interface VmscAstType {
    VAnnotation: VAnnotation
    VAttribute: VAttribute
    VClass: VClass
    VDatatype: VDatatype
    VEnum: VEnum
    VLiteral: VLiteral
    VModel: VModel
    VOperation: VOperation
    VPackage: VPackage
    VParameter: VParameter
    VReference: VReference
    VStructuralComponent: VStructuralComponent
    VStructuralFeatures: VStructuralFeatures
}

export class VmscAstReflection extends AbstractAstReflection {

    getAllTypes(): string[] {
        return ['VAnnotation', 'VAttribute', 'VClass', 'VDatatype', 'VEnum', 'VLiteral', 'VModel', 'VOperation', 'VPackage', 'VParameter', 'VReference', 'VStructuralComponent', 'VStructuralFeatures'];
    }

    protected override computeIsSubtype(subtype: string, supertype: string): boolean {
        switch (subtype) {
            case VAttribute:
            case VReference: {
                return this.isSubtype(VStructuralFeatures, supertype);
            }
            case VClass:
            case VDatatype:
            case VEnum:
            case VPackage: {
                return this.isSubtype(VStructuralComponent, supertype);
            }
            default: {
                return false;
            }
        }
    }

    getReferenceType(refInfo: ReferenceInfo): string {
        const referenceId = `${refInfo.container.$type}:${refInfo.property}`;
        switch (referenceId) {
            case 'VClass:VSuperType':
            case 'VReference:VType': {
                return VClass;
            }
            default: {
                throw new Error(`${referenceId} is not a valid reference id.`);
            }
        }
    }

    getTypeMetaData(type: string): TypeMetaData {
        switch (type) {
            case 'VAttribute': {
                return {
                    name: 'VAttribute',
                    mandatory: [
                        { name: 'IsDerived', type: 'boolean' },
                        { name: 'IsID', type: 'boolean' },
                        { name: 'IsNotChangeable', type: 'boolean' },
                        { name: 'IsNotOrdered', type: 'boolean' },
                        { name: 'IsNotUnique', type: 'boolean' },
                        { name: 'IsTransient', type: 'boolean' },
                        { name: 'IsUnsettable', type: 'boolean' },
                        { name: 'IsVolatile', type: 'boolean' },
                        { name: 'VAnnotations', type: 'array' }
                    ]
                };
            }
            case 'VClass': {
                return {
                    name: 'VClass',
                    mandatory: [
                        { name: 'IsAbstract', type: 'boolean' },
                        { name: 'IsInterface', type: 'boolean' },
                        { name: 'VAnnotations', type: 'array' },
                        { name: 'VOperations', type: 'array' },
                        { name: 'VStructuralFeatures', type: 'array' },
                        { name: 'VSuperType', type: 'array' }
                    ]
                };
            }
            case 'VDatatype': {
                return {
                    name: 'VDatatype',
                    mandatory: [
                        { name: 'IsSerializable', type: 'boolean' },
                        { name: 'VAnnotations', type: 'array' }
                    ]
                };
            }
            case 'VEnum': {
                return {
                    name: 'VEnum',
                    mandatory: [
                        { name: 'IsSerializable', type: 'boolean' },
                        { name: 'VAnnotations', type: 'array' },
                        { name: 'VEnumLiterals', type: 'array' }
                    ]
                };
            }
            case 'VModel': {
                return {
                    name: 'VModel',
                    mandatory: [
                        { name: 'VPackage', type: 'array' }
                    ]
                };
            }
            case 'VOperation': {
                return {
                    name: 'VOperation',
                    mandatory: [
                        { name: 'VAnnotations', type: 'array' },
                        { name: 'VParameters', type: 'array' }
                    ]
                };
            }
            case 'VPackage': {
                return {
                    name: 'VPackage',
                    mandatory: [
                        { name: 'VComponents', type: 'array' }
                    ]
                };
            }
            case 'VReference': {
                return {
                    name: 'VReference',
                    mandatory: [
                        { name: 'IsContainer', type: 'boolean' },
                        { name: 'IsContainment', type: 'boolean' },
                        { name: 'IsDerived', type: 'boolean' },
                        { name: 'IsID', type: 'boolean' },
                        { name: 'IsNotChangeable', type: 'boolean' },
                        { name: 'IsNotOrdered', type: 'boolean' },
                        { name: 'IsNotUnique', type: 'boolean' },
                        { name: 'IsTransient', type: 'boolean' },
                        { name: 'IsUnsettable', type: 'boolean' },
                        { name: 'IsVolatile', type: 'boolean' },
                        { name: 'VAnnotations', type: 'array' }
                    ]
                };
            }
            default: {
                return {
                    name: type,
                    mandatory: []
                };
            }
        }
    }
}

export const reflection = new VmscAstReflection();
