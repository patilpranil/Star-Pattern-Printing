package com.pranil.alphabets;

public class AlphaR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		
		for(int i=1;i<=n;i++) {
			for(int j=n/2;j<=n;j++) {
				
				if(j==n/2 || i==1 && j!=n || i==n/2 && j!=n || j==n && i<n/2 && i!=1 || i==j) {
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
