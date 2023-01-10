import java.util.Stack;

public class StackChecker {
    public StackChecker() {
    }

    public static boolean checkStr(String input) {

        Stack<String> s = new Stack<String>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '[':
                case '(':
                case '{':
                    s.push( input.charAt(i)+""   );
                    break;
                case ']':
                    if (s.pop().toCharArray()[0] != '[') {
                        System.out.println("[]Error at i : " + i);
                        return false;
                    }

                    break;
                case ')':
                    char x = s.pop().toCharArray()[0];
                    System.out.println(x);
                    if (x != '(') {
                        System.out.println("()Error at i : " + i);
                        return false;
                    }
                    break;
                case '}':

                    if (s.pop().toCharArray()[0] != '{') {
                        System.out.println("{}Error at i : " + i);
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!s.isEmpty()) {
            System.out.println("Error missing brackets!!");
            return false;
        }
        return true;

    }

}
