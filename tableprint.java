import java.util.Scanner;
public class tableprint {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();

       for(int i=1;i<=10;i++)
       {
        System.out.print(a*i+" ");
       }
    }
}
