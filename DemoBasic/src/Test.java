
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int n, sum = 0, temp, r;

		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		temp = n;
		while (temp > 0) {
			r = temp % 10;
			sum = sum + r * 10; // 0+1*10 = 10 10+7*10 = 170 170*3+10
			temp = temp / 10;

		}

		if (n == sum) {
			System.out.println("Armstrong Number");
		} else {
			
			System.out.println(" not Armstrong Number");
		}
	}

}
