
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps grunt");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats chow");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog barks woof!");
    }
}