package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class Ex_14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if((x>0 && y>0) && x!=0 && y!=0) { //x양수 y양수
			System.out.println("1");
		}else if((x<0 && y>0) && x!=0 && y!=0) { //x음수 y양수
			System.out.println("2"); 
		}else if((x<0 && y<0) && x!=0 && y!=0) {//x음수 y음수
			System.out.println("3");
		}else if((x>0 && y<0) && x!=0 && y!=0) {
			System.out.println("4");
		}
		

	}

}
