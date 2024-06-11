import java.util.Stack;

class Solution {
    public String answer(String str) {
        if(str.isEmpty()){
            return null;
        }
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            sb.append(' ');
        }
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == '(') {
                stk.push(i);
            } else if (str.charAt(i) == ')') {
                if (stk.isEmpty()) {
                    sb.setCharAt(i,'?');
                } else {
                    stk.pop();
                }
            }
        }
        //
        while (!stk.isEmpty()) {
            int pos = stk.pop();
            sb.setCharAt(pos, 'x');
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "bge)))))))))";
        System.out.println(input);
        System.out.println(solution.answer(input));
    }
}