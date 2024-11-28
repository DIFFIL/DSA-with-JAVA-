package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class hackerrank {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        List<String> queries=new ArrayList<>();

        stringList.add("aba");
        stringList.add("baba");
        stringList.add("aba");
        stringList.add("xzxb");

        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        
        int a=0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            for(int j=0;j<stringList.size();j++){
                if(queries.get(i)==stringList.get(j)){
                    a++;
                }
            }
            result.add(a);
            a=0;
    }

    System.out.println(result);
}
}
