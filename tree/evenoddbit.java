public class evenoddbit{
    public static void evenodd(int n)
    {
        if((n & 1)==0)
        System.out.println("No. is even");
        else System.out.println("no is odd");

    }
public static void main(String[] args) {
    int n=10254;
    evenodd(n);
    
}
}