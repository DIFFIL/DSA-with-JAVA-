package OOPS.LambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2{
    public static void main(String[] args) {

        List<String> sentence= Arrays.asList("ayush","pratap");

        Stream<String> data=sentence.stream().map(n->n.toUpperCase());
        data.forEach(n->System.out.println(n));





    }
}
