package Array;
import java.util.*;
import java.util.ArrayList;

public class Arr_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    ArrayList<Integer> list=new ArrayList<>();
    // list.add(32);
    // list.add(34);
    // list.add(35);
    // list.add(756);
    // list.add(56);

    for (int i = 0; i < 4; i++) {
        list.add(sc.nextInt());
    }
    
    for (int i = 0; i < 4; i++) {
        System.out.println(list.get(i));                    //1st way to print
    }
    
    System.out.println(list);                               //2nd way to print 
    


    
    sc.close();
    }



}
