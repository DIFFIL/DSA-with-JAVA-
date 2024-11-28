package OOPS.Multithreading;

public class Table {
    public synchronized void PrintTable(int n){

        for (int i = 1; i <=10 ; i++) {
            System.out.println(n*i);
        }
    }
}
