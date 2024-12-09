public class constructor {
    public static void main(String[] args){
    constructor obj=new constructor(3,4);
    constructor obj2=new constructor();
    constructor obj1=new constructor("priyanshu",'A');
   

    }
    public constructor()
    {
        System.out.println("This is a default constructor.");
    }
    public constructor(int a,int b)
    {
        System.out.println("sum="+(a+b));
    }
    public constructor(String name ,char rank ){
        System.out.println("Name and rank is:"+name+" "+rank);
    }
}
