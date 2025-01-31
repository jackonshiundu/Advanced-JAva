//The Stream API in Java is a feature that allows you to process sequences of elements (such as collections) in a functional style, enabling operations like filtering, mapping, and reducing in a concise and readable way.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        //We are creating a list using List Interface
        List<Integer> nums= Arrays.asList(3,76,89,8,47,4);

        //given such a list we have diffrent ways we vcan iterate that list we can use a for loop or enhanced for loop.
        //another way we can iterate is by use of methods provided by Stream API to iterate and do diffrent types of manipulation to the array.
        //so this code will basically print n because the for each loop basically iterates each value in the nums list , then give teh parameter o the consumer interface  whitch then pases that value to the accept method on the Consumer interface , inside the accept we are basically printing teh value. but you can do more that just printing.
        //so we use stream ethod to create like a cone of the nums array and now when we mani[pulate this way it cant in no way interfear with the original nums datastructure.]
        Stream<Integer> s1=nums.stream();
        //once you use a stream you cannot re-use it.
        //in this code i am using the filter method to filter out the even numbers.
        Stream<Integer> s2=s1.filter(n->n%2==0);
        //in this line i am using the forEach to loop throught the strea
        Stream<Integer> s3=s2.map(n->n*2);
        //on this line we are using the reduce method from stream to add the sum  of all the values in the list.
        int result=s3.reduce(0,(acc,curr)->acc+curr);
        System.out.println(result);
        //in this line i am using the forEach to loop throught the strea
        //s3.forEach(n->System.out.println(n));


    }
}
