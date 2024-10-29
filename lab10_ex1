package lab10;
abstract class Creature{
    String name = null;
    boolean isAlive = false;
    abstract void bear();
    abstract void die();
    abstract void isAlive();

    void shoutName(){
        if (name == null){
            System.out.println("Error");
        }
        else{
            System.out.println(name);
        }
    }

}
class Human extends Creature{
    public Human(String name){
        this.name = name;
    }
    void bear() {
        System.out.println("The human " + name + " was born");
        isAlive = true;
    }
    void die(){
        System.out.println("The human " + name + " has died");
        isAlive = false;
    }
    void isAlive() {
        if (isAlive){
            System.out.println("The human " + name + " is alive");
        }
        else{
            System.out.println("The human " + name + " is not alive");
        }
    }
}
class Dog extends Creature{
    public Dog(String name){
        this.name = name;
    }
    void bark(){
        System.out.println("The dog " + name + " is barking");
    }
    void bear() {
        System.out.println("The dog " + name + " was born");
        isAlive = true;
    }
    void die(){
        System.out.println("The dog " + name + " has died");
        isAlive = false;
    }
    void isAlive() {
        if (isAlive){
            System.out.println("The dog " + name + " is alive");
        }
        else{
            System.out.println("The dog " + name + " is not alive");
        }
    }
}
class Alien extends Creature{
    public Alien(String name){
        this.name = name;
    }
    void bear() {
        System.out.println("The alien " + name + " was born");
    }
    void die(){
        System.out.println("The alien " + name + " has died");
    }
    void isAlive() {
        if (isAlive){
            System.out.println("The alien " + name + " is alive");
        }
        else{
            System.out.println("The alien " + name + " is not alive");
        }
    }
}
public class ex1 {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[3];
        Creature human = new Human("John");
        Creature dog = new Dog("Akdus");
        ((Dog) dog).bark();
        Creature alien = new Alien(null);
        creatures[0] = human;
        creatures[1] = dog;
        creatures[2] = alien;
        for (int i = 0; i < 3; i++){
            creatures[i].bear();
            creatures[i].isAlive();
            creatures[i].die();
            creatures[i].isAlive();
            creatures[i].shoutName();
        }

    }
}
