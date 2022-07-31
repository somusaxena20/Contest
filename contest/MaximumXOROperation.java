public class MaximumXOROperation {
    public static int maximumXOR(int[] nums) {
        int res = 0;
        for (int a: nums)
            res |= a;
        return res;
    }

    public static void main(String []args)
    {
        int []a = {3,2,4,6};
        System.out.println(maximumXOR(a));
    }
}
