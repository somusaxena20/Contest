import java.util.*;

public class MaximumNumberOfPair
{
    public static  int[] numberOfPairs(int[] a) {
        int []t = new int[2];

        // if(a.length == 1)
        // {
        //     t[0] = 0;
        //     t[1] = 1;
        //     return t;
        // }
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i<a.length; i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i], m.get(a[i])+1);
            }
            else
            {
                m.put(a[i], 1);
            }
        }
        int pCount = 0, rCount = 0;

        for(Map.Entry<Integer, Integer> x : m.entrySet())
        {
            if(x.getValue() > 1)
            {
                if(x.getValue() % 2 == 0)
                {
                    pCount += x.getValue() / 2;
                }
                else
                {
                    pCount += x.getValue() /2;
                    rCount += x.getValue() % 2;
                }
            }
            else
            {
                rCount += 1;
            }
        }
        t[0] = pCount;
        t[1] = rCount;

        return t;
    }
    public static void main(String []args)
    {
        int []a = {0};
        System.out.println(Arrays.toString(numberOfPairs(a)));
    }
}