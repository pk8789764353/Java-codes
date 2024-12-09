public class reverseanarray {
    
    public static void reversearray(int a[])
    {
        int first=0,last=a.length-1,temp;
       while(first<last)
        {
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;last--;
        }
      
       
        System.out.println();
 
    }
   

    public static void main(String[] args) {
        
       int a[]={1,2,11,33,20};
       reversearray(a);
       for(int i=0;i<5;i++)
       {
        System.out.print(a[i]+" ");
       }
}
}
