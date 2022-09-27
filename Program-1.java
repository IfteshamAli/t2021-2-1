import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	
	  String typeofoperation;
	   Double a, b, result;
       Scanner scan=new Scanner(System.in);
       System.out.println("Choose an operator: +, -, *, or /");
	    typeofoperation= scan.next();

	    System.out.println("Enter first number");
	    a = scan.nextDouble();

	    System.out.println("Enter second number");
	    b = scan.nextDouble();

	    switch (typeofoperation) {

	      case "+":
	        result = a + b;
	        System.out.println(a + " + " + b + " = " + result);
	        break;

	      case "-":
	        result = a - b;
	        System.out.println(a + " - " + b+ " = " + result);
	        break;

	      case "*":
	        result = a * b;
	        System.out.println(a+ " * " + b + " = " + result);
	        break;
	        
	      case "/":
	        result = a / b;
	        System.out.println(a + " / " + b + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    scan.close();
	}
}

