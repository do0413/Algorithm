package BeakJoon_;

import java.util.Scanner;

public class Ex_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A<B) {
			System.out.print("<");
		}else if(A>B) {
			System.out.print(">");
		}else {
			System.out.println("==");
		}
		
	}

}
