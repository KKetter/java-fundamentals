# Java Fundamentals

## Labs
- [Lab 2 - pluralize, flipNHeads, clock](https://github.com/KKetter/java-fundamentals/blob/master/basics/Main.java)
- [Lab 2 - roll, contains duplicates, calc avg, array of arrays](https://github.com/KKetter/java-fundamentals/blob/Lab02-Setup/basiclibrary/src/main/java/basiclibrary/Library.java)
- [Lab 3 - Weather, Election map ](https://github.com/KKetter/java-fundamentals/blob/Lab03/basiclibrary/src/main/java/basiclibrary/Library.java)
- [Lab 3 - Linter]()
- [Lab 6 - Composition/Inheritance](https://github.com/KKetter/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)
- [Lab 7 - Inheritance](https://github.com/KKetter/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)

## Library Architecture
```
.
├── LICENSE
├── README.md
├── basiclibrary
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── gradlew
│   ├── gradlew.bat
│   ├── out
│   │   ├── production
│   │   │   └── classes
│   │   │       └── basiclibrary
│   │   │           └── Library.class
│   │   └── test
│   │       └── classes
│   │           ├── META-INF
│   │           │   └── basiclibrary.main.kotlin_module
│   │           └── basiclibrary
│   │               └── LibraryTest.class
│   ├── settings.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── basiclibrary
│       │   │       └── Library.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── basiclibrary
│           │       └── LibraryTest.java
│           └── resources
├── basics
│   ├── Main.class
│   └── Main.java
└── inheritance
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── out
    │   ├── production
    │   │   └── classes
    │   │       └── inheritance
    │   │           ├── Library.class
    │   │           ├── Restaurant.class
    │   │           ├── Review.class
    │   │           ├── Shop.class
    │   │           └── Theatre.class
    │   └── test
    │       └── classes
    │           └── inheritance
    │               ├── LibraryTest.class
    │               ├── RestaurantTest.class
    │               ├── ReviewTest.class
    │               ├── ShopTest.class
    │               └── TheatreTest.class
    ├── settings.gradle
    └── src
        ├── main
        │   ├── java
        │   │   └── inheritance
        │   │       ├── Library.java
        │   │       ├── Restaurant.java
        │   │       ├── Review.java
        │   │       ├── Shop.java
        │   │       └── Theatre.java
        │   └── resources
        └── test
            ├── java
            │   └── inheritance
            │       ├── LibraryTest.java
            │       ├── RestaurantTest.java
            │       ├── ReviewTest.java
            │       ├── ShopTest.java
            │       └── TheatreTest.java
            └── resources

```