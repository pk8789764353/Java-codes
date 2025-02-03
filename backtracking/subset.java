
public class subset {

    public static void findSubsets(String s, String ans, int i) {
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");

            } else {
                System.out.println(ans);
            }
            
            return;
        }
        //yes choice
        findSubsets(s,ans+s.charAt(i),i+1);
        //no choice
        findSubsets(s,ans,i+1);
    }

    public static void main(String[] args) {
        String s = "abc";
        findSubsets(s, "", 0);

    }

}
