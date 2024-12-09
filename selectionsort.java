public class selectionsort {
    public static void selectionsort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
        
            for (int j = i+1; j < a.length ; j++) {
                if (a[i] > a[j ]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    

                }
            }
           
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 50,8090, 13, 16, 111, 400};
        selectionsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}
