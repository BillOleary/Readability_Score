class Problem {

    public static void main(String[] args) {

        int firstValue = Integer.parseInt(args[1]);
        int secondValue = Integer.parseInt(args[2]);

        System.out.println(args[0].matches("\\+") ? firstValue + secondValue :
                            args[0].matches("\\-") ? firstValue - secondValue :
                            args[0].matches("\\*") ? firstValue * secondValue :
                            "Unknown operator");

    }
}