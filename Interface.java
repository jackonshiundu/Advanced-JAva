//Interfaces.
//class --> class Extends
//class --> Interface impliments
//interface --> interface extends
 interface X {
    //you can also create variables in an interface but they are both final and static. So you have to initialize.
    int age=44;
    String area="Nairobi";
    //by default interface methods have the public abstract applied in the background if you dont explicitly spacify
    void show();
    void config();
}
//we cannot create an object for the interface to impliemnt the methods so wht we do is create a  class that impliments the interface and define all teh methods required.
interface Y {
    void run();

}
//interfaces can also inherit from other interfaces
interface Z extends Y  {


}
//in Interface you can have a class implimenting multiple Interfaces.
class B implements X,Z{
    public void show(){
        System.out.println("SHowing in class B implimenting A inteface");
    }
    public void config(){
        System.out.println("IMlimenting Configutation in class B implimenting A inteface");
    }
    public void run(){
        System.out.println("The Dog iss running from B");
    }
}
//diffrent types of interface
//Normal-Two  methods
//Functional.SAM- single method
//Marker INterface no method
@FunctionalInterface //annotaion to make this interface a Functional Interface.
interface SamI {
    void show();
}
class SamIImp implements SamI {
    public void show(){
        System.out.println("Implimenting the SAM Interface in CLass SamIimp.");
    }
}
public class Interface {
    public static void main(String[] args) {
        X obj;

        obj =new B();
        //for you to use objects of anotehr interface ypu must refer to that interface
        obj.show();

        Y obj1=new B();
        obj1.run();
        //now abouve line i cannot in any way call methods of interface X.
        System.out.println(X.area);
        //implimentation of SAM interface
        SamI obj2=new SamIImp();

        obj2.show();
    }
}

