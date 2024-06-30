import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abc 
{
    public static void main(String[] args) throws IOException  
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in)); //Create a buffer for reading inputs
 
        System.out.print("Enter no of Rows and Cols (separated by space): ");
        String[] dimensions = reader.readLine().split(" ");//Create a buffer for reading no of columns and rows
        
        int noRows = Integer.parseInt(dimensions[0]);
        int noCols = Integer.parseInt(dimensions[1]);
        //Check the validity of the entered  no of columns and rows

        if (noRows <= 0 || noCols <= 0) 
        {
            System.out.println("Invalid input: Number of rows and columns must be positive integers.");
            return;
        }
        //Initialization of the grid

        boolean[][] grid = new boolean[noRows][noCols];

        //Read the inputs
        System.out.println("Enter the elements (seperated by space) : ");
        for (int i = 0; i < noRows; i++) 
        {
            String row = reader.readLine();
            for (int j = 0; j < noCols; j++) 
            {
                grid[i][j] = row.charAt(j) == '1';
            }
        }
        //Store the number of ways to reavh the destination

        int[][] dp = new int[noRows][noCols];
        //Initaializing the start point 

        dp[0][0] = 1;
        //Check all cells

        for (int i = 0; i < noRows; i++) 
        {
            for (int j = 0; j < noCols; j++) 
            {
            //If the current cell is not  1
                if (!grid[i][j]) 
                {
            // Add no of ways from above cell if it exists

                    if (i > 0) dp[i][j] += dp[i - 1][j];

            // Add no of ways from left cell if it exists

                    if (j > 0) dp[i][j] += dp[i][j - 1];
                }
            }
        }
        // Output the no of ways to the destination
        System.out.println("Number of paths to the destination : " + dp[noRows - 1][noCols - 1]);
    }
}

