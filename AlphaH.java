package com.pranil.alphabets;

public class AlphaH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==n/2) {
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
