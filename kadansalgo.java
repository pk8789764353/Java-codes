public class kadansalgo {
    
    public static void kadansalgo(int a[]) {
        int cs = 0;
        int ms = 0;
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                flag++;
            }
        }
        if (flag == a.length) {
            ms = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= ms) {
                    ms = a[i];
                }
            }
            System.out.print(ms);
        } else {
            for (int i = 0; i < a.length; i++) {
                cs = cs + a[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);

            }
            System.out.print(ms);
        }

    }

    public static void main(String[] args) {

        int a[] = {-1, -2, -11, -33, -20,9};
        kadansalgo(a);

    }

}
