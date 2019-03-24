package ÊıÁĞÌØÕ÷;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
		int max = a[0];int min = a[0];int sum = a[0];
		for (int i = 1; i < n; i++) {
			if (max < a[i])
				max = a[i];
			if(min > a[i])
				min = a[i];
			sum += a[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
