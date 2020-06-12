import java.util.*;
import java.util.stream.Stream;

/*
* 18 May 2020
* The Program works by checking if a three sized array has all 1's or all 0's as values.
* 1's represent vowels and 0 represents consonants.
* If the sum of the array is 0 to 3 we can assume it has 3 of the same type (i.e. consonants or vowels).
*
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner readIn = new Scanner(System.in);
        String[] word = readIn.nextLine().split("");
        int length = word.length;
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        long[] testedCharacters = {0L, 0L, 0L};       //used to check if values are all consonants or vowels.
                                                        // 0->vowel
                                                        //1 -> a consonant
        int nextIndex = 0;                          //next index in the list (for the circular buffer)
        int addLetters = 0;                         //keep tally of letters added to break up the 3 const/vowel combo.
        long sum = 0L;                              //sum of the above testedCharacters array.a[0] + a[1] + a[2]

        for (int index = 0; index < length; index++) {
            //Test for the vowel condition
            final String testChar = word[index];
            //Generate a 0/1 0 -> vowel 1-> Consonant
            long isAVowel = Stream.of(vowels).filter(element -> element.matches(testChar)).count();

            //On first pass we need to fill up the empty array index position 0 and 1 with usable data
            if (index > 1 || isAVowel == 1) {
                //The sum is a running count of the array values 1 -> for vowel and 0 -> Not a vowel (i.e. consonant)
                //as an old index position is overwritten the old value in the index position is subtracted from the new
                //value which will be inserted into that index position.
                sum += isAVowel - testedCharacters[nextIndex];

                //Test condition a[0] + a[1] + a[2] == 0 -> 0/3
                // 0 -> all three positions consonants OR
                // 3 -> all positions are a vowel.
                if (sum == 0 || sum == 3) {
                    //if all three are consonant or vowels then add a compliment value for the array at that index pos.
                    addLetters++;
                    //re-set the last consonant or vowel to a compliment value
                    //This simulates adding a consonant or vowel in a similar group.
                    testedCharacters[nextIndex] = isAVowel == 1 ? 0 : 1;
                    //reset the sum by +1 or -1 depending on all consonants or all vowels
                    sum = (sum == 0) ? ++sum : (sum == 3) ? --sum : sum;
                    index--;    //reset the for loop index as the last operation needs to be re-performed
                }
                else {
                    testedCharacters[nextIndex] = isAVowel;
                }

            }
            //get the next index position to write to
            nextIndex = (nextIndex + 1) % testedCharacters.length;
        }
        System.out.println(addLetters);


    }
}