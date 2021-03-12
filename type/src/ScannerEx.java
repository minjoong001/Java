import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("당신의 이름은 : ");
		name = sc.next();
		
		String city;
		System.out.print("당신의 도시는 : ");
		city = sc.next();
		
		int age;
		System.out.print("당신의 나이는 : ");
		age = sc.nextInt();
		
		double weight;
		System.out.print("당신의 체중은 : ");
		weight = sc.nextDouble();
		
		boolean single;
		System.out.print("당신의 독신여부는 : ");
		single = sc.nextBoolean();
		
		
		System.out.print("이름은 " +name +"이고 사는곳은 "+"이며 나이는 "+age +"살이고 몸무게는 "+weight + "kg이며 독신여부는 "+single );

	}

}
