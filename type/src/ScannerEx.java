import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("����� �̸��� : ");
		name = sc.next();
		
		String city;
		System.out.print("����� ���ô� : ");
		city = sc.next();
		
		int age;
		System.out.print("����� ���̴� : ");
		age = sc.nextInt();
		
		double weight;
		System.out.print("����� ü���� : ");
		weight = sc.nextDouble();
		
		boolean single;
		System.out.print("����� ���ſ��δ� : ");
		single = sc.nextBoolean();
		
		
		System.out.print("�̸��� " +name +"�̰� ��°��� "+"�̸� ���̴� "+age +"���̰� �����Դ� "+weight + "kg�̸� ���ſ��δ� "+single );

	}

}
