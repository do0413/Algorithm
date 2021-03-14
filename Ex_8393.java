package BeakJoon_;

import java.io.*;

public class Ex_8393 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		for(int i=1; i<n+1; i++) {
			num += i;
		}
		bw.write(String.valueOf(num));
		
		br.close();
		bw.close();
		
	}

}
