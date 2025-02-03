
public class backtracking_in_array {

    public static void backtrack(int a[], int i, int val) {
        if (i == a.length) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
            return;
        }
        a[i] = val;
        backtrack(a, i + 1, val + 1);
        a[i] -= 2;

    }

    public static void main(String[] args) {
        int[] a = new int[5];
        backtrack(a, 0, 1);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");

        }

    }
}
