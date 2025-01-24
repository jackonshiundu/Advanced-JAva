# Advanced-JAva

Advanced java Concepts

To run this files make sure you have the JDK installed in you machine.
Open your CMD and run teh fi=ollign commands.

1.git clone https://github.com/jackonshiundu/Advanced-JAva.git
2.cd Advanced-JAva
3.code . (when you have VScoe installed it will open the code in VS Code, if not you don't have to run this command just open the your IDE the open the Advanced-JAva Folder).

Once it opens In Your Code Editor Open your termminal and type the follwign commands

1. javac Abstract.java to compile(this is for each respective filees that you would like to run )
2. java Abstract

you will be able to see the results.

# Abstract.java

This Java program demonstrates the concept of abstract classes, abstract methods, and inheritance in object-oriented programming (OOP). It includes an abstract base class Car, which defines abstract methods and a regular method. Then, a concrete class Tesla is provided that implements the abstract methods from the base class Car.

Key Concepts:
1.Abstract Class: An abstract class is a class that cannot be instantiated directly. It is meant to be subclassed by other classes. An abstract class can have both abstract methods (methods without a body) and non-abstract methods (methods with a body).

2.Abstract Method: An abstract method is a method that does not have a body in the abstract class. The concrete subclass must provide an implementation for the abstract method. In this example, the abstract methods fly() and drive() are defined in the Car class.

3.Concrete Class: A concrete class is a class that provides implementations for all abstract methods from the abstract classes it extends. Tesla is an example of a concrete class that implements the abstract methods fly() and drive().

Classes and Methods:
Car (Abstract Class):
1.Abstract Methods:
public abstract void fly(); — A method that must be implemented by subclasses.
public abstract void drive(); — Another method that must be implemented by subclasses.
2.Non-Abstract Method:
public void playMusic(); — A method with a body that can be inherited and used by subclasses.
3.FordRangerRaptor (Abstract Class):
Inherits from Car and provides an implementation for the drive() method. However, it does not implement the fly() method, leaving it abstract.
4Tesla (Concrete Class):
Inherits from FordRangerRaptor and provides implementations for both fly() and drive() methods.
Why Can't We Create an Object of an Abstract Class?
You cannot instantiate an abstract class directly. The reason is that an abstract class is meant to be a template for other classes. It may contain incomplete methods (abstract methods), and it is expected that concrete subclasses will provide the full implementation of those methods.

For example:

Car car = new Car(); // Error! Cannot instantiate abstract class.
You can only create an instance of a concrete class that provides implementations for all abstract methods. In this example, Tesla is the concrete class that can be instantiated.

Sample Output:

Playing Music...
You are now driving ford Ranger Raptor ...
You are Flying Tesla....

# Inner.java

This project demonstrates the usage of anonymous inner classes and static inner classes in Java. The program defines a class A with a non-static inner class B, and also illustrates how to override methods using an anonymous inner class. The example also highlights how static inner classes can be instantiated without needing an instance of the outer class.

Code Explanation
Class A
Method show(): A method that prints a message to the console.
Static inner class B: This is a static inner class inside class A. It contains a method show1() that prints a different message to the console. Static inner classes can be instantiated without requiring an instance of the outer class.
Class Inner (Main Class)
Anonymous Inner Class: Inside the main method, an anonymous class is created by extending class A and overriding its show() method. The overridden method prints a custom message.
Static Inner Class Instantiation: The static inner class B is instantiated using new A.B(), which does not require an instance of the outer class A. Then, the show1() method of B is called to print another message.
Code Flow
The anonymous inner class overrides the show() method of class A, and when obj.show() is called, it prints the overridden message.
The static inner class B is instantiated using new A.B(), and the method show1() prints its message.
Output

THis is showing from the anonmous function.inner to the Demo class
Hello this is show in A.B.

Key Concepts
Anonymous Inner Class
An anonymous inner class is used to create a class that implements or extends an existing class (or interface) without explicitly naming it. It can be used when you need to override methods of a class or interface in a concise way.

Static Inner Class
A static inner class is associated with the outer class and can be instantiated without an instance of the outer class. It can access only the static members of the outer class.

Conclusion
This example demonstrates basic usage of anonymous and static inner classes in Java. The anonymous inner class is used to override a method of class A without creating a named subclass, while the static inner class B is instantiated separately, demonstrating the flexibility of inner class usage in Java.

# Interface.java

This project demonstrates how to define and implement interfaces in Java. It covers the following key concepts:

Interface Definition: How to define an interface and declare methods in it.
Implementing Interfaces: How a class can implement one or more interfaces.
Interface Inheritance: How an interface can extend another interface.
Multiple Interface Implementation: A class implementing multiple interfaces.
The code also illustrates the use of constants in interfaces and how methods from interfaces are implemented in a class.

Code Explanation
Interface X
Variables in Interface: The interface X defines two variables, age and area, which are implicitly public, static, and final. This means their values cannot be changed once initialized.
Methods: The interface declares two abstract methods, show() and config(), which must be implemented by any class that implements X.
Interface Y
Method Declaration: The interface Y defines a single abstract method run().
Interface Z: The interface Z extends interface Y, meaning any class that implements Z must also implement the run() method from interface Y.
Class B
Implementing Multiple Interfaces: The class B implements both X and Z. This means it must implement all methods from both interfaces:
show() and config() from X.
run() from Y, which is inherited by Z.
Main Method (Interface Class)
Object Creation:
An object obj of type X is created and assigned an instance of B. The show() method from interface X is called on obj.
An object obj1 of type Y is created and assigned an instance of B. The run() method from interface Y is called on obj1.
Accessing Interface Constants: The constant area from interface X is accessed using X.area.

on line 30 We look at diffrent types of interfaces that are tehre in JAVA and we go on to loook at an example of a Functional interface, it pretty much works the same as a Normal interface is just that it only has to have one abstarct method. whitch in our case is the show() method.

when you continue further to line 60 you will see the creation of object and after calling
obj2.show();//expected output will be - Implimenting the SAM Interface in CLass SamIimp.

Output:

Showing in class B implementing A interface
The Dog is running from B
Nairobi
Implimenting the SAM Interface in CLass SamIimp.

Key Concepts

Interface in Java
An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It cannot contain instance fields or constructors.

    Methods in Interface: All methods declared in an interface are implicitly public and abstract, unless they are default or static methods.
    Variables in Interface: All variables in an interface are implicitly public, static, and final.

Implementing an Interface
When a class implements an interface, it is required to provide concrete implementations for all the abstract methods declared in the interface.

Interface Inheritance
An interface can extend one or more other interfaces, inheriting their method declarations.

Multiple Interface Implementation
A class can implement multiple interfaces, providing implementations for all methods from each interface.

Conclusion
This example illustrates how to work with interfaces in Java, including:

    Defining interfaces with methods and constants.
    Implementing interfaces in a class.
    Inheriting one interface from another.
    Using multiple interfaces in a class.

# Enun.java

This project demonstrates how to use enums in Java to represent a set of constant values. In this case, we use the Laptop enum to represent different laptop models, each with a specific price. The file includes various methods for interacting with the enum values, including values(), ordinal(), conditional checks using if-else, and switch.

Project Structure
The project contains two main components:

Laptop Enum:

Represents laptop models (ThinkPad, Hp, Macbook, and Surface).
Each laptop model has an associated price, with a default price for some models.
Includes a constructor to set custom prices and a method to get or modify the price.
Enum Class:

Demonstrates how to use the Laptop enum in different scenarios.
Includes examples of how to:
Loop through enum constants using values().
Use ordinal() to get the position of enum constants.
Compare enum values using if-else.
Use a switch statement to handle enum constants.
Enum Details: Laptop
The Laptop enum defines the following constants:

ThinkPad(3000): Price set to 3000.
Hp(2000): Price set to 2000.
Macbook(5000): Price set to 5000.
Surface: Default price set to 6000.
Fields and Methods:
price: Integer field holding the price for each laptop model.
Laptop(): Default constructor that sets the price to 6000 (used for Surface).
Laptop(int price): Constructor that allows setting a custom price for each laptop.
getPrice(): Method to return the price of the laptop.
setPrice(int price): Method to modify the price of the laptop.
Example Use Cases:

1.  Using values() to Retrieve All Enum Constants
    The values() method is automatically generated for all enums. It returns an array of all constants in the order they are defined.

    Laptop[] res = Laptop.values();
    for (Laptop re : res) {
    System.out.println(re.ordinal() + " :" + re + " : " + re.getPrice());
    }
    This code prints the ordinal value (index), name, and price of each laptop.

2.  Using if-else to Compare Enum Values
    This example checks the value of the Laptop variable and prints the price of the corresponding laptop.

    Laptop r = Laptop.Hp;
    if (r == Laptop.Hp) {
    System.out.println(r + " " + r.getPrice());
    } else if (r == Laptop.Macbook) {
    System.out.println(r + " " + r.getPrice());
    } else {
    System.out.println("Others");
    }

3.  Using switch to Compare Enum Values
    The switch statement offers a more concise way to compare enum constants.

        switch (r) {
            case Macbook:
                System.out.println(r + " " + r.getPrice());
                break;
            case Hp:
                System.out.println(r + " " + r.getPrice());
                break;
            default:
                System.out.println("Others");
                break;
        }

    Expected Output:
    When the main() method is executed, the program produces the following output:

        0 :ThinkPad : 3000
        1 :Hp : 2000
        2 :Macbook : 5000
        3 :Surface : 6000
        Hp 2000
        Hp 2000

        The first block prints the ordinal value (position in the enum declaration), laptop name, and its price.
        The second block uses if-else to print the price of Hp (since r is set to Laptop.Hp).
        The third block uses a switch statement to again print the price of Hp.
