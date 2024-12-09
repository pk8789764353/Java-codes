public class decimaltobinary {
    public static int dectobin(int n)
    {
       int bin=0;
       int i=0;
       int rem;
       while(n>0)
       {
        rem=n%2;
        bin=bin+((int)Math.pow(10,i))*rem;
        i++;
        n=n/2;
       }
       return bin;
    }

    public static void main(String[] args) {
        System.out.println(dectobin(9));

       
    }
}
