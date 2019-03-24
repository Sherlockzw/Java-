package ²éÕÒÕûÊı;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int a = in.nextInt();
		in.close();
		int flag = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i]==a) {
				System.out.println(i+1);
				flag = 1;
				break;
			}
		}
		if(flag==0)
			System.out.println(-1);
	}

}
