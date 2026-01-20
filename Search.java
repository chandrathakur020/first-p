import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Value is present");
        } else {
            System.out.println("Value is Not present");
        }

    }

        
    }
    

