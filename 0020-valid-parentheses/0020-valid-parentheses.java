import java.util.*;
// Approach -> Stack
class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') { // push the opening brackets to stack
                st.push(ch);
            }
            else {
                if(st.isEmpty()) { // there are no opening brackets and stack is empty
                    return false;
                }
                else if((st.peek() == '(' && ch == ')') // match the pair, if pair matches then pop the top
                        || (st.peek() == '[' && ch == ']') 
                        || (st.peek() == '{' && ch == '}')) {

                            st.pop();
                        }

                    else { // all condition not satisfied then 
                        return false;
                    }
            }
        }

        return st.isEmpty(); // if stack empty then it returns true otherwise false
    }
}