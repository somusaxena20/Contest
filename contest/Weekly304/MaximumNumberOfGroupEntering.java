import java.util.*;

public class MaximumNumberOfGroupEntering {
    public static int maximumGroups(int[] a) {
        int count = 0;

        Arrays.sort(a);

        int i = 0, j = 0;
        // int prevMax = 0;
        // int prevSize = 0;
        int size = 1;
        // int sum = 0;
        
        while(j < a.length)
        {
            if(j - i + 1 == size)
            {
                count++;
                j++;
                i = j;
                size++;
            }
            else
            {
                j++;
            }
        }
        return count;

    }
    public static void main(String []args)
    {
        int []a = {2,31,41,31,36,46,33,45,47,8,31,6,12,12,15,35};
        System.out.println(maximumGroups(a));
    }
}
