class A implements Runnable{
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
class  Counter {

    int count;
    public synchronized void increment(){
        count++;
    }

}

public class MyThreads {
    public static void main(String[] args) {
        A obj1=new A();
        Runnable obj2=new B();
        Counter one=new Counter();
        //in this case i am trying to explai the concept of race condition where we have more that obe runnable or thread depending on a resource the count vaiable in this content
        //so basically the expected aoutput should print diffren values as teh count values because basically the could be accessing the sma e rource at the same time and you will find that this will result to it beign updated only once to solve this we add synchronized before the method name then there will be some synchronization.
        Runnable obj3=()->{
            for(int i=0;i<10;i++){
                one.increment();
            }
        };
        Runnable obj4=()->{
            for(int i=0;i<10;i++){
                one.increment();
            }
        };
        //Since we changed the B object to runnable we have to  do this to make sure the start() runs the threads.
        //runnable don't have methods.
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);
        //how to start a thread
        //t1.start();
        //t2.start();
        t3.start();
        t4.start();

        System.out.println(one.count);
    }
}
