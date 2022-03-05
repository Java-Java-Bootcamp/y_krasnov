public class Animal {

    private String food;
    private String location;

    public Animal(){
    }

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void sleep() {
        System.out.println("It sleeps");
    }

    public void eat() {
        System.out.println("It eats");
    }

    public void makeNoise() {
        System.out.println("It makes noise");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}