class A extends Thread{
    //every thread must have this run method
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
//it is not advisable to inherit threads instead impliment Runnable
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}

public class MyThreads {
    public static void main(String[] args) {
        A obj1=new A();
        Runnable obj2=new B();

        //Since we changed the B object to runnable we have to  do this to make sure the start() runs the threads.
        //runnable don't have methods.
        Thread t1=new Thread(obj2);
        //how to start a thread
        t1.start();
        obj2.start();
    }
}
