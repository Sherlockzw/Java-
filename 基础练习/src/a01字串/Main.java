package a01�ִ�;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0,d=0,e=0;
		while(a!=2) {
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
			System.out.println(e);
			e++;
			if(e==2) {
				e=0;
				d++;
				if(d==2) {
					d=0;
					c++;
					if(c==2) {
						c=0;
						b++;
						if(b==2) {
							b=0;
							a++;
						}
					}
				}
			}
		}
	}

}
