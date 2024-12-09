public class insertionsort {
    public static void insertionsort(int a[]) {

        for (int i = 1; i < a.length ; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;

        }

    }

    public static void main(String[] args) {

        int a[] = {1, 2, 50, 8090, 13, 16, 111, 400};
        insertionsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}
