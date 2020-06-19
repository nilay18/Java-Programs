import java.util.*;

public class amazonTruck {
	
	static int destrow = -1;
	static int destcol = -1;
	public static int minDistance(int row,int col,ArrayList<ArrayList<Integer>> input)
	{
		int[][] distance = new int[row][col];
        for (int[] rows: distance)
            Arrays.fill(rows, Integer.MAX_VALUE);
        int[] start = {0,0};
        distance[start[0]][start[1]] = 0;
		int[][] mat = new int[row][col];
		for(int i =0;i<row;i++)
		{
			System.out.println();
			for(int j =0;j<col;j++)
			{
				mat[i][j] = input.get(i).get(j);
				System.out.print(" "+mat[i][j]+" ");
				if(mat[i][j] == 9)
				{
					destrow = i;
					destcol = j;
				}
			}
		}
		System.out.println(destrow +" "+destcol);
		dfs(mat, start, distance);
		for(int i =0;i<row;i++)
		{
			System.out.println();
			for(int j =0;j<col;j++)
			{
				System.out.print(" "+distance[i][j]+ " ");
			}
		}
		return distance[destrow][destcol] == Integer.MAX_VALUE ? -1 : distance[destrow][destcol];
	}
	
	public static void dfs(int[][] maze, int[] start, int[][] distance) {
        int[][] dirs={{0,1}, {0,-1}, {-1,0}, {1,0}};
        for (int[] dir: dirs) {
            int x = start[0] + dir[0];
            int y = start[1] + dir[1];
            int count = 0;
            while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && (maze[x][y] == 1 || maze[x][y]==9)) {
                x += dir[0];
                y += dir[1];
                count++;
                if (distance[start[0]][start[1]] + count < distance[x - dir[0]][y - dir[1]]) {
                    distance[x - dir[0]][y - dir[1]] = distance[start[0]][start[1]] + count;
                    dfs(maze, new int[]{x - dir[0],y - dir[1]}, distance);
                }
            }
            
        }
    }
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> t = new ArrayList<>();
		t.add(1);
		t.add(0);
		t.add(0);
		input.add(t);
		t = new ArrayList<>();
		t.add(1);
		t.add(0);
		t.add(0);
		input.add(t);
		t = new ArrayList<>();
		t.add(1);
		t.add(9);
		t.add(1);
		input.add(t);
		System.out.println(minDistance(input.size(),input.get(0).size(),input));
		
	}
}
