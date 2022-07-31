import java.util.Arrays;

public class SuccesfullPair{
    public static int[] successfulPairs(int[] s, int[] p, long sc) {
        int []a = new int [s.length];
        int count = 0;
        int []t = new int[p.length];
        for(int i = 0; i<s.length; i++)
        {
            t = p.clone();
            count = 0;
            for(int j = 0; j<p.length; j++)
            {
                t[j] = s[i] * p[j];
                if(t[j] >= sc)
                    count ++;
            }
            a[i] = count;
        }

        return a;
    }
    public static void main(String []args)
    {
        int []a = {3,1,2};
        int []b = {8,5,8};
        System.out.println(Arrays.toString(successfulPairs(a,b,16l)));
    }
}