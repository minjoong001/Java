import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;		int b;
		
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a , b ,a + b );
		System.out.printf("%d - %d = %d\n", a , b ,a - b );
		System.out.printf("%d * %d = %d\n", a , b ,a * b );
		System.out.printf("%d / %d = %.2f\n", a , b ,(double) a / b );
				

	}

}
