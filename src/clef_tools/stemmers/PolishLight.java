package clef_tools.stemmers;

import java.util.Map;
import java.util.WeakHashMap;

public final class PolishLight {

    private PolishLight() {}

    public static String stem(String originalWord) {

        if (originalWord.length() < 3)
            return originalWord;
        else {
            StringBuilder stem = new StringBuilder();
            stem.delete(0, stem.length());
            stem.append(originalWord);
            String word = remove_accent(stem);
            if (originalWord.length() < 3)
                return originalWord;

            // First rule
            if (originalWord.length() > 6 && (word.endsWith("owie"))) {
                stem.delete(word.length() - 4, word.length());
                word = stem.toString();
                if (stem.length() > 4 && (word.endsWith("ia") || word.endsWith("ie") || word.endsWith("iu"))) {
                    stem.delete(word.length() - 3, word.length());
                } else if (stem.length() > 3 && (word.endsWith("a") || word.endsWith("u") || word.endsWith("i") || word.endsWith("e") || word.endsWith("o") || word.endsWith("y"))) {
                    stem.delete(word.length() - 1, word.length());
                }
            } else if (originalWord.length() > 6 && (word.endsWith("owi") || word.endsWith("ami"))) {
                stem.delete(word.length() - 3, word.length());
                word = stem.toString();
                if (stem.length() > 4 && (word.endsWith("ia") || word.endsWith("ie") || word.endsWith("iu"))) {
                    stem.delete(word.length() - 3, word.length());
                } else if (stem.length() > 3 && (word.endsWith("a") || word.endsWith("u") || word.endsWith("i") || word.endsWith("e") || word.endsWith("o") || word.endsWith("y"))) {
                    stem.delete(word.length() - 1, word.length());
                }
            } else if (originalWord.length() > 5 && (word.endsWith("ach") || word.endsWith("zie"))) {
                stem.delete(word.length() - 3, word.length());
                word = stem.toString();
                if (stem.length() > 4 && (word.endsWith("ia") || word.endsWith("ie") || word.endsWith("iu"))) {
                    stem.delete(word.length() - 3, word.length());
                } else if (stem.length() > 3 && (word.endsWith("a") || word.endsWith("u") || word.endsWith("i") || word.endsWith("e") || word.endsWith("o") || word.endsWith("y"))) {
                    stem.delete(word.length() - 1, word.length());
                }
            } else if (originalWord.length() > 4 && (word.endsWith("em") || word.endsWith("om") || word.endsWith("ow") || word.endsWith("ze") || word.endsWith("zy") || word.endsWith("mi") || word.endsWith("in"))) {
                stem.delete(word.length() - 2, word.length());
                word = stem.toString();
                if (stem.length() > 4 && (word.endsWith("ia") || word.endsWith("ie") || word.endsWith("iu"))) {
                    stem.delete(word.length() - 3, word.length());
                } else if (stem.length() > 3 && (word.endsWith("a") || word.endsWith("u") || word.endsWith("i") || word.endsWith("e") || word.endsWith("o") || word.endsWith("y"))) {
                    stem.delete(word.length() - 1, word.length());
                }

            }
            return stem.toString();
        }
    }

    private static String remove_accent(StringBuilder originalWord)
    {
        int len = originalWord.length() - 1;
        for(int i = 0; i<= len; i++){

        if(originalWord.charAt(i) == 'ó')
        {
            originalWord.setCharAt(i, 'o');           
        }
        if(originalWord.charAt(i) == 'ń')
        {
            originalWord.setCharAt(i, 'n');           
        }
        if(originalWord.charAt(i) == 'ą')
        {
            originalWord.setCharAt(i, 'a');           
        }
        if(originalWord.charAt(i) == 'ć')
        {
            originalWord.setCharAt(i, 'c');           
        }
        if(originalWord.charAt(i) == 'ę')
        {
            originalWord.setCharAt(i, 'e');           
        }
        if(originalWord.charAt(i) == 'ś')
        {
            originalWord.setCharAt(i, 's');           
        }
        if(originalWord.charAt(i) == 'ł')
        {
            originalWord.setCharAt(i, 'l');           
        }
        if(originalWord.charAt(i) == 'ź')
        {
            originalWord.setCharAt(i, 'z');           
        }
        if(originalWord.charAt(i) == 'ż')
        {
            originalWord.setCharAt(i, 'z');           
        }
      }
        return(originalWord.toString());
    }
}
