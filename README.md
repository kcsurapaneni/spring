## Circular Dependency
- In case of eager loading which is a default mechanism in spring, application will not start by stating the following

``The dependencies of some of the beans in the application context form a cycle:``

````
┌─────┐
|  car defined in file [com/learn/spring/circular/Car.class]
↑     ↓
|  engine defined in file [com/learn/spring/circular/Engine.class]
└─────┘
````

- By setting up spring.main.allow-circular-references is also not useful. It gives

``Despite circular references being allowed, the dependency cycle between beans could not be broken. Update your application to remove the dependency cycle.``

- We have to use `@Lazy` from `org.springframework.context.annotation.Lazy` and the server will start without complaining on circular dependency error
