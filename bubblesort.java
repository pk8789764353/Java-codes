public class bubblesort {
    public static void bubblesort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag++;

                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 50, 13, 16, 111, 400};
        bubblesort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}
