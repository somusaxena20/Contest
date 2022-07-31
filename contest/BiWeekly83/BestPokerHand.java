package BiWeekly83;

import java.util.*;
public class BestPokerHand {

    public static String bestHand(int[] a, char[] ch) {
        
        HashMap<Integer, Integer> m = new HashMap<>();
        HashMap<Character, Integer> n = new HashMap<>();

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
            if(n.containsKey(ch[i]))
            {
                n.put(ch[i], n.get(ch[i])+1);
            }
            else
            {
                n.put(ch[i], 1);
            }
        }

        if(n.get(ch[0]) == 5)
        {
            return "Flush";
        }
        
        for(Map.Entry<Integer, Integer> e : m.entrySet())
        {
            if(m.get(e.getKey()) >= 3)
            {
                return "Three of a Kind";
            }
            else if(m.get(e.getKey()) >= 2)
            {
                return "Pair";
            }
        }

        return "High Card";

    }
    public static void main(String []args)
    {
        int []a = {10,10,2,12,9};
        char []ch ={'a','b','c','a','d'}; 
        System.out.println(bestHand(a,ch));
    }
}
