public class Polymorphism {
    public static void main(String[] args){
        Polymorphism obj1= new Polymorphism();
        int a=obj1.add();
        int b=obj1.add(3,45);
        System.out.println("First sum is:"+a);
        System.out.println("Second sum is:"+b);
    }
    public int add()
    {
        int a=9,b=90;
        return a+b;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
