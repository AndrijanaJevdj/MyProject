import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= myObj.nextLine();
        System.out.println("The reverse  word is: ");
        reverseWord(word);
        System.out.println(reverseWord(word));
        System.out.println(palindrome(word, reverseWord(word)));
    }
    public static String reverseWord(String word){
        String reversedWord = "";
        for (int i = word.length()-1; i>=0; i--){
            reversedWord= reversedWord + word.charAt(i);
        }
        return reversedWord;

    }public static boolean palindrome (String word, String reversedWord) {

        if (word.equals(reversedWord.toLowerCase())) {
            System.out.println("This word is a palindrome!");
            return true;
        } else {
            System.out.println("This word isn't a palindrome!");
        }
        return false;


    }
}
