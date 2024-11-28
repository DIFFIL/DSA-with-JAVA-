package OOPS.LambdaFunction;

import java.sql.SQLOutput;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class question {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("What","Is","Up");

        Stream<String> data=words.stream().map(n->n.toLowerCase());
        data.forEach((System.out::println));
        Stream<String> data2=words.stream().map(n->n.toUpperCase());
        data2.forEach(System.out::println);







    }


}
