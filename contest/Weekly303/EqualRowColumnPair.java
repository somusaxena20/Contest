public class EqualRowColumnPair {
    public static int equalPairs(int[][] a) {
        int count = 0;
        for(int i = 0; i<a.length; i++)
        {
            count += match(a,a[i]);
        }
        return count;
    }

    public static int match(int [][]a, int []t)
    {
        int count = 0;
        for(int i = 0; i<a.length; i++)
        {
            boolean flag = false;
            for(int j = 0; j<a[i].length; j++)
            {
                if(t[j] != a[j][i])
                {
                    flag = true;
                }
            }

            if(!flag)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] a = { {3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2} };
        System.out.println(equalPairs(a));
    }
}
