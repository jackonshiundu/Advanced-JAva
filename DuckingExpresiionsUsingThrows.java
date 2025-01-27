//you basically use this if you have some other code handling the exceptios like a parent to the child
//it usage is shown here.
class A{
    //in this case A is not hanle that  ClassNotFoundException so it throws it for teh main function to handle it
	public void show() throws ClassNotFoundException
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

		Class.forName("Calc");
	}
}
public class DuckingExpresiionsUsingThrows {
    public static void main(String[] args) {
        A obj=new A();
        //exception being habdle here
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
            //we use printStackTrace() so that prints the stack trace of the exception to the console, showing the sequence of method calls that led to the exception, which helps in debugging by identifying where the error occurred in the code.
    		e.printStackTrace();
    	}
    }
}
