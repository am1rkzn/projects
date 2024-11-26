package lab14;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        Work_with_Array obj = new Work_with_Array();
        obj.f();
    }
}
class Work_with_Array{
    public void f(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(-2);
        list1.add(-3);
        list1.add(5);
        list1.add(6);
        list1.stream()
                .map(number -> Math.abs(number))
                .filter(number -> number % 3 == 0)
                .forEach(System.out::println);
    }
}
