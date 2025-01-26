public class Exceptions {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        //try catch block is a way of catching exceptions in java and  teh code int the try block wont run unless there is no isssue with the code otherwise if there is an error in  the code the the code in the catch blog will be executed ,
        //no matter the situation the code outside the try catch block will alsways be executed;
        int nums[]=new int[5];
        try {
            //trying to devide by zero we will get ArithmeticException and we catch it that way.
            j=18/i;
            //trying  to access this will thro an ArrayOutOfBoundException and we catch it that way
            System.out.println(nums[5]);
        }
        //this catch block as it is there are diffrent ways you can Catch multiple blog one is using if statement and then otehr one is using multiple catch blocks and this is how you use it.
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cannot Devide a number by Zero.");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry!, The array you are trying to access is is out of Bound.");
        }
        //When Chaining always makesure teh parent Exception is at teh bottom.
        catch(Exception e){
            //his part handles the exceptions that you are  not handling.
            System.out.println("Something Went wrong.");
        }
        System.out.println(j);
        System.out.println("Last Statement.");
    }
}

//What you need to know is that once an error occurs thats where the execution in a try block stops it doesn't continue.