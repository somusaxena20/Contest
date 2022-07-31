import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SpiralMatrix4 {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];

        for (int[] x : matrix)
            Arrays.fill(x, -1);

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (head != null && rowBegin <= rowEnd && colBegin <= colEnd) {
            
            for (int j = colBegin; j <= colEnd; j++) {
                matrix[rowBegin][j] = head.val;

                if(head.next != null)
                    head = head.next;
                else
                    break;
            }
            rowBegin++;

            
            for (int j = rowBegin; j <= rowEnd; j++) {
                matrix[j][colEnd] = head.val;
                if(head.next != null)
                    head = head.next;
                else
                    break;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    matrix[rowEnd][j] = head.val;

                if(head.next != null)
                    head = head.next;
                else
                    break;
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    matrix[j][colBegin] = head.val;
                if(head.next != null)
                    head = head.next;
                else
                    break;

                }
            }
            colBegin++;
        }
        return matrix;
    }
//     9
// 6
// [995,348,36,516,333,627,248,422,13,225,764,311,405,695,698,83,145,783,478]
    // 3,0,2,6,8,1,7,9,4,2,5,5,0
    public static void main(String[] args) {
        ListNode head = new ListNode(3,new ListNode(0,new ListNode(2,new ListNode(6,new ListNode(8,new ListNode(1,new ListNode(7,new ListNode(9,new ListNode(4,new ListNode(2,new ListNode(5,new ListNode(5,new ListNode(0)))))))))))));
        int [][]a = spiralMatrix(3,5,head);
        for(int x[] : a)
        {
            System.out.println(Arrays.toString(x));
        }
    }
}
