public class Alphabet {
    public static void main(String[] args) {

        System.out.println(alphabet("FGI"));
    }
    public static String alphabet(String stringOfLetters){

        String sourceOfTruth = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterIndex = sourceOfTruth.indexOf(stringOfLetters.charAt(0));
        String theMissingCharacter = "";
        for (int i = letterIndex, letterStringIndex = 0; letterStringIndex < stringOfLetters.length(); i++, letterStringIndex++) {
            if (stringOfLetters.charAt(letterStringIndex) != sourceOfTruth.charAt(i)) {
                theMissingCharacter = String.valueOf(sourceOfTruth.charAt(i));
                break;
            }

        }
        return theMissingCharacter;
    }
}
