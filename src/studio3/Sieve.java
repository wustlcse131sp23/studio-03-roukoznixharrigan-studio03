package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n = ");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n+1];
		for (int k =0; k <n+1; k++) {
			sieve[k]=true;
		}
		int i = 0;
		for ( i=2; i<= n/2; i ++)
		{
			for (int p=2; p<= n/i; p++ )
			{
				sieve[p*i] = false;
			}
			}
		for (int j = 2; j<=n; j++)
		{
			if (sieve[j] == true)
			{
				System.out.println(j);
			}
		}
		}
	
	}


