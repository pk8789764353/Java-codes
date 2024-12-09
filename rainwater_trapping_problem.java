public class rainwatertrapping {
    
    public static int rainwater(int height[]) {

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // System.out.println("\n left");

        // for (int i = 0; i < height.length; i++) {
        //     System.out.print(" "+leftMax[i]);           
        // } 
        // System.out.println("\n right");

        // for (int i = 0; i < height.length; i++) {
        //     System.out.print(" "+rightMax[i]);            
        // }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int temp;
            temp = Math.min(leftMax[i], rightMax[i]);
            sum = sum + (temp - height[i]);
        }
        return sum;

    }

    public static void main(String[] args) {

        int height[] = {40, 2, 0,78, 90 , 6, 3, 2, 5,10};
        // rainwater(height);
        System.out.println("\nTotal water trap is : " + rainwater(height));
    }
    
}
