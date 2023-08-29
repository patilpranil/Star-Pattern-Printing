package com.pranil.alphabets;

public class AlphaK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n=20;
		
		for(int i=1;i<=n;i++) {
			for(int j=n/2;j<=n;j++) {
				if(j==n/2 || i==j || (i+j)==n+1 ) {
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
