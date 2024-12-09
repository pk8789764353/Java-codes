public class printindecreasingusingrecursion {
    public static void printindecreasing(int n) {
        if (n >= 0) {
            System.out.println(n);

            printindecreasing(n - 1);
        }

    }

    public static void main(String[] args) {

        int n = 10;
        printindecreasing(n);
    }
}
