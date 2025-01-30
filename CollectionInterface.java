import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//to sort the students we need to create a comparator to be able to sort by age by adding the comparator as a parameter to the sort collection method.
//However if you want the student to impliment the sorting Naturally like we did with the IntegerExample we will have to impliment Comparable in this student class like this
class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    //we have to define compare to method since we and implimenting the Comparator
    public int compareTo(Students that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }


}
//The Collection interface is part of the Java Collections Framework, and it's the root interface for many collection classes like List, Set, and Queue. It defines basic operations that any collection should have
public class CollectionInterface {

    public static void main(String[] args) {
        //a  comparator is used to sort list items
        //this comparator is working with the students Collection
        //Comparator<Students> student=(Students i ,Students j)->{
        //in labda expressions you dont need to spacify the type i.e
        Comparator<Students> student=(i ,j)->{
                /* if(i.age>j.age)
                return 1;
                else
                return -1; */
                return i.age>j.age?1:-1;

            };

        //this comparatotr is working with the Integer sorting
        //Comparator<Integer> comp=new Comparator<Integer>(){
        //   public int compare(Integer i ,Integer j){
        //       if(i%10>j%10)
        //      return 1;
        //      else
        //       return -1;

          //  }
       // };
        //we are usign Collection here and it a general root interface that you would use if you dont care about the specifics of teh collection it provides beasic collection sfunctionalitues
        //other interfaces that you can use in place of that are -List,Set ,Map,Queue.
        //Collection<Integer> nums= new ArrayList<Integer>();
        List<Students> students= new ArrayList<Students>();

        students.add(new Students(16, "Jeryne"));
        students.add(new Students(18, "John"));
        students.add(new Students(31, "Navin"));
        students.add(new Students(41, "Jane"));
        students.add(new Students(24, "Mary"));

        //we want to sort this one also using Comparable
        //Collections.sort(students,student);
        Collections.sort(students);
        for(Students stud:students){
            System.out.println(stud);
        }

        //List<Integer> nums= new ArrayList<Integer>();

        //nums.add(65);
        //nums.add(67);
        //nums.add(79);
        //nums.add(31);
        //i am going to use the comparator i just created to sort
        //Collections.sort(nums,comp);
        //System.out.println(nums);
        //since we have used the list we can now access some extra feature such as accessing array value using the inded , extra methods etc.
        //System.out.println(nums.indexOf(6));
        //for(int n :nums){
        //    System.out.println(n);
        //}
        //set-implimetend bu HashSet class.
        //its creates unique values and it doesnt follow the sequence. but we get the values
        //if we would want a sorted map we willl use TreeSet class
        Set<Integer> nums1=new HashSet<Integer>();

        nums1.add(6);
        nums1.add(6);
        nums1.add(7);
        nums1.add(3);
        //you could a so use iteraror method to iterate the items
        Iterator<Integer> values=nums1.iterator();
        //we have to use next() and hasNext() to get the value.
        while(values.hasNext()){
            System.out.println(values.next());
        }
        for(int n :nums1){
            System.out.println(n);
        }
        //map-store in ket=y value pair
        Map<String,Integer>  students1=new HashMap<>();
        students1.put("Jackon",56);
        students1.put("John",70);
        students1.put("Doe",44);
        students1.put("Kevin",80);
        //this wil basically update the key with that name.
        students1.put("Kevin",60);

        //System.out.println(students1);
        //printing values One by one
        for(String name:students1.keySet()){
            System.out.println(name +" : "+ students1.get(name) );
        }

    }
}