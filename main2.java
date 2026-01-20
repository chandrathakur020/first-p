import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr=new int[20];
        int even=0;
        int odd=0;

        System.out.println("Enter the 20 Element");
        for (int i = 0; i < 20; i++) {
         arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even count is" + even);
        System.out.println("Odd count is" + odd);

    }

    
}
