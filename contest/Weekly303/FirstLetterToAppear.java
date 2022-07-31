import java.util.*;
public class FirstLetterToAppear
{
    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> m = new HashMap<>();   

        for(char x : s.toCharArray())
        {
            if(m.containsKey(x))
            {
                return x;
            }
            else
            {
                m.put(x,1);
            }
        }
        return ' ';
    }
    public static void main(String []args)
    {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
}