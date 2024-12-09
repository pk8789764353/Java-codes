import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int n1=0,n2=1,n3;
         System.out.print(n1+" "+n2);
         for(int i=1;i<a-1;i++)
         {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
         }
         
        //  System.out.println(c);
       
    }
}
