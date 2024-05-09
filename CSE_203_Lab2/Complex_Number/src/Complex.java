import java.util.*;

public class Complex {

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number a:");
        a = sc.nextDouble();
        System.out.println("Input number b:");
        b = sc.nextDouble();
    }
    
    public void Output(){
        System.out.println(a + " + " + b + "i" );
    }
    
    public Complex Plus(Complex cp){
        double resultA = this.a + cp.getA();
        double resultB = this.b + cp.getB();
        return new Complex(resultA, resultB);
    }
    
    public Complex Minus(Complex cp){
        double resultA = this.a - cp.getA();
        double resultB = this.b - cp.getB();
        return new Complex(resultA, resultB);
    }
    
    public Complex Multiply(Complex cp){
        double resultA = this.a * cp.getA();
        double resultB = this.b * cp.getB();
        double resultC = this.a - cp.getB();
        double resultD = this.b - cp.getA();
        return new Complex((resultA-resultB), (resultC+resultD));
    }
}