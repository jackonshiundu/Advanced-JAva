
interface A {
    void show(int i);
}
public class Lambda {
    public static void main(String[] args) {
        //using -> that how we create a lambda expression. and you can also apss in parameters in that fassions.
        A obj= i->System.out.println("This is showing implimetign the interface A" + i);
        obj.show(5);
    }

}