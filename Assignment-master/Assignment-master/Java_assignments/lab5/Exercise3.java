package lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String args[]) {
		int n;
		int c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			c=0;
			for(int j=1;j<n;j++) {
				if(i%j==0)
					c++;
			}
			//System.out.println(c);
			if(c<=2)
				System.out.println(i);
		}
		
	}
}
