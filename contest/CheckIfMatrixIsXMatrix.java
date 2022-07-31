public class CheckIfMatrixIsXMatrix {
    public static boolean checkXMatrix(int[][] a) {
        int n  = a.length;

        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a[i].length; j++)
            {

                if(i == j && a[i][j] == 0)
                {
                    return false;
                }
                else if((i+j) == (n-1) && a[i][j] == 0)
                {
                    return false;
                }
                else if(i != j && (i+j) != (n-1) && a[i][j] != 0)
                         return false;
                
            }
        }

        return true;
    }
    //    [[5,0,0,1]
    //     [0,4,1,5]
    //     [0,5,2,0]
    //     [4,1,0,2]]

    // 2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2

    public static void main(String []args)
    {
        int [][]a = {{5,0,0,1},{0,4,1,5},{0,5,2,0},{4,1,0,2}};
        System.out.println(checkXMatrix(a));
    }
}
