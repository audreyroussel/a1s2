import java.util.Scanner;

public class equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("Rentrez a");
	    double a = scan.nextDouble();
	    System.out.println("Rentrez b");
	    double b = scan.nextDouble();
	    System.out.println("Rentrez c");
	    double c = scan.nextDouble();
	    double delta=(b*b)-(4*a*c);
	    if (delta>0){
	    	double sqrt = Math.sqrt(delta);
	        double x1=(-b+sqrt)/(2*a);
	        double x2=(-b-sqrt)/(2*a);
	        System.out.println("x1:");
	        System.out.println(x1);
	        System.out.println("x2:");
	        System.out.println(x2);
	    }
	    else if (delta==0){
	    	double x=-b/(2*a);
	    	System.out.println("x:");
	    	System.out.println(x);
	    }
	    else {
	    	System.out.println("pas de solutions dans R");
	    }
	}

}
