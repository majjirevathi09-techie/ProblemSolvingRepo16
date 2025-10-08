class Solution {
    public boolean isValid(String s) {
       char[] charArray = s.toCharArray();
       Stack<Character> stack = new Stack<Character>();
       for(char current : charArray){
        if(current=='(' || current=='{' || current=='['){
            stack.push(current);
        }else {
            if(stack.isEmpty()){
                return false;
            }
              
                if
                    ((current==')'&& stack.peek()=='(') ||
                 (current== '}'&& stack.peek()=='{') ||
                 (current== ']'&& stack.peek()=='['))
                stack.pop();
                  else{
                    return false;
                }
            }
        }
               return stack.isEmpty();

       } 
    }
