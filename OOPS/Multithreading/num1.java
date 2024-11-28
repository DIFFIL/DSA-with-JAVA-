package OOPS.Multithreading;

import java.awt.print.Printable;

public class num1 extends Thread {
//    Table num;
//    num1(Table num){
//        this.num=num;
//    }

    public void run(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(n*i);
        }
//        num.PrintTable(5);
    }
}
