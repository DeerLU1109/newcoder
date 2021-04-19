/**
 * @author jinlu
 * @create 2021-04-19 14:38
 */
public class NC17 {//对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。给定字符串A以及它的长度n，请返回最长回文子串的长度。
    public int getLongestPalindrome(String A, int n) {


            char[] aa =A.toCharArray();
            int max=1;
            boolean[][] dp = new boolean[n][n];
            for(int i=0;i<n;i++){
                dp[i][i] = true;
            }
            for(int i=1;i<n;i++)//i指向的是字符的最后一位
                for(int j=i-1;j>=0;j--){//j指向的是字符的前部。
                    if(i-j==1){//当两个指针靠近时，直接判断
                        dp[j][i]=(aa[i]==aa[j]);
                        if(max<i-j+1)
                            max = i-j+1;
                    }

                    else{
                        if(dp[j+1][i-1]&&aa[i]==aa[j]){
                            dp[j][i]=true;
                            if(max<i-j+1)
                                max = i-j+1;
                        }
                        else
                            dp[j][i]=false;
                    }
                }
            return max;

    }


    public int getLongestPalindrome2(String A, int n) {//自己暴力想法
        int max=0;
        if (n==0) return 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i+1; j <A.length() ; j++) {
                if (palindrome(A.substring(i,j))){
                    int l=j-i+1;
                    max=Math.max(max,l);
                }
            }
        }
        return max;
    }
    public boolean palindrome(String s){
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1))
                return false;
        }
        return true;
    }
}
