import java.util.Scanner;
public class string {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        String data=new String("Hello");
        System.out.println(data);
        System.out.println("Enter the string");
        String name=sc.nextLine(); //input from user
        System.out.println( data +" " + name);

        // if (name.equalsIgnoreCase(name)) {
           // System.out.println("Strings are Same");
        //} else {
            //System.out.println("Strings are not Same");
       // }

         int l =name.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if (name.equalsIgnoreCase(rev)) {
            System.out.println("Strings are pallindrome");
        } else {
            System.out.println("Strings are not pallindrome");
        }
    }
    
}
