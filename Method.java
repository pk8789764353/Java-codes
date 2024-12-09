// First method
// public class Method {
//     public static void main(String[] args)
//     {
//         int s= Sum(4,5);
//         System.out.println("The sum is:"+s);
//     }
//     public static int Sum(int a,int b)
//     {
//         return a+b;
//     }
// }

// Second method
public class Method {
    public static void main(String[] args) {
        Method n = new Method();
        int s = n.add(5, 8);
        System.out.println("The sum is:" + s);
    }

    public int add(int a, int b) {
        return a + b;
    }
}