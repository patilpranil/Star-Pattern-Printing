package com.pranil.alphabets;

public class AlphaB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
//				if(i==1 && j<(3*n)/4 || j==1 || i==n && j!=n ||
//						i==n/2 && j!=n || i>n/2 && j==n && i!=n || j==(3*n)/4 && i<n/2  ) {
//					System.out.print("*");
//				}
				if(i==n && j!=n || i==n/2 && j!=n || i==1 && j<(3*n)/4 ||
						j==1 || j==(3*n)/4 && i!=1 && i<=n/2 || j==n && i>=n/2 && i!=n ) {
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
