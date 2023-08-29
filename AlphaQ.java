package com.pranil.alphabets;

public class AlphaQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				if(i==1 && j<(3*n)/4 && j!=1  || j==1 && i<(3*n)/4 && i!=1 ||
						j==(3*n)/4 && i<=(3*n)/4 && i!=1 || i==(3*n)/4 && j<=(3*n)/4 && j!=1 ||
						i==j && i>=n/2   ) {
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
