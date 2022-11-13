import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rangeStart = sc.nextInt();
		int rangeEnd = sc.nextInt();
		
		int count = 0;
		
		for (int i=rangeStart; i<=rangeEnd; i++) {
			if (isRSANumber(i)) {
				count++;
			}
		}
		
		System.out.println("The number of RSA numbers between "+ rangeStart +" and " + rangeEnd + " is "+count);
	}

	private static boolean isRSANumber(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for (int i=1;i<=number;i++) {
			if (number % i == 0) {
				count++;
			}
		}
		
		return count==4;
	}

}
