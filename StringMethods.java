import java.util.Scanner;

public class StringMethods
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input string here: ");

        String string1 = input1.nextLine();
        int countLength = string1.length();
        System.out.println("1. The length of strength is: " + countLength + ".");
        String resultUpperCase = string1.toUpperCase();
        System.out.println("2. The string in UPPERCASE: " + resultUpperCase + ".");
        String resultLowerCase = string1.toLowerCase();
        System.out.println("3. The string in lowercase: " + resultLowerCase + ".");
        char firstChar = string1.charAt(0);
        System.out.println("4. The first character of the string is: " + firstChar + ".");
        char lastChar = string1.charAt(countLength-1);
        System.out.println("5. The last character of the string is: " + lastChar + ".");
        String char2to5 = string1.substring(1,5);
        System.out.println("6. This is the second to the fifth character of the string: " + char2to5 + ".");
    }
}
