package BeakJoon_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_2884 {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int H = Integer.parseInt(br.readLine());
//		int M = Integer.parseInt(br.readLine());
		//System.out.println(a);
		Scanner sc = new Scanner(System.in);
		 
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
 
		int time = H*60+M-45;
 
		if(H==0) {
			time = 24*60+M-45;
			System.out.println(23+" "+(time%60));
		}else if(H>0 && H<=23){
 
			System.out.println(time/60+" "+time%60);
		}
		
	}

}
