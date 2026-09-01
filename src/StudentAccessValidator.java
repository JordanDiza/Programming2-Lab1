import java.util.Random;

// Part H
public class StudentAccessValidator {

    public static void main(String[] args) {
        System.out.println(isValidStudentId("V123456"));
        System.out.println(isValidStudentId("v123456"));
        System.out.println(isValidPassword("Vanier20"));
        System.out.println(isValidPassword("Vanier"));
        System.out.println(generateAccessCode());
        System.out.println(verifyAccessCode("12345", "12345", "password123", "password123", "ABC789", "ABC789"
        ));
    }

    public static boolean isValidStudentId(String id) {
        boolean sixDigit = false;
        int count = 0;

        if (id.startsWith("V"))
            for (int i = 0; i < id.length(); i++) {
                if (Character.isDigit(id.charAt(i)))
                    count++;
            }
          return count == 6;
        }



    public static boolean isValidPassword(String password) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        if (password.length() < 8)
            return false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                upper = true;
            else if (Character.isLowerCase(password.charAt(i)))
                lower = true;
            else if (Character.isDigit(password.charAt(i)))
                digit = true;
        }
        return upper && lower && digit;
    }

    public static String generateAccessCode() {
        String allowed = "ABC12";
        String code = "";
        int length = 5;
        Random rand = new Random();

        for (int i = 0; i < allowed.length(); i++) {
            int index = rand.nextInt(length);
            code += allowed.charAt(index);

        }
        return code;

    }

    public static boolean isValidAccess(String id, String password) {

        if (isValidStudentId(id) && isValidPassword(password)) {
            return true;
        }
        return false;
    }

    //Part I
    public static boolean verifyAccessCode(String studentID, String enteredID, String password, String enteredPassword, String generatedCode, String enteredCode) {

        boolean id = false;
        boolean pass = false;
        boolean code = false;
        if (studentID.equals(enteredID) && password.equals(enteredPassword) && (generatedCode.equals(enteredCode))) {
            return true;
        } else {
            return false;
        }
    }
}



 /*
 Part J
 1. No input
 2. Output is a randomly generated String
 3. Generate random Strings
 4. I dont know
 5. Add more characters like numbers or special characters such as the $
 6. The length of the allowed characters is less than the length needed for the code
  */

