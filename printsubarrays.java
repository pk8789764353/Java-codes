
public class printsubarrays {

    static int l = 0;
    static int arr[] = new int[15];
    public static void findmin()
    {
        int min=arr[0];
        for(int i=0;i<15;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest sum is : "+min);

    }
    public static void findmax()
    {
        int max=arr[0];
        for(int i=0;i<15;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest sum is : "+max);

    }

    public static void passsum(int sum) {

        if (sum >= 0) {
            arr[l] = sum;
            l++;
        }

    }

    public static void subarray(int a[]) {
        int n;
        n = ((a.length) * (a.length + 1)) / 2;
        int arr[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                    sum = sum + a[k];
                }
                System.out.print("sum = " + sum);
                passsum(sum);

                System.out.println();

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 0, 11, 33, 20};
        subarray(a);
        findmin();
        findmax();

    }
}
