package 区间k大数查询;
import java.util.*;

public class Main {

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
		int m = in.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		int[] k = new int[m];
		for (int i = 0; i < m; i++) {
			l[i] = in.nextInt();
			r[i] = in.nextInt();
			k[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < m; i++) {
			Arrays.sort(a,l[i]-1,r[i]);
			System.out.println(a[r[i]-k[i]]);
			for (int j = l[i]-1; j < r[i]; j++) {
				a[j] = arr[j];
			}
		}
		
	}

}
