package Fibonacci����;
import java.util.*;
import java.math.*;

/*
 * ��������
Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��

��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�

�����ʽ
�������һ������n��
�����ʽ
���һ�У�����һ����������ʾFn����10007��������
˵�����ڱ����У�����Ҫ��Fn����10007���������������ֻҪ���������������ɣ�������Ҫ�ȼ����Fn��׼ȷֵ���ٽ�����Ľ������10007ȡ������ֱ�Ӽ������������������ԭ����ȡ��򵥡�

��������
10
�������
55
��������
22
�������
7704
���ݹ�ģ��Լ��
1 <= n <= 1,000,000��
 */
public class Main {
	
	static long mod = 10007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//���Ȳ�����OJ�����
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int s1 = 1,s2 = 1;
		if(n >= 3) {
			for(int i = 3;i <= n;i++) {
				s2 = s1 + s2;
				s1 = s2 - s1;
			}
		}
		System.out.println(s2%10007);
		 */
		
		/*
		Scanner in = new Scanner(System.in);
		long N = in.nextLong(); 
		BigInteger S2 = BigInteger.valueOf(1);
		BigInteger S1 = BigInteger.valueOf(0);
		for(int i = 2;i <= N;i++){
			S2 = S2.add(S1);
			S1 = S2.subtract(S1);
		}
		
		String.valueOf(mod);
		BigInteger b = BigInteger.valueOf(mod);
		b = S2.remainder(b);
		System.out.println(b);
		*/
		
		int[] f = new int[1000001];
		f[1] = f[2] = 1;
		for(int i = 3; i<= 1000000; i++)
			f[i] = (f[i-1] + f[i-2]) % 10007;
		Scanner in = new Scanner(System.in);
		System.out.println(f[in.nextInt()]);
		in.close();
	}
}
