public class biggestnoinarray {
    public static int big(int a[])
    {
        int b=a[0];
        for (int i=0;i<a.length;i++)
        {
            if (a[i]>b)
            {
                b=a[i];
            }
        }
        return b;

    }

    public static void main(String[] args) {
        
        int a[]={8,5,4,90,444};
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int l=big(a);
        System.out.println(l);



        
        }
}
