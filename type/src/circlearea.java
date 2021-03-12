
public class circlearea {

	public static void main(String[] args) {
		
			final double Pi = 3.14;
			double radius = 10.2;
			double circlearea = radius * radius * Pi;
			double circlecir = 2 * radius * Pi ;
				
			System.out.printf("원의 반지름 = %.2f" , radius);
			System.out.printf("원의 면적 = %.2f" , circlearea);
			System.out.printf("원의 둘레 = %.2f" , circlecir);

	}

}
