import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        String s = "([[()]]{}[()])";
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else{
                if(stack.isEmpty()){
                    valid = false;
                    break;
                }
                char lastOpen = stack.pop();
                if(lastOpen == '(' && c != ')'){
                    valid = false;
                    break;
                }else if(lastOpen == '[' && c != ']'){
                    valid = false;
                    break;
                }else if(lastOpen == '{' && c != '}'){
                    valid = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty()) valid = false;
        System.out.println(s+ " is valid: " + valid);
    }
}
