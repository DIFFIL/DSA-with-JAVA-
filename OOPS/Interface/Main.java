package OOPS.Interface;


public class Main {
    public static void main(String[] args) {

        Spacecraft fly=new Spacecraft();
        Airplane fly2=new Airplane();
        Helicopter fly3=new Helicopter();


        fly.fly_obj();
        fly2.fly_obj();
        fly3.fly_obj();

        Car car=new Car();
        System.out.println(car.a);
        car.acc();
        car.start();
        car.stop();
    }
}
