package Recursion;

public class RemoveDupllicate {
    public static void printNewString(String character, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == character.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = character.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            printNewString(character, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            printNewString(character, idx + 1, newStr.append(currentChar), map);
        }

    }

    public static void main(String[] args) {
        // boolean hey[]=new boolean{26};
        int k[] = { 3 };
        String character = "mangomanog";
        printNewString(character, 0, new StringBuilder(""), new boolean[26]);

    }

}
