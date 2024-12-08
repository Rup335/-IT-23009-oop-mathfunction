import java.util.Scanner;

public class Mathfun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + squareRoot);

        
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + power);

        System.out.print("Enter a number to find its absolute value: ");
        double negativeNumber = scanner.nextDouble();
        double absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is " + absoluteValue);

       
        System.out.print("Enter a decimal number to find its ceiling: ");
        double decimal = scanner.nextDouble();
        double ceiling = Math.ceil(decimal);
        System.out.println("Ceiling of " + decimal + " is " + ceiling);

        System.out.println("Generating a random number between 1 and 100");
        int scaledRandom = (int) (Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100 is " + scaledRandom);

        
        System.out.print("Enter the first side of the triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double b = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of a right triangle with sides " + a + " and " + b + " is " + hypotenuse);

        scanner.close();
    }
}
