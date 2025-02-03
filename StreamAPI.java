//The Stream API in Java is a feature that allows you to process sequences of elements (such as collections) in a functional style, enabling operations like filtering, mapping, and reducing in a concise and readable way.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
        //sorted
        Stream<Integer> s4=s3.sorted();
        //on this line we are using the reduce method from stream to add the sum  of all the values in the list.
        //int result=s3.reduce(0,(acc,curr)->acc+curr);
        //in this line i am using the forEach to loop throught the strea
        s4.forEach(n->System.out.println(n));

        //parallel Stream
        //for you to work with it you have to have a huge number so lets create.

        List <Integer> numbers=new ArrayList<Integer>(10000);

        Random rand=new Random();

        for (int i =1;i<=10000;i++){
            numbers.add(rand.nextInt(100));
        }
        //int sum=numbers.stream().map(n->n*2).reduce(0,(c,e)->c+e);

        //sequencial
        //recording the start time for a sequencial stream  in startseq variable
        long startseq=System.currentTimeMillis();
        int sum=numbers.stream().map(i->{
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return i*2;
        }).mapToInt(i->i).sum();

        long endSeq=System.currentTimeMillis();


        //parallel
        long startpara=System.currentTimeMillis();

        int sum1=numbers.parallelStream().map(i-> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return i*2;
        }).mapToInt(i->i).sum();
        //recording the start time for a parallel stream  in endpara variable
        long endpara=System.currentTimeMillis();
        //printing the summation output of the two streams
        System.out.println(sum);
        System.out.println(sum1);
        //trying to compare whitch one is faster
        System.out.println("seq ->"+(endSeq-startseq));
        System.out.println("par ->"+(endpara-startpara));
        //As from teh output above parallel stream takes less time so o=its always recommended when working with Big Data use paralell Streams
    }
}
