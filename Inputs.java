//java Provides Diffrent ways that you can  get the user input lets talk about the different available ways.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws IOException {
        //1 way of getting user input.
        System.out.println("Enter A number.");

        //calling this one only throws an exception so we have to catch it. so lets use throws IOException.

        //int num= System.in.read();
        //now the problem with this is that it will return an ASCII of a numebr lets say if you wite zeor it returns its ASCII whitch is 48 ,also when you lets say  write a bigger number like 45 it return 52 because it aonly captures the 4 so it reads like a single text the prints so you have to loop throght to get a propper out put  .
        //System.out.println(num);
        //2 way of getting user input ,using buffer reader.
        InputStreamReader in =new InputStreamReader(System.in);
        //when using the buffer reader it trys to acces the input stream reader. and a buffer reader can take the input from anywhere,file network etc.
       //BufferedReader bf=new BufferedReader(null);

        //int num2=Integer.parseInt (bf.readLine());
        //System.out.println(num2);
        //when you reading from recourses like files you need to close those resource using this line.
        //bf.close();

        //3. Getting input using a Scanner.
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(num);
    }
}
