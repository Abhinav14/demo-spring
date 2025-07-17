package leetcode;

import java.util.Stack;

//Check if the given string is valid parantheses or not. Valid parantheses is [{()}]
public class ValidParatheses {
    private static boolean isValidParantheses(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();
        for(Character c : charArr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                char open = stack.pop();
                if(c == ')' && open != '('){return false;}
                if(c == '}' && open != '{'){return false;}
                if(c == ']' && open != '['){return false;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParantheses("[{()}]"));
    }
}
