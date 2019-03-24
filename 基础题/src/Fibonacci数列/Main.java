package Fibonacci数列;
import java.util.*;
import java.math.*;

/*
 * 问题描述
Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

输入格式
输入包含一个整数n。
输出格式
输出一行，包含一个整数，表示Fn除以10007的余数。
说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。

样例输入
10
样例输出
55
样例输入
22
样例输出
7704
数据规模与约定
1 <= n <= 1,000,000。
 */
public class Main {
	
	static long mod = 10007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//长度不够，OJ会出错
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
