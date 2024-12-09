public class override extends override_1 {
    public static void main(String[] args) {
        override obj1 = new override();
        override_1 obj2 = new override_1();
        override_2 obj3 = new override_2();
        int p = obj1.add(7, 9);
        int q = obj3.add(7, 9);
        int w = obj2.add(7, 9);
        System.out.println("sum is:" + p);
        System.out.println("sum is:" + w);
        System.out.println("sum is:" + q);
    }
}
