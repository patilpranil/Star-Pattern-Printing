package com.pranil.alphabets;

public class AlphaJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         int n=20;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				if(i==1 && j>=n/2 || j==(3*n)/4  || i==n && j<=(3*n)/4 && j!=1 || j==1 && i>n/2 && i!=n ||
					i==n/2 && j<=n/3 && j!=1	) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
