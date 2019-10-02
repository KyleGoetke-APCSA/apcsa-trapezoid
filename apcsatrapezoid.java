
import java.util.Scanner;

public class apcsatrapezoid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter a top: ");
		double top = in.nextDouble();
		System.out.printf("\nEnter a bottom: ");
		double bottom = in.nextDouble();
		System.out.printf("\nEnter a height: ");
		double height = in.nextDouble();
		double area = ((top + bottom) / 2) * height;
		System.out.printf("\nThe area of the trapezoid is %.1f.", area);

        in.close();
    }
}
