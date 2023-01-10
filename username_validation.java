import java.util.Scanner;

import static java.lang.Character.isLetter;

public class username_validation {
    public static String CodelandUsernameValidation(String str) {

        int chars = str.length();

        if (chars < 4 || chars > 25 || str.charAt(str.length() - 1) == '_' || !isLetter(str.charAt(0))){
            str = "false";
        }
        else {
            str = "true";
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}
/* codeland username validation
* 1. the username is between 4 and 25 characters.
* 2. it must start with a letter.
* 3. it can only contain letters, numbers, and the underscore character.
* 4. it cannot end with an underscore character.
* */