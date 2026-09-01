import java.util.Random;

/*
Question 3 Part A
A1: True, true, true, true
A2: charAt(i) is used to get every letter one at the time from the String password. Located a i
A3: We use < and not <= because int i is initialized at 0. Vanier2026 is 10 word. If we use <= it will get the 10 word which is nothing.
A4: If password were null, it wont work since theres nothing to go throught
A5: Yes VANIER2026 would work.if int i < than the length of VANIER2026,it will store that character into char c then it would increment by 1 to hget the next letter of the password.
it is uppercase so upper will be true. lower will the false. digit will be true.so the system will print upper and digit. lower will remain will be null.
So it will be true, false, true.
A6:Yes it would work. It the same process as the other thing but upper will return false and digit true.

 */

public static void main(String[] args) {

    System.out.println(countDigits("Vanier2026"));
    System.out.println(isValidPassword("Vanier2026"));
    System.out.println(isValidPassword("Vanier"));
    System.out.println(isValidPassword(null));
    System.out.println(isValidPassword("VANIER2026"));
    System.out.println(CountUpperCase("Vanier2026"));
    System.out.println(generateCode());
}

// Part B


public static int countDigits (String text) {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (Character.isDigit(c)) {
            count++;
        }
    }
    return count;
}

// Part C


public static boolean isValidPassword (String password){
    boolean isUpper = false;
    boolean isLower = false;
    boolean isDigit = false;

    if(password == null)
        return false;

    for(int i = 0; i < password.length(); i++){
        char c = password.charAt(i);

        if(Character.isUpperCase(c))
            isUpper= true;
        else if (Character.isLowerCase(c))
            isLower = true;
        else if (Character.isDigit(c))
            isDigit = true;


    }
    return isUpper && isLower && isDigit;
}

  /* Part D
    public static int CountUpperCase(String text){
    int count = 0;

    for (int i = 0; i < text.length(); i ++){  change the <= to <
        if(Character.isUpperCase(text.charAt(i)));  change the ; with brackets
            count++;
    }
    return count;
}
  */

//Part D fix


public static int CountUpperCase(String text) {
    int count = 0;

    for (int i = 0; i < text.length(); i++) { // change the <= to <
        if (Character.isUpperCase(text.charAt(i))) {// change the ; with brackets
            count++;
        }
    }
    return count;
}

//Part E


public static String generateCode() {

    String allowed = "ABCDEF";
    Random rand = new Random();
    String code = "";


    for(int i = 0; i < allowed.length(); i++){
        int index = rand.nextInt(6);
        code += allowed.charAt(index);
    }

    return code;

}


// Part G
    /*
    G1: If the first character of the text is a number then it would return true.
    G2: It would return true
    G3: The loop would go through each character and if there are no digit found, then it would exit the loop and return false.
    G4: You could use .*\\d*
    G5: I imagine it would return false
     */
