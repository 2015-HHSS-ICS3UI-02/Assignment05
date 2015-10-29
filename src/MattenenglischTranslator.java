
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);


        while (true) {
            //asks user to enter a word to be tranlated
            System.out.print("Please enter a word to translate(Type END to quit the program): ");
            String word = input.nextLine();


            //checks the rules
            String matte = word;
            //translator stops if end is typed
            if (matte.equalsIgnoreCase("end")) {
                break;
            }
            //starts with a vowel
            if (matte.startsWith("a")
                    || matte.startsWith("e")
                    || matte.startsWith("i")
                    || matte.startsWith("o")
                    || matte.startsWith("u")) {
                if (matte.startsWith("a")) {
                    matte = matte.replaceFirst("a", "i");
                }
                if (matte.startsWith("e")) {
                    matte = matte.replaceFirst("e", "i");
                }
                if (matte.startsWith("i")) {
                    matte = matte.replaceFirst("i", "i");
                }
                if (matte.startsWith("o")) {
                    matte = matte.replaceFirst("o", "i");
                }
                if (matte.startsWith("u")) {
                    matte = matte.replaceFirst("u", "i");
                }
                if (matte.startsWith("y")) {
                    matte = matte.replaceFirst("y", "i");
                }
                //if a vowel is found at the end of a word then "hee" is added
                if (matte.endsWith("a") || matte.endsWith("e") || matte.endsWith("i")
                        || matte.endsWith("o") || matte.endsWith("u") || matte.endsWith("y")) {
                    matte = matte + "hee";
                }//adds "ee" if doesn't end with vowel 
                else {
                    matte = matte + "ee";
                }
            }//if doesnt start with vowel 
            else {
                char vowel = Character.toLowerCase(matte.charAt(0));
                if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'
                        || vowel == 'u' || vowel == 'y') {
                    int vFound = matte.indexOf(vowel);
                    String first = matte.substring(0, vFound);
                    String last = matte.substring(vFound);
                    matte = last + first + "ee";
                    if (matte.startsWith("a")) {
                        matte = matte.replaceFirst("a", "i");
                    }
                    if (matte.startsWith("e")) {
                        matte = matte.replaceFirst("e", "i");
                    }
                    if (matte.startsWith("i")) {
                        matte = matte.replaceFirst("i", "i");
                    }
                    if (matte.startsWith("o")) {
                        matte = matte.replaceFirst("o", "i");
                    }
                    if (matte.startsWith("u")) {
                        matte = matte.replaceFirst("u", "i");
                    }
                    if (matte.startsWith("y")) {
                        matte = matte.replaceFirst("y", "i");
                    }
                }

                /*if (!matte.startsWith("a")) {
                 int aFound = matte.indexOf("a");
                 String first = matte.substring(0, aFound);
                 String last = matte.substring(aFound);
                 matte = last + first + "ee";
                 matte = matte.replaceFirst("a", "i");
                 }
                
         
                 */
            }
            System.out.println(word + " in Mattenenglisch is " + matte);
        }
    }
}
