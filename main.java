import java.util.Scanner;

class main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        a = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter b num");
        b = scan.nextInt();

        Scanner ssc = new Scanner(System.in);
        System.out.println("Enter c num");
        c = ssc.nextInt();

        double avg = (a + b + c) / 3;
        System.out.println("avg is " + avg);

        if (avg > 80)
            System.out.println("Enter Grade A");
        else if (avg >= 60 && avg <= 79)
            System.out.println("Enter Grade B");
        else
            System.out.println("Enter Faillll");
    }
}



    

