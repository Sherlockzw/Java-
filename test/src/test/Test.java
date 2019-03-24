package test;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			a[i] = arr[i];
		}
		Arrays.sort(a,0,n-1);
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println(sort);
	}
}