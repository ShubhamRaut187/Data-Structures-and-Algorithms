// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

import java.util.*;
class ValidParentheses{
    public static boolean isValid(String s, int N) {
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<N;i++){
            char ch = s.charAt(i);
            
            if(ch == '}' || ch == ']' || ch == ')'){
                if(st.empty()){
                    return false;
                }
                else{
                    if(ch == '}'){
                        if(st.peek() == '{'){
                            st.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else if(ch == ']'){
                        if(st.peek() == '['){
                            st.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        if(st.peek() == '('){
                            st.pop();
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
            else{
                st.push(ch);
            }
        }
        
        if(st.empty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Enter Length of String
        System.out.println("Enter Length of String: ");
        int N = sc.nextInt();
        System.out.println("Enter String: ");
        String str = sc.next();
        boolean ans = isValid(str,N);
        if(ans){
            System.out.println("String is valid !");
        }
        else{
            System.out.println("String is not valid !");
        }
    }
}