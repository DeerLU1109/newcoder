import java.util.ArrayList;

/**
 * @author jinlu
 * @create 2021-04-22 15:02
 */

/*
* 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
*  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
* */
public class JZ19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int t=0,l=0,r=matrix[0].length-1,d=matrix.length-1;
        ArrayList<Integer> res=new ArrayList<>();

        while (true){
            for (int i = l; i <= r; i++) {
                res.add(matrix[t][i]);
            }
            t++;
            if (t>d) break;
            for (int i = t; i <=d ; i++) {
                res.add(matrix[i][r]);
            }
            r--;
            if (l>r) break;
            for (int i = r; i >=l ; i--) {
                res.add(matrix[d][i]);
            }
            d--;
            if (t>d) break;
            for (int i = d; i >=t ; i--) {
                res.add(matrix[i][l]);
            }
            l++;
            if (l>r) break;
        }
        return res;
    }
}
