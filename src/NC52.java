import java.util.Stack;

/**
 * @author jinlu
 * @create 2021-04-16 11:20
 */
public class NC52 {
    public boolean isValid (String s) {
        int l=s.length();
        if (l%2!=0) return false;

        Stack<String> stack=new Stack<>();
        for (int i = 0; i < l; i++) {
            if (s.substring(i,i+1).equals("{")||s.substring(i,i+1).equals("[")||s.substring(i,i+1).equals("(")){
                stack.push(s.substring(i,i+1));
            }
            if (s.substring(i,i+1).equals("}")||s.substring(i,i+1).equals("]")||s.substring(i,i+1).equals(")")){
                if (stack.isEmpty()) return false;
                switch (s.substring(i,i+1)){
                    case "}":
                        if (stack.peek().equals("{")) {
                            stack.pop();
                            break;
                        }
                        else  return false;
                    case "]":
                        if (stack.peek().equals("[")) {
                            stack.pop();
                            break;
                        }
                        else  return false;
                    case ")":
                        if (stack.peek().equals("(")) {
                            stack.pop();
                            break;
                        }
                        else  return false;
                }

            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
