import java.util.Arrays;

public class AnagramaCheck {

    public static boolean isAnagram(String word1, String word2) {

        //comprobando si no son nulas las palabras
        if (word1 == null || word2 == null) return false;

        String cleanWord1 = word1.replaceAll("\\s", "").toLowerCase();
        String cleanWord2 = word2.replaceAll("\\s", "").toLowerCase();

        //comprobando si las palabras no son del mismo tamanio
        if (cleanWord1.length() != cleanWord2.length()) return false;

        char[] charArray1 = cleanWord1.toCharArray();
        char[] charArray2 = cleanWord2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
