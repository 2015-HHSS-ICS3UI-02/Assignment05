
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            // Ask user to input the word wished to be translated
            System.out.println("Please enter a word you wish to translate in Mattenenglisch(Type END to quit the program).");
            String word = input.nextLine();
            String word2 = word;
            StringBuilder sBuilder = new StringBuilder(word);
            // If the user inputs 'END', then the translator ends
            if (word.equals("END")) {
                break;
            }


            // Find a word that begins with a vowel
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                // Change every starting vowel in an 'i'
                if (word.startsWith("a")) {
                    word = word.replaceFirst("a", "i");
                } else if (word.startsWith("e")) {
                    word = word.replaceFirst("e", "i");
                } else if (word.startsWith("i")) {
                    word = word.replaceFirst("i", "i");
                } else if (word.startsWith("o")) {
                    word = word.replaceFirst("o", "i");
                } else if (word.startsWith("u")) {
                    word = word.replaceFirst("u", "i");
                } else if (!word.startsWith("y")) {
                    sBuilder.append("ee");
                    sBuilder.replace(0, 1, "i");

                }
                // Find a word that ends with a vowel
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    // Replace ending vowel with 'hee'
                    word = word + "hee";
                } else {
                    // If word doesn't end with a vowel, end the word with 'ee'
                    word = word + "ee";
                }
                // Output the translated word
                System.out.println(word2 + " in Mattenenglisch is " + word + ".");
            } else {

                // Fix up with rhythm and scholar!
                // Go through each letter of the input 
                for (int i = 0; i < sBuilder.length(); i++) {
                    if (sBuilder.charAt(i) == 'a'
                            || sBuilder.charAt(i) == 'e'
                            || sBuilder.charAt(i) == 'i'
                            || sBuilder.charAt(i) == 'o'
                            || sBuilder.charAt(i) == 'u'
                            || sBuilder.charAt(i) == 'y') {
                        // Delete every letter before a vowel
                        sBuilder.append(sBuilder.substring(0, i));
                        // Replace vowel with an 'i'
                        sBuilder.replace(i, i + 1, "i");
                        sBuilder.delete(0, i);
                        sBuilder.append("ee");
                        break;
                    }
                }
                System.out.println(word2 + " in Mattenenglisch is " + sBuilder + ".");
            }
            System.out.println("");
        }
    }
}
