package frloops;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i,row=0,j;
		
		row=(2*n)-1;
		for(i=1;i<=row;i++)
		{
			if(i<=n) {
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
			else
			{
				for(j=1;j<=(row-i+1);j++)
				{
					System.out.print("* ");
				}
			}
				System.out.println();

	}

}
}