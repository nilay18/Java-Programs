import java.util.Scanner;

public class Rotate_Matrix {
	static int N;
	//Rotating matrix K times clockwise on diagonals.
	static void rotate_90_diagonals(int[][] mat, int k)
	{
		for(int K =1;K<=k;K++)
		{
		for(int i =0;i<N+1/2;i++)
		{
			for( int j =i;j<N-i;j++)
			{
				if(i==j || i-N == j) continue;		
				int temp = mat[i][j];
				mat[i][j] = mat[N-j][i];
				mat[N-j][i] = mat[N-i][N-j];
				mat[N-i][N-j] = mat[j][N-i];
				mat[j][N-i] = temp;
				
			}
		}
		}
		printMatrix(mat);
	}
	
	static void printMatrix(int[][] mat)
	{
		for(int i=0;i<=N;i++)
		{
			for(int j =0;j<=N;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int[][] mat = { {1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
						{21,22,23,24,25}};
		
		Scanner sc = new Scanner(System.in);
		N = mat.length-1;
		System.out.println("Enter the number to times to rotate Matrix along Diagonals: ");
		int k = sc.nextInt();
		rotate_90_diagonals(mat,k);
	}
}
