package ×ÖÄ¸Í¼ÐÎ;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				System.out.print((char)('A'+Math.abs(i-j)));
			}
			System.out.println();
		}
	}

}
