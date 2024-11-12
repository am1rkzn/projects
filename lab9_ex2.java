package lab9;

abstract class Shapes{
    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
}
class triangle extends Shapes{
    double m1;
    double m2;
    double m3;
    public triangle(double m1,double m2,double m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    @Override
    protected double calculatePerimeter(){return m1 + m2 + m3;}
    @Override
    protected double calculateArea(){
        double p = ((m1 + m2 + m3)/2);
        return (Math.sqrt(p*(p-m1)*(p-m2)*(p-m3)));
    }
}
class circle extends Shapes{
    double r;
    public circle(double r){
        this.r = r;
    }
    @Override
    protected double calculatePerimeter(){return 2 * Math.PI * r;}
    @Override
    protected double calculateArea(){return Math.PI * r * r;}
}
class rectangle extends Shapes{
    double m1;
    double m2;
    public rectangle(double m1, double m2){
        this.m1 = m1;
        this.m2 = m2;
    }
    @Override
    protected double calculatePerimeter(){return 2*(m1 + m2);}
    @Override
    protected double calculateArea(){return m1 * m2;}
}
class ellipse extends Shapes{
    double r1;
    double r2;
    public ellipse(double r1, double r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    protected double calculatePerimeter(){
        return 2 * Math.PI * Math.sqrt(((r1*r1) + (r2*r2))/2);
    }
    @Override
    protected double calculateArea(){return Math.PI * r1 * r2;}
}
class square extends Shapes{
    double m1;
    public square(double m1){
        this.m1 = m1;
    }
    protected double calculatePerimeter(){return 4 * m1;}
    protected double calculateArea(){return m1*m1;}
}
public class ex2 {
    public static void main(String[] args) {
        triangle t1 = new triangle(3.0,4.0,5.0);
        System.out.println(t1.calculatePerimeter());
        square s1 = new square(60.0);
        System.out.println(s1.calculateArea());
    }
}
