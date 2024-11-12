package lab10;
interface Swimmable{
    void swim();
    void stopSwimming();
}
interface Flyable{
    void fly();
    void stopFlying();
}
interface Living{
    void live();
}
class Submarine implements Swimmable{
    String name;
    boolean swimming;
    public Submarine(String name){
        this.name = name;
    }
    public void swim() {
        if (!swimming){
            System.out.println("Submarine " + name + " is swimming");
            swimming = true;
        }
        else {
            System.out.println("Submarine " + name + " is still swimming");
        }
    }
    public void stopSwimming() {
        if (swimming){
            System.out.println("Submarine " + name + " stopped swimming");
            swimming = false;
        }
        else {
            System.out.println("Submarine " + name + " is not swimming");
        }
    }
}
class Duck implements Swimmable , Flyable , Living{
    String name;
    boolean swimming;
    boolean flying;
    boolean live;
    public Duck(String name){
        this.name = name;
    }
    public void swim() {
        if (!swimming){
            if (!flying){
                System.out.println("Duck " + name + " is swimming");
                swimming = true;
            }
            else {
                System.out.println("Duck " + name + " stopped flying and started swimming");
                swimming = true;
                flying = false;
            }
        }
        else {
            System.out.println("Duck " + name + " is already swimming");
        }
    }
    public void stopSwimming() {
        if (swimming){
            System.out.println("Duck " + name + " stopped swimming");
            swimming = false;
        }
        else {
            System.out.println("Duck " + name + " is not swimming");
        }
    }
    public void fly() {
        if (!flying){
            if (!swimming){
                System.out.println("Duck " + name + " is flying");
                flying = true;
            }
            else {
                System.out.println("Duck " + name + " stopped swimming and started flying");
                flying = true;
                swimming = false;
            }
        }
        else {
            System.out.println("Duck " + name + " is already flying");
        }
    }
    public void stopFlying() {
        if (flying){
            System.out.println("Duck " + name + " stopped flying");
            flying = false;
        }
        else {
            System.out.println("Duck " + name + " is not flying");
        }
    }
    public void live() {
        if (!live){
            System.out.println("Duck " + name + " born");
            live = true;
        }
        else {
            System.out.println("Duck " + name + " is already alive");
        }
    }
}
class Penguin implements Swimmable, Living{
    String name;
    boolean swimming;
    boolean live;
    public Penguin(String name){
        this.name = name;
    }
    public void swim() {
        if (!swimming){
            System.out.println("Penguin " + name + " is swimming");
            swimming = true;
        }
        else {
            System.out.println("Penguin " + name + " is still swimming");
        }
    }
    public void stopSwimming() {
        if (swimming){
            System.out.println("Penguin " + name + " stopped swimming");
            swimming = false;
        }
        else {
            System.out.println("Penguin " + name + " is not swimming");
        }
    }
    public void live() {
        if (!live){
            System.out.println("Penguin " + name + " born");
            live = true;
        }
        else {
            System.out.println("Penguin " + name + " is already alive");
        }
    }
}
public class ex3 {
    public static void main(String[] args) {
        Submarine submarine = new Submarine("Korablic");
        Duck duck = new Duck("Donald");
        Penguin penguin = new Penguin("Skipper");
        submarine.stopSwimming();
        submarine.swim();
        submarine.stopSwimming();
        duck.live();
        duck.live();
        duck.fly();
        duck.swim();
        duck.stopFlying();
        duck.stopSwimming();
        penguin.live();
        penguin.swim();
        penguin.live();
        penguin.swim();
    }
}
