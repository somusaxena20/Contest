public class NumberOfZeroFilledSubarray {
    public static long zeroFilledSubarray(int[] a) {
        long r = 0,c = 0;

        for(int x : a)
        {
            if(x == 0)
            {
                c += 1;
            }
            else
            {
                r += (Math.pow(c,2)+c)/2;
                c = 0;
            }
        }
        r += (Math.pow(c,2)+c)/2;
        return r;
    }
    public static void main(String []args)
    {
        int []a = {0,0,0,2,0,0};
        // char []ch ={'a','b','c','a','d'}; 
        System.out.println(zeroFilledSubarray(a));
    }
}
