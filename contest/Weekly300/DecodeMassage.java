package Weekly300;

import java.util.*;

public class DecodeMassage {
    public static String decodeMessage(String key, String m) {
        ArrayList<Character> l = new ArrayList<>();

        for (int i = 0, j = 0; j < 26; i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !l.contains(ch)) {
                l.add(j++, ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length(); i++) {
            char t = m.charAt(i);

            
                int ind = l.indexOf(t) % 26;

                sb.append((char) (97 + ind) + "");
            

        }
        
        return sb.toString().toString().replace('`',' ');
    }

    public static void main(String[] args) {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String msg = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        decodeMessage(key, msg);
    }
}
