import java.util.Scanner;
public class add1 {
    public add1(){

    }
    public static void main(String[]args){
        int mat[][]=new int[3][3];
        
        
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter element ");
        mat[i][j]=scan.nextInt();
         System.out.println();

            }
        }
         System.out.println();
        for(int i =0 ; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j]+"\t");
            }
            
            System.out.println();
        }
        //for diagonal sum
        int sum=0;
        int sum1=0;
        for (int i=0;i<3;i++){
        
                
                sum=sum +mat[i][i];
            }
            for (int j=0;j<3;j++){
                sum1=sum1+mat[j][2-j];
            }
            System.out.println("sum of the diagonal is" + sum);
            System.out.println("sum of the  2 diagonal is" + sum1);
        }

    }
