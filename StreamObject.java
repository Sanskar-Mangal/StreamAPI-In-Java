import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamObject {
    public static void main(String[] arr){

        //Stream API - collection process
        //collection / group of object (object get)

        //1. blank stream

        Stream<Object> emptystream=Stream.empty();
        emptystream.forEach(e ->  {
            System.out.println(e);
        });


        //2. create string array(array, object, collection mai use kr skh the hai)
        String names[]={"Sanskar","piyush","keshav","rohit"};
        Stream<String> stream1=Stream.of(names);

        stream1.forEach(e -> {
            System.out.println(e);
        });



        //3. stream builder
        Stream<Object> streambuilder=Stream.builder().build();



        //4. stream array
        IntStream stream =Arrays.stream(new int[] {2,4,65,44,12});
        stream.forEach(e -> {
            System.out.println(e);
        });


        //5. list,set (object pr work kr tha hai)
        List<Integer> l2=new ArrayList<>();
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);

        Stream<Integer> stream3=l2.stream();
        stream3.forEach(e -> {
            System.out.println(e);
        });
//CREATE STREAM 5 TPES
        

    }
}
