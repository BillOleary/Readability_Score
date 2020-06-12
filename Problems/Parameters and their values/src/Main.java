class Problem {

    public static void main(String[] args) {
        // Write your code here
        int count = 0;

        while (count < args.length) {
            System.out.println(args[count] + "=" + args[++count]);
            count++;
        }
    }
}