import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//The Collection interface is part of the Java Collections Framework, and it's the root interface for many collection classes like List, Set, and Queue. It defines basic operations that any collection should have
public class CollectionInterface {

    public static void main(String[] args) {
        //we are usign Collection here and it a general root interface that you would use if you dont care about the specifics of teh collection it provides beasic collection sfunctionalitues
        //other interfaces that you can use in place of that are -List,Set ,Map,Queue.
        //Collection<Integer> nums= new ArrayList<Integer>();
        List<Integer> nums= new ArrayList<Integer>();

        nums.add(6);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        //since we have used the list we can now access some extra feature such as accessing array value using the inded , extra methods etc.
        System.out.println(nums.indexOf(6));
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
        Map<String,Integer>  students=new HashMap<>();
        students.put("Jackon",56);
        students.put("John",70);
        students.put("Doe",44);
        students.put("Kevin",80);
        //this wil basically update the key with that name.
        students.put("Kevin",60);

        System.out.println(students);
        //printing values One by one
        for(String name:students.keySet()){
            System.out.println(name +" : "+ students.get(name) );
        }
    }
}