class Solution {
    public int evalRPN(String[] tokens) {
 Stack<Integer> s = new Stack<>();
        int result = 0;

        for (String token : tokens){

            if (token.equals("+")){
                int i = s.pop();
                int j =s.pop();
                result = i + j;
                s.push(result);
            } else if (token.equals("-")){
                int i = s.pop();
                int j =s.pop();
                result = j - i;
                s.push(result);
            } else if (token.equals("*")){
                int i = s.pop();
                int j =s.pop();
                result = i * j;
                s.push(result);
            } else if (token.equals("/")){
                int i = s.pop();
                int j =s.pop();
                result = j / i;
                s.push(result);
            }

            else{
                int x = Integer.parseInt(token);
                s.push(x);
            }

        }

        return s.peek(); // Placeholder return to ensure code compiles
    }
}
