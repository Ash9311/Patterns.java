package frloops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	
		int number=1;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		 {
			 for (int j=1;j<=(n-i);j++)
			 {
				 System.out.print(" ");
			 }
		 
		
		for(int j=1;j <= i;j++)
		 {
			 System.out.print(number+" ");
			 number++;
		 }
		 System.out.println();

	}

}
}
