package com.pranil.alphabets;

public class AlphaE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				if(j==1 || i==1 || i==n || i==n/2 && j<=(3*n)/4) {
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
