package BeakJoon_;

import java.util.Scanner;

public class Ex_2884_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H==0) {
			H=23;
			M=M+60-45;
			H+=M/60;
			M=M%60;
			System.out.println(H+" "+M);
		}else if(H>0 && H<=24) {
			H--;
			M=M+60-45;
			H+=M/60;
			M=M%60;
			System.out.println(H+" "+M);
		}
	}

}
