import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] arr){

        //filter(predicate)
        //boolean value function
        //e -> e>10 agr ek line hai toh nhi toh { }

        //MAP (function) -> value return
        //each element operation[like ek list hai uss mai se har ek element ka square krna ho toh]

        List<String> names=List.of("Sanskar","Aman","Ankit","Keshav");
        //filter out krna hai jo name a se start ho rhe ho

        List<String> newNames=names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);


        //USING FOR EACH
        System.out.println("Display USING FOR EACH PRINT");
        names.stream().forEach(
            e -> {
                System.out.println(e);
            }
        );
        
        System.out.println("Operation USING FOR EACH PRINT");
        newNames.stream().forEach(System.out :: println);


        //MAP example

        List<Integer> numbers=List.of(3,5,4,1,6,7,8,9);
        List<Integer> newnumbers=numbers.stream().map(i -> i*i).collect(Collectors.toList());
        //stream ko collect kr rha hai collect method- collectors list mai convert kr rha
        System.out.println(newnumbers);


        //Sorted
        System.out.println("Sorted method USE");
        // List<Integer> n=numbers.stream().sorted().collect(Collectors.toList());
        // System.out.println(n);
        numbers.stream().sorted().forEach(System.out :: println);

        //Min
        System.out.println("Minimum number");
        Integer integer=numbers.stream().min((x,y )-> x.compareTo(y)).get();
        System.out.println("Min" +integer);


        //Max
        System.out.println("Max number");
        Integer integer2=numbers.stream().max((x,y )-> x.compareTo(y)).get(); //jada data nhi hai isliye get use kiya hai
        System.out.println("Max" +integer2);

    }
}
