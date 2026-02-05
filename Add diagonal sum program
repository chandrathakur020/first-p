import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {

         int mat[][]=new int[3][3];
        
        int i,j;
        int sum =0;
      Scanner scan = new Scanner(System.in);
        
      System.out.println("Enter element ");
        for(i=0;i<3;i++){
            
            for(j=0;j<3;j++){     
            
            mat[i][j]=scan.nextInt();
            }
        }
       //calculate the Diagonal sum
        for (i=0;i<3;i++)
        {
          sum =sum+mat[i][i]; 
          
         // sum= sum +mat[2-i][i]; (If you want the sum of both diagonal)
        }

        System.out.println("Sum of diagonal element="+sum);
    }
}


    

