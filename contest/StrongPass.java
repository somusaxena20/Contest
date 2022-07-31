public class StrongPass {
    public static boolean strongPasswordCheckerII(String s) {

        if (s.length() < 8)
            return false;
        boolean lower = false, upper = false, digit = false, special = false, adjacent = true;

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 65 && ch <= 90)
            {
                upper = true;
            }
            if (ch >= 97 && ch <= 122)
            {
                lower = true;
            }

            if (ch >= 48 && ch <= 57)
            {
                digit = true;
            }

            if ((ch >= 33 && ch <= 47) || ch == 64 || ch == 94)
            {
                special = true;
            }

            if(i > 0 && ch == s.charAt(i-1))
            {
                adjacent = false;
                return adjacent;
            }
        }
        
        if(lower && upper && digit && special && adjacent)
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        String password = "-Aa1a1a1";
        System.out.println(strongPasswordCheckerII(password));
    }
}