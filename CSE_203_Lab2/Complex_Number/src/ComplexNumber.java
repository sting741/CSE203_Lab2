
 public class ComplexNumber {
 
     public static void main(String[] args) {
         Complex cp1 = new Complex(4, 7);
         Complex cp2 = new Complex(3, 4);
         Complex result = cp1.Plus(cp2);
         result.Output();
         result = cp1.Minus(cp2);
         result.Output();
         result = cp1.Multiply(cp2);
         result.Output();
     }
 }