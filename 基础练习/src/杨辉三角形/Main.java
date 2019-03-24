package Ñî»ÔÈý½ÇÐÎ;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=0;
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i][0] = 1;
			System.out.print(arr[i][0]+" ");
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
