
import java.util.Scanner;

public class Arae {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lenght=0.0;
		double width=0.0;
		double area=0.0;
	
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter lenght of th rectangle");
		
		lenght=reader.nextDouble();
		System.out.print("Enter width of the rectangle");
		
		width=reader.nextDouble();
		area=lenght*width;
		System.out.println("Area of rectangle:"+area);
		reader.close();
	}

}
