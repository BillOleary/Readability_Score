/**
 * It returns a double value or 0 if an exception occurred
 */
public static double convertStringToDouble(String input){
    Double output;
    try{
        return Double.parseDouble(input);
        }
    catch (RuntimeException rtXception) {
        return 0;
        }
}