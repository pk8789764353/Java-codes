public class printinincreasing {
    public static void printinincreasing(int n) {
        if(n==0)
        return;  
       printinincreasing(n-1);
          System.out.println(n);
   
   
       }
   
       public static void main(String[] args) {
   
           int n = 10;
           printinincreasing(n);
       }
}
