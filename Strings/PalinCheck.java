
public class PalinCheck {

    public static boolean checkIspalindrome(String name) {

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String name = "mam";
        boolean isTrue = checkIspalindrome(name);
        System.out.println(isTrue);
    }
}
