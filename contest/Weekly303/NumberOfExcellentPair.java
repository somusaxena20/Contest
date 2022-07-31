public class NumberOfExcellentPair {

    public static long countExcellentPairs(int[] a, int k) {
        long count = 0;
        
        for(int i = 0; i<a.length-1; i++)
        {
            for(int j = i; j<=i+1; j++)
            {
                if(checkBit(a[i],a[j],k))
                {
                    if(a[i] == a[j])
                        count++;
                    else
                        count += 2;
                }
            }
        }


        return count;
    }

    static boolean checkBit(int a, int b, int k)
    {

        int bitC = Integer.bitCount(a | b);


        int bitD = Integer.bitCount(a & b);

        if( bitC + bitD >=k)
        {
            return true;
        }
        return false;
    }

    public static void main(String []args)
    {
        
        int []a = {1,2,3,1,536870911};
        System.out.println(countExcellentPairs(a,3));
    }
}
