import java.util.*;
public class MyAgeIs{
public static void main(String[] args) {
	
	Scanner kb = new Scanner(System.in);
	int yearOfBirth = kb.nextInt();
	int currentyear = 2020;
	int age  = currentyear - yearOfBirth;

	System.out.print("Your age is " + age);

}



}