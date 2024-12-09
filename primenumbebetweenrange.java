import java.util.*;
public class primenumbebetweenrange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        while (n <= n1) {
            if (n == 1 || n == 0) {
                ++n;
            }
            int flag = 1;

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(n+ " ");
            }
            n++;
        }

    }

}
