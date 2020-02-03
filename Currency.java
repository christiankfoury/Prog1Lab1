import java.util.*;
public class Currency{
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the amount of CAD");
    double cad = kb.nextDouble();

    double usd = cad * 0.76;
    double eur = cad * 0.68;

    System.out.println(cad + " $CAD = " + cad + " $CAD ");
    System.out.println(cad + " $CAD = " + usd + " $USD ");
    System.out.println(cad + " $CAD = " + eur + " €EUR ");

    }
}