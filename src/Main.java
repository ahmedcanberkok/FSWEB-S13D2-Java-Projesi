import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------isPalindrome--------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-----------isPerfectNumber--------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------numberToWords--------");

    }

    public static boolean isPalindrome(int num1) {
        num1 = Math.abs(num1); // abs(absolute) metodu matematikteki mutlak deger islemini gerceklestirir.

        char[] digits = String.valueOf(num1).toCharArray();
        String reverse = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reverse += digits[i]; // Numberın reverse edilmis hali

        }
        return Integer.parseInt(reverse) == num1; // reverse tekrar integera cevirip eşitlik kontrolü yapılır
    }

    public static boolean isPerfectNumber ( int num ) {

        int total = 0 ;
        for ( int i = 1 ; i<num ; i++) { // num/2 de yapılabilir, cünkü bir sayının yarısından fazla olan bir böleni yoktur
            if (num%i == 0) {
                total = total + i ; // total += i de yazilabilir
            }
        }
//        if (num == total) {
//            return  true ;
//        }
//        return  false ;
        return  num == total ;
    }

    public  static  String numberToWords ( int num ) {
        if (num < 0 ) {
            return  "Invalid Value...!";
        }

        String text = "";

        char[] numArr = String.valueOf(num).toCharArray();
        for (char digit:numArr ) {
            switch (digit) {
                case '0':
                   text += "Zero" ;
                break;
                case '1':
                    text += "One" ;

                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;

                case '4':
                    text += "Four ";
                    break;

                case '5':
                    text += "Five ";
                    break;

                case '6':
                    text += "Six ";
                    break;

                case '7':
                    text += "Seven ";
                    break;

                case '8':
                    text += "Eight ";
                    break;

                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return  text.trim();
}


}