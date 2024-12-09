public class buyandsellstocks {
    
   public static int maxProfit(int stocks[])
   {
    int buyprice=Integer.MAX_VALUE,max=0;
    for(int i=0;i<stocks.length;i++)
    {
        if(buyprice<stocks[i])
        {
            int profit=stocks[i]-buyprice;
            if (profit>max){
                max=profit;

            };

        }
        else{
            buyprice=stocks[i];
        }
    }
    return max;
   }
    public static void main(String[] args) {

        int stocks[] = {7,2,5,3,6,1111,4};
        System.out.println(maxProfit(stocks));
        
    }
}
