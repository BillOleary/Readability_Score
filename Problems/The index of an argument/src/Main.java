class Problem {
    public static void main(String[] args) {

        int count = 0;
        String regex = "test";
        for (int index = 0 ; index < args.length; index++) {
            if (args[index].matches(regex)) {
                System.out.println(index);
                break;
            }
            if (index == args.length - 1){
                System.out.println("-1");
            }
        }
    }
}