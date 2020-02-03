import java.util.*;
public class Rectangle{
public static void main(final String[] args) {
    
    final Scanner kb = new Scanner(System.in);
   
    System.out.println("Enter the length of the rectangle: ");
    final double length = kb.nextDouble();
    
    System.out.println("Enter the width of the rectangle: ");
    final double width = kb.nextDouble();

    final double area = length * width;
    final double perimeter = 2 * length + 2 * width;

    System.out.println("The area of the rectangle is " + area + " units" );
    System.out.print("The perimeter of the rectangle is " + perimeter + " units");
}
}
