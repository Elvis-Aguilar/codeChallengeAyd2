import java.util.Arrays;

public class AnagramaCheck {

    public static boolean isAnagram(String word1, String word2) {

        //comprobando si no son nulas las palabras
        if (word1 == null || word2 == null) return false;

        //conviriendo a minusculas las palabras
        String cleanWord1 = word1.toLowerCase();
        String cleanWord2 = word2.toLowerCase();

        //comprobando si las palabras no son del mismo tamanio
        if (cleanWord1.length() != cleanWord2.length()) return false;

        int[] frequency = new int[26];  //

        for (int i = 0; i < cleanWord1.length(); i++) {
            frequency[cleanWord1.charAt(i) - 'a']++;  // se le resta - 'a' para obtener el valor
            frequency[cleanWord2.charAt(i) - 'a']--;
        }

        for (int count : frequency) {
            if (count != 0) return false; //
        }

        return true;
    }
}
