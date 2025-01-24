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
