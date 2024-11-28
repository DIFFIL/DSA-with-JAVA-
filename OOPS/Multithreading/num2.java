package OOPS.Multithreading;

import java.awt.print.Printable;

public class num2 extends Thread {
    Table num;
    int n;


    num2(Table num,int n){                    //constructor
        this.num=num;
        this.n=n;
    }

    public void run(){
        num.PrintTable(n);
    }
}
