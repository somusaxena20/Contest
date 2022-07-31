public class MakeArrayZero
{
    public static int minimumOperations(int[] a) {
        int count = 0;

        for(int i = 0; i<a.length; i++)
        {
            if(findMin(a) == Integer.MAX_VALUE)
            {
                return count;
            }
            else
            {
                int min = findMin(a);
                for(int j = 0; j<a.length; j++)
                {
                    if(a[j] != 0)
                    {
                        a[j] = a[j] - min;
                    }
                    
                }
                count++;
            }
        }
        return count;
    }
    public static int findMin(int []a)
    {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<a.length; i++)
        {
            if(a[i] != 0 && a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String []args)
    {
        int []a = {0};
        System.out.println(minimumOperations(a));
    }
}