import java.util.*;

public class MatrixSum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the dimension of matrix:");
            System.out.print("Enter number of rows:");
            int r = input.nextInt();
            System.out.print("Enter number of columns:");
            int c = input.nextInt();
            Random random = new Random();
            ArrayList<Integer> list_rand = new ArrayList<Integer>();
            while(list_rand.size()<r*c) {
                int a = random.nextInt(5000);
                if (!list_rand.contains(a)) {
                    list_rand.add(a);
                }
            }
            int[][] matrix = new int[r][c];
            int arr = 0,sum=0;
            for(int i= 0; i<r; i++) {
                System.out.print("\n");
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = list_rand.get(arr);
                    arr++;
                    sum = sum + matrix[i][j];
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println("\n"+sum);
        }
}
