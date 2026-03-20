import java.io.*;
import java.util.Scanner;
public class string3 {
    
    public static void main(String ab[])throws IOException
    {
    
      Scanner sc = new Scanner(System.in);
     
     int  n,i,j;
     System.out.println("enter total count of the string");
     n=Integer.parseInt(sc.nextLine());
     
     String Str[]=new String[n];
     
     
     
      for(i=0;i<n;i++)
      {  System.out.println("");
        System.out.println("Enter the String"); 
        
        Str[i]=sc.nextLine();
        
        
      }
     
     for(i=0;i<n;i++)
     {
        System.out.println("String No:" + (i+1) + " : " + Str[i]);
        
        for(j=0;j<Str[i].length();j++)
            
        {
           System.out.println(Str[i].charAt(j)); 
        }
        
        
        
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    
}