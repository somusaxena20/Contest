import java.util.*;
public class CountAstric {
    public static int countAsterisks(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(st.isEmpty() && ch == '|')
            {
                st.push('|');
                continue;
            }
            else if(ch == '|')
            {
                st.pop();
                continue;
            }
            
            if(st.isEmpty())
            {
                if(ch == '*')
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args)
    {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
}
