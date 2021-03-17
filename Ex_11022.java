package BeakJoon_;

import java.io.*;
import java.util.StringTokenizer;

public class Ex_11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T= Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+(i+1)+": " +a+" + "+b+" = "+(a+b)+"\n" );
		}
		bw.close();
		br.close();
	}

}