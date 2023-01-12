const x = {
  VPackage: {
    name: "myPackage",
    VPrefix: "myPrefix",
    VUri: "myUri",
    VComponents: [
      {
        VClass: {
          name: "myClass",
          IsAbstract: "True",
          vSuperType: [myClass],
          vstructural_features: {
            VAttribute: {
              name: "myAttribute",
              LowerBound: 0,
              UpperBound: 10,
              VType: "VInt",
              VContent: 1,
            },
          },
        },
      },
      {
        VClass: {
          name: "myClass",
          IsAbstract: "True",
          vSuperType: [myClass],
          vstructural_features: {
            VAttribute: {
              name: "myAttribute",
              LowerBound: 0,
              UpperBound: 10,
              VType: "VInt",
              VContent: 1,
            },
          },
        },
      },
    ],
  },
};

const y = {
  VPackage: {
    name: "tete",
    VPrefix: "myPrefix",
    VUri: "myUri",
    VComponents: [
      {
        VClass: {
          name: "tetet",
          VStructuralFeatures: [
            {
              VAttribute: {
                name: "deded",
                LowerBound: 0,
                UpperBound: 10,
                VType: VInt,
                VContent: 23,
              },
            },
            {
              VAttribute: {
                name: "deded",
                LowerBound: 0,
                UpperBound: 10,
                VType: VInt,
                VContent: 23,
              },
            },
          ],
        },
      },
      {
        VPackage: {
          name: "tete",
          VPrefix: "myPrefix",
          VUri: "myUri",
          VComponents: [
            {
              VClass: {
                name: "tetet",
                VStructuralFeatures: [
                  {
                    VAttribute: {
                      name: "deded",
                      LowerBound: 0,
                      UpperBound: 10,
                      VType: VInt,
                      VContent: 23,
                    },
                  },
                  {
                    VAttribute: {
                      name: "deded",
                      LowerBound: 0,
                      UpperBound: 10,
                      VType: VInt,
                      VContent: 23,
                    },
                  },
                ],
              },
            },
          ],
        },
      },
    ],
  },
};
