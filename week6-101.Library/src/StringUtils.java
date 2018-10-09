
public class StringUtils {
    public static boolean included(String word, String searched) {
        String trimmedSearch = searched.trim().toUpperCase();
        String moddedWord = word.toUpperCase();
        
        if (trimmedSearch.equals("") || moddedWord.equals("")) {
            return false;
        }
        return moddedWord.contains(trimmedSearch);
           
    }
}
