import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BracketsExpressionValidator {
    public static boolean validate(String expression){

        Stack<Character> stack = new Stack<>();
        Set<Character> closingBrackets = Set.of(')',']','}','>');
        Map<Character, Character> closeBracketToOpenBracket = Map.of(
                ')', '(',
                '}', '{',
                ']', '[',
                '>', '<'
        );

        for(var ch : expression.toCharArray()){
            if(closingBrackets.contains(ch)){
                if(stack.empty() || stack.peek() != closeBracketToOpenBracket.get(ch)){
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
