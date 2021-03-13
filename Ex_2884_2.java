package BeakJoon_;


import java.util.Scanner;

public class Ex_2884_2 {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		//System.out.println(a);
		
		if(H>0) {
			H= H-1;
			M= M+60-45;
			H+=(M/60);
			M= M%60; 
		}else {
			H= 24;
			M= M+60-45;
			H += (M/60);
			M= M%60; 
		}
		System.out.println(H+" "+M);
		
	}

}
