/**
 * @author jinlu
 * @create 2021-04-21 15:54
 */
public class JZ02 {
    public String replaceSpace (String s) {
        StringBuilder res=new StringBuilder(s);
        if (s.length()==0) return "";
        else {
            for (int i = 0; i+1 < res.length(); i++) {
                if (res.charAt(i)==' '){

                    res=res.replace(i,i+1,"%20");
                }
            }
            if (res.charAt(res.length() - 1) == ' ') {
                res.deleteCharAt(res.length()-1);
                res.append("%20");
            }
        }


        return res.toString();
    }
}
