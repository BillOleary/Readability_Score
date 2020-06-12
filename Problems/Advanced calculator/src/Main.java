/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int value = 0;
        int firstValue = Integer.parseInt(args[1]);
        int max = firstValue;
        int min = firstValue;
        int sum = firstValue;
        // write your code here

        //Since we have read a value from index 1 above we
        //start at index 2
        for (int index = 2; index < args.length; index++) {
            //convert all values to int
            value = Integer.parseInt(args[index]);
            max = value > max ? value : max;
            min = value < min ? value : min;
            sum += value;

        }

        System.out.println(operator.matches("MAX") ? max :
                            operator.matches("MIN") ? min :
                            sum);


    }
}