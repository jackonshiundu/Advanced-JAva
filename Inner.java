class A{
    public void show(){
        System.out.println("Hello this is show in A.");
    }
    static class B {

        public void show1(){
            System.out.println("Hello this is show in A.B.");
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("THis is showing from the anonmous function.inner to the Demo class");
            }
        };
        obj.show();//THis is showing from the anonmous function.inner to the Demo class
        //A.B obj1=obj.new B();
        //or this way if the inner class is static.(initializers static can only be added in inner classes )
        A.B obj1=new A.B();
        obj1.show1();
    }
}
