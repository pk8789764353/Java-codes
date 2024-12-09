public class linearsearch {
    public static int linearsearch(String a[],String j)
    {
        for (int i=0;i<a.length;i++)
        {
            if (a[i]==j)
            {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        String a[]={"hj","ghf","hgfh","hgf","gyy"};
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        String k="ghf";
        int l=linearsearch(a,k);
        System.out.println(l);



        
        }
}
