package lab9;
class Animal{
    protected String name;
    protected int height;
    protected int weight;
    protected String color;
    public Animal(String name,int height, int weight, String colour){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = colour;
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void sleep(){
        System.out.println(name + " is sleeping. do not wake it up.");
    }
    void makeSound(){System.out.println();}
}
class cow extends Animal{
    public cow(String name, int height, int weight, String colour){
        super(name,height,weight,colour);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is making mu.");
    }
}
class cat extends Animal{
    public cat(String name, int height, int weight, String colour){
        super(name,height,weight,colour);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is doing meow");
    }
}
class dog extends Animal{
    public dog(String name, int height, int weight, String colour){
        super(name,height,weight,colour);
    }

    @Override
    void makeSound() {
        System.out.println(name + " is barking");
    }
}
public class ex1 {
    public static void main(String[] args) {
        cow cow1 = new cow("Murka",95,125,"white");
        cat cat1 = new cat("Barsik", 25,10,"black");
        dog dog1 = new dog("Rex", 50,25,"brown");
        cat1.eat();
        dog1.makeSound();
        cow1.sleep();
    }
}
