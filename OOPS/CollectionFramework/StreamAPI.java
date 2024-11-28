package OOPS.CollectionFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {


        List<Integer> num= Arrays.asList(32,55,67,88,31);
        int data= num.stream().filter(integer->{
            for (int i = 2; i < integer - 1; i++) {
                if (integer % i == 0)
                    return false;
            }
                    return true;
        }).map(n->n+1).reduce(0,(c,e)->c+e);

        System.out.println(data);
//        Collections.sort(num);
    }
}
