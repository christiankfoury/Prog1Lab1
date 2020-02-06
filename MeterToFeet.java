import java.util.*;
public class MetersToFeet{
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter a value in meters");
	double meters = kb.nextInt();
	double feet = meters * 3.2808399;

	System.out.print("1.0 meter = 3.2808399 feet " + meters + " meters "  +  " = " + feet + " feet ");
}
}
