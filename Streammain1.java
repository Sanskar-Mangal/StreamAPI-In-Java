//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Streammain1{
public static void main(String[] args) {
    
    //Create a LIST and filter the even number 

    List<Integer> l1=List.of(2,3,4,5,6,7,8,9);

    // List<Integer> l2=new ArrayList<>();
    // l2.add(2);
    // l2.add(3);
    // l2.add(4);
    // l2.add(5);
    // l2.add(6);
    // l2.add(7);
    // l2.add(8);
    // l2.add(9);

   // List<Integer> l3 = Arrays.asList(2,3,4,5,6,7,8,9);

    //print even number l1 without stream api

    List<Integer> listeven=new ArrayList<>();

    for(Integer i:l1){
        if(i%2==0){
            listeven.add(i);
        }
    }

    System.out.println(l1);
    System.out.println(listeven);

    //USING STREAM API
    System.out.println("USING STREAM API");
    Stream<Integer> stream = l1.stream();  //Stream is a interface, object toh nahi bna skh the but get kr skh the hai
    List<Integer> newList= stream.filter(i -> i%2 == 0).collect(Collectors.toList());


    //2 line ko ek line mai likh skh the hai 

    List<Integer> newList2=l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

    System.out.println(newList);
    System.out.println("TYPE2");
    System.out.println(newList2);


    //create a program output number greater than 4
    System.out.println("Example 2");
    List<Integer> newList3=l1.stream().filter(i -> i>3).collect(Collectors.toList());
    System.out.println(newList3);


 }
}