//      ************************************************
//      A Roman Numeral to Integer Converter using Java.
//      ************************************************

// As part of an online challenge to write in as many languages as possible,
// a program to convert a given roman numeral into an integer.

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RomanNumToInteger {

    public static int romanToInt(String s) {

        // Storing the Roman Numeral, and it's corresponding integer value.

        java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get (s.charAt(i));

            if (i + 1< s.length() && currentVal < romanMap.get (s.charAt(i = 1)))
                total -= currentVal;

                else {
                    total += currentVal;
                    }

                }


        return total;
    }
    public static void main (String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nThis program is written to convert a Roman Numeral to a Decimal.");
        TimeUnit.SECONDS.sleep(3);

        System.out.println("\nShortly, you will be asked to enter a Numeral you wish to convert");
        TimeUnit.SECONDS.sleep(4);

        System.out.println("\nFor your information. Roman numerals are as follows:");
        TimeUnit.SECONDS.sleep(4);

        System.out.println("\nI-1\nV-5\nX-10\nL-50\nC-100\nD-500\nM-1000");
        TimeUnit.SECONDS.sleep(2);

        System.out.print("\nPlease enter a Roman Numeral to convert: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        if (romanNumeral.matches("^[IVXLCDM]+$")){
            int result = romanToInt(romanNumeral);
            System.out.println("Roman Numeral " + romanNumeral + " is " + result + " in integer." );
        }else{
            System.out.println("\nInvalid Numeral, please enter a valid Numeral.");
        }

        scanner.close();







    }
}
