package BaekJoon;

import java.util.Scanner;

public class Ex_2884_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		int time = H*60+M-45;
		
		if(time<0) {
			System.out.println(23+" "+(time+60));
		}else {
			System.out.println(time/60+" "+time%60);
		}

	}

}
