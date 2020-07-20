import java.util.Scanner;
import java.util.Stack;

public class StringCharacters {

    public boolean stringCharacter(String exp) {

        if (exp.length() % 2 == 1) {
            return false;
        }


        Stack<Character> stack = new Stack();
        for (char c : exp.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {

                if (stack.empty()) {
                    return false;
                }
                Character top = stack.pop();
                if ((top == '(' && c != ')') || (top == '{' && c != '}')
                        || (top == '[' && c != ']')) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        StringCharacters s = new StringCharacters();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        String str = scanner.next();

        if (s.stringCharacter(str)) {
            System.out.println(str);
            System.out.println(true);
        } else {
            System.out.println(str);
            System.out.println(false);
        }
    }
}