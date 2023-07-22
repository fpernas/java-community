# java-community

The project contains several examples with the explainations of why works or not, and what is the outcome of each of those (what does it print, why doesn't it compile, etc).
Each Java packet represents the type of examples that contains. For example the **constructors** package contains examples of something related with constructors. 

The folder structure looks like this. Next to leaf folders you can find the number of exercises inside. Keep in mind that one excercise can contain several files.
```
.
├── demo
└── on/
    └── drugs/
        ├── constructors  (2)
        ├── initializators  (1)
        ├── innerClass  (1)
        ├── interfaces/
        │   ├── functionals  (2)
        │   ├── inheritance  (1)
        │   └── statics  (1)
        └── lambdas  (1)
```

And the list of exercises with some breaf explaination of what they are is (the check is to determine if they were
already presented to people or not):
- constructors:
  - [ ] SomeClass: super class with no default constructor
  - [ ] SomeOtherClass: Open exercise to use the **this** constructor
- initialization:
  - [ ] FirstClass + SecondClass: open exercise with class + instance initialization
- innerClass:
  - [ ] InnerClass + CallingClassForInners: exercise to see how to instanciate an inner class
- interfaces:
  - functionals
    - [ ] FirstInterface: basic example of a Functional interface without the annotation
    - [ ] SecondInterface: a couple of interfaces to determine if they are valid functional interfaces
  - inheritance:
    - [ ] ClassWithTwoInterfaces implements FirstInterface and SecondInterface both with the same default method name
  - statics:
    - [ ] ClassCallStaticMethod implements StaticMethodInterface, and the example demonstrates how to use a static method of an interface
- lambdas:
    - [ ] Lambas: contains several lambdas that don't compile
