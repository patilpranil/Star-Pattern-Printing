package com.pranil.alphabets;

public class AlphaL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n/4 || i==n || i==1 && j<n/2 || j==n && i>(3*n)/4) {
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
