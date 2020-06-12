package readability;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Main {

    enum ReadabilityIndex {
        ARI ("Automated Readability Index"),
        FK ("Flesch–Kincaid readability tests"),
        SMOG ("Simple Measure of Gobbledygook"),
        CL ("Coleman–Liau index");

        private String testIndex;
        ReadabilityIndex(String testIndex) {
            this.testIndex = testIndex;
        }

        @Override
        public String toString() {
            return testIndex;
        }
    };

    //private static Scanner readIn = new Scanner(System.in);
    private static String vowelRegex = "[aeiouyAEIOU]+(?<![eE]\\b)|([Tt]he)|(We)";
    private static Pattern vowelPattern = Pattern.compile(vowelRegex, Pattern.MULTILINE);
    private static Matcher matcher;

    public static void main(String[] args) {

        String punctuation = "[.|!|?]";
        int numberOfPunctuationMarks = 0;
        int syllablesAndPolySyllables[] = {0,0};

        Scanner readIn = new Scanner(System.in);

        //Create a file object to read.
        File fileRead = new File(readIn.next());

        try {
            List<String> lines = readFile(fileRead);

            Pattern regex = Pattern.compile(punctuation, Pattern.MULTILINE);
            Matcher matcher = regex.matcher(lines.stream().reduce((x,y) -> x + y).get());
            while (matcher.find()) {
                numberOfPunctuationMarks++;
            }
            //Split the text into sentences (separators are "full stops, Exclamation Mark and Question Mark"
            String[] sentences = lines.stream().
                    reduce((x, y) -> x.concat(y)).
                    map(element -> element.split(punctuation)).
                    get();

            //From the sentences calculate the following
            //data Array
            //data[0] = word count
            //data[1] = Sentence count
            //data[2] = Characters
            //data[3] = Syllables
            //data[4] = Polysyllables
            double[] data = new double[]{0, sentences.length, 0, 0D, 0D};
            for(String elements : sentences) {
                String[] eachWord = elements.trim().split(" ");
                data[0] += eachWord.length;
                data[2] += Stream.of(eachWord).mapToInt(character -> character.length()).sum();

                syllablesAndPolySyllables = countSyllables(elements);
                data[3] += syllablesAndPolySyllables[0];
                data[4] += syllablesAndPolySyllables[1];

            }

            //Calculate the readability index which indicates the reading level of an individual
            //Since the above text was split at the punctuation Marks - we need to add this to the get the total number
            //of Characters.
            data[2] += numberOfPunctuationMarks;

            System.out.println("Words:" + (int) data[0]);
            System.out.println("Sentences:" + (int) data[1]);
            System.out.println("Characters:" + (int) data[2]);
            System.out.println("Syllables: " + (int) data[3]);
            System.out.println("Polysyllables: " + (int) data[4]);

            System.out.print("Enter the score you want to calculate ARI, FK, SMOG, CL, all): " );
            String whatRIToCalculate = new Scanner(System.in).next();

            callTest(data,whatRIToCalculate);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            readIn.close();
        }

        /**************************OLD CODE FROM PROJECT 1***************************/
//        String readSentence = "";
//        int punctuationCount = 0;
//        double averageWordCount = 0;

        //Count the number of Punctuation of type ".?!" exits in the sentence
//        Pattern pattern = Pattern.compile("[.?!]", Pattern.MULTILINE);
//        Matcher match = pattern.matcher(readSentence);
//
//        while (match.find()) {
//            punctuationCount++;
//        }

        //Make sure the Punctuation count is > 0.  If there is one
        //sentence regardless of whether there is a punctuation mark, the
        //punctuationCount must be at least 1.
//        punctuationCount = punctuationCount == 0 ? 1 : punctuationCount;
//        double numberOfWordsInSentence = readSentence.split(" ").length;
//        averageWordCount = numberOfWordsInSentence / punctuationCount;
//        System.out.println(averageWordCount <= 10.0 ? "EASY" : "HARD");

    }

    /*
     * //data Array
     * //data[0] = word count
     * //data[1] = Sentence count
     * //data[2] = Characters count
     * //data[3] = Syllables count
     * //data[4] = Polysyllables count
     */

    private static void callTest(double[] data, String whatRIToCalculate) {

        double testedIndexScore = 0;

        ReadabilityIndex[] ri;
        if (whatRIToCalculate.matches("all")) {
            ri = ReadabilityIndex.values();
        }
        else
            ri = new ReadabilityIndex[]{ReadabilityIndex.valueOf(whatRIToCalculate)};
        for (ReadabilityIndex r : ri) {
            switch (r.name()) {
                case "ARI":
                    testedIndexScore = 4.71 * (data[2] / data[0]) + 0.5 * (data[0] / data[1]) - 21.43;
                    System.out.print(ReadabilityIndex.ARI.toString());
                    break;
                case "FK":
                    testedIndexScore = 0.39 * (data[0] / data[1]) + (11.8 * (data[3] / data[0])) - 15.9;
                    System.out.print(ReadabilityIndex.FK.toString());
                    break;
                case "SMOG":
                    testedIndexScore = 1.043 * Math.sqrt((data[4] * 30 / data[1])) + 3.1291;
                    System.out.print(ReadabilityIndex.SMOG.toString());
                    break;
                case "CL":
                    testedIndexScore = 0.0588 * (data[2] / data[0]) * 100 - 0.296 * (data[1] / data[0]) * 100 - 15.8;
                    System.out.print(ReadabilityIndex.CL.toString());
                    break;

                default:
                    System.out.println("NO PROPER INPUT RECEIVED!");
                    break;

            }
            final int indexScore = (int) Math.ceil(testedIndexScore);
            String getGradeLevel = gradeLevel(indexScore);
            String ageAppropriate = getGradeLevel.substring(0, getGradeLevel.lastIndexOf('-'));
            System.out.printf(": %.2f (about %s year olds)\n", testedIndexScore, ageAppropriate);
        }
    }

    /*
     *@param File : readFile
     * Read the I/P file into a list
     */
    public static List<String> readFile(File readFile) throws IOException {
        return Files.readAllLines(readFile.toPath());
    }


    /*
     *To count the number of syllables you should use letters a, e, i, o, u, y as vowels.
     * You can see here examples and difficulties with determining vowels in a word with 100% accuracy. So, let's use the following 4 rules:
     *1. Count the number of vowels in the word.
     *2. Do not count double-vowels (for example, "rain" has 2 vowels but is only 1 syllable)
     *3. If the last letter in the word is 'e' do not count it as a vowel (for example, "side" is 1 syllable)
     *4. If at the end it turns out that the word contains 0 vowels, then consider this word as 1-syllable.
     *
     * This code takes a string element and calculates the number of syllables and polysyllable from the string.
     * To do this we need to find the word boundary for each word in the sentence.  This is passed in through
     * a LinkedHashMap called indexPositionOfString
     * @param : String elements
     * @param : return back int[] {syllables, polysyllable}
     *
     */
    public static int[] countSyllables(String elements) {

        //Use this patterns as a Matcher to find all syllables.
        matcher = vowelPattern.matcher(elements);

        int countSyllables = 0;     //keep a count of how b=many syllables are found in the string.

        LinkedHashMap<Integer,String> indexPositionsOfWord;     //keep a map of the word in each string endIndex,Word
        //map of end index of the word and how many syllables are in that word.
        LinkedHashMap<Integer,Integer> syllableCountInWord = new LinkedHashMap<>();


        indexPositionsOfWord = generateWordIndex(elements);

        //Populate the syllableCountInWord table with the index positions as well
        indexPositionsOfWord.forEach((k, v)-> syllableCountInWord.put(k,0));

        //Count the number of Syllables in the String sequence.
        while(matcher.find()) {
            countSyllables++;        //counts the number of Syllables

            //find the appropriate word boundary key.
            //Do this by filtering for the key value > the word syllable index value and get the
            //first item which is matched.
            //This item will always be true because we have used a LinkedHashMap which preserves the position of the
            //element in the map.
            Integer key = syllableCountInWord.entrySet().
                    stream().
                    filter(element -> element.getKey() > matcher.start()).
                    findFirst().
                    get().
                    getKey();
            //increment the countSyllables value in the map, the value portion of the map indicates the frequency of syllables in
            //the word.
            syllableCountInWord.put(key, syllableCountInWord.get(key) + 1);
        }

        //find the polysyllable based on all words with syllables > 2
        int polySyllables = (int) syllableCountInWord.entrySet().
                stream().
                filter(element -> element.getValue() > 2).
                count();

        //return a composite value of syllable and polysyllable as an array
        return new int[]{countSyllables, polySyllables};
    }

    /*
     *Given a string input, find the start and end index of all the words in the string.
     * The output is a HashMap with a key which indicates the end index of the word along
     * with the word as the value.
     * To get the start index we subtract the length of the word from the end index
     * e.g. This is a Test.
     * List<Integer,String> words =  <3,"This">
     *                               <6,"is">
     *                               <8, "a">
     *                               <13,"Test.">
     *
     */
    private static LinkedHashMap<Integer, String> generateWordIndex(String elements) {
        int startIndex = 0;
        int endIndex = 0;
        LinkedHashMap<Integer, String> indexPositionsOfString = new LinkedHashMap<>();
        //Find the index of words in the string.
        //This will be used to find a polysyllable in the word - i.e a word with 3 or more syllables.
        for (int pointer = 0; pointer < elements.length(); pointer++) {
            if (elements.charAt(pointer) == ' ') {
                startIndex = pointer + 1;
            }
            else {
                //If we are at the last character in the sentence then this is the end index position
                //or if the next pointer value is a space then this is the end index pointer for the current word.
                if (pointer == elements.length() - 1 || elements.charAt(pointer + 1) == ' ') {
                    endIndex = pointer;
                    indexPositionsOfString.put(endIndex, elements.substring(startIndex, endIndex + 1));
                }
            }

        }
        return indexPositionsOfString;
    }

    /*
     *list of grade levels to be used when calculating the score for the readability index.
     */
    public static String gradeLevel(int indexScore) {
        //A List of all the grades
        Map<Integer,String> gradeLevel = new HashMap<>();
        gradeLevel.put(1,"5-6");
        gradeLevel.put(2,"6-7");
        gradeLevel.put(3,"7-9");
        gradeLevel.put(4,"9-10");
        gradeLevel.put(5,"10-11");
        gradeLevel.put(6 ,"11-12");
        gradeLevel.put(7,"12-13");
        gradeLevel.put(8,"13-14");
        gradeLevel.put(9,"14-15");
        gradeLevel.put(10,"15-16");
        gradeLevel.put(11,"16-17");
        gradeLevel.put(12,"17-18");
        gradeLevel.put(13,"18-24");
        gradeLevel.put(14,"24+");

        return gradeLevel.entrySet().
                stream().
                filter(element -> element.getKey().compareTo(indexScore) == 0).
                findFirst().
                get().
                getValue();
    }


}
