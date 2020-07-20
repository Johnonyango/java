import java.util.Scanner;

public class RomanNumerals {

    int n;

    private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,
            50,   40,   10,    9,    5,    4,    1 };

    private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
            "L",  "XL",  "X",  "IX", "V",  "IV", "I" };

    public void convertInteger(int arabic) {

        if ((arabic < 1) && (arabic > 3999))
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
        n = arabic;
    }

    public void romanNumeral(String roman) {

        if (roman.length() == 0)
            throw new NumberFormatException("An empty string does not define a Roman numeral.");

        roman = roman.toUpperCase();  // Convert to upper case letters.

        int i = 0;       // A position in the string, roman;
        int arabic = 0;  // Arabic numeral equivalent of the part of the string that has


        while (i < roman.length()) {

            char letter = roman.charAt(i);        // Letter at current position in string.
            int number = letterToNumber(letter);  // Numerical equivalent of letter.

            if (number < 0)
                throw new NumberFormatException("Illegal character \"" + letter + "\" in roman numeral.");

            i++;  // Move on to next position in the string

            if (i == roman.length()) {
                arabic += number;
            } else {

                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {

                    arabic += (nextNumber - number);
                    i++;
                } else {

                    arabic += number;
                }
            }

        }

        if (arabic > 3999)
            throw new NumberFormatException("Roman numeral must have value 3999 or less.");

        n = arabic;

    }


    private int letterToNumber(char letter) {

        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }



    public String toString() {
        String roman = "";
        int N = n;
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman;
    }


    public int toInt() {
        // Return the value of this Roman numeral as an int.
        return n;
    }

    public static void main(String[] args) {
        RomanNumerals roman =new RomanNumerals();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        int number = scanner.nextInt();

        roman.convertInteger(number);
    }

}
