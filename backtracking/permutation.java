
public class permutation {
    public static void findPermutation(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
        }

        for(int i=0;i<s.length();i++)
        {
            char curr= s.charAt(i);
            String News=s.substring(0,i)+s.substring(i+1);
            findPermutation(News,ans+curr);

        }
    }
    public static void main(String[] args)
    {
        String s="abc";
        findPermutation(s,"");
    }

}
