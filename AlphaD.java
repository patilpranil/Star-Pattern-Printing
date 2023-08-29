package com.pranil.alphabets;

public class AlphaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=n;j++) {
				if( i==1 && j!=n || i==n && j!=n || j==n && i!=1 && i!=n || j==2  ) {
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
