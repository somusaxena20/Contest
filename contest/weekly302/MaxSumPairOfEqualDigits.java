import java.util.*;

public class MaxSumPairOfEqualDigits {
    public static int digiSum(int n) {
        int count = 0;
        while (n != 0) {
            count += n % 10;
            n = n / 10;
        }
        return count;
    }

    public static void maximumSum(int[] a) {
        // int maxSum = Integer.MIN_VALUE;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i+1; j < a.length; j++) {
        //         if (digiSum(a[i]) == digiSum(a[j])) {
        //             maxSum = Math.max(a[i] + a[j], maxSum);
        //         }
        //     }
        // }
        // return maxSum <= Integer.MIN_VALUE ? -1 : maxSum;


        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i<a.length; i++)
        {
            m.put(i, digiSum(a[i]));
        }

        for(Map.Entry<Integer, Integer> x : m.entrySet())
        {
            System.out.println(x.getKey() +" "+x.getValue());
        }

    }

    public static void main(String[] args) {
        int[] a = {18,43,36,13,7};
        maximumSum(a);
    }
}
