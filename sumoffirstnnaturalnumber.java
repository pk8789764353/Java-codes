import java.util.Scanner;

public class sumoffirstnnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k=0;
        for (int i = 0; i < p; i++) {
           k = k + i;

        }
        System.out.println(k);
    }
}
