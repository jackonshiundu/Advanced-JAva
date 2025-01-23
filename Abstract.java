//when you planning to create an abstract method that whe you craate an abstarct class and to create you initialzize your class name withn the text abstract.
abstract class Car{
    public abstract void fly();
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music...");
    }
}
abstract class FordRangerRaptor extends Car {

    public void drive(){
        System.out.println("You are now driving ford Ranger Raptor ...");
    }
}
//Concrete Class
class Tesla extends FordRangerRaptor {

    public void fly() {
        System.out.println("You are Flying Tesla....");
    }
}



public class Abstract {
    public static void main(String[] args) {
        //this is how you access the methods of an abstract Class you cant directly method of an abstract class you create classes that extend it then you acces the methods form the object created with from the class.
        Car obj=new Tesla();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
//you can declare absdtuct keyword with abstruct method and when you create abstruct method you have to craete abstruct class.
//Abstruct class can have normal methods also.
//We cannot ceate an object of an abstruct class. why?()