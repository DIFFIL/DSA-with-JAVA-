package OOPS.Interface;

public class Car implements Engine,media{

    int a=55;

    @Override
    public void start() {
        System.out.println("car starts");
    }

    @Override
    public void stop() {
        System.out.println("car stops");
    }

    @Override
    public void acc() {
        System.out.println("car accelerate");
    }
}
