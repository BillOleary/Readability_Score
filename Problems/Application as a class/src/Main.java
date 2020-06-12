import java.util.Arrays;

class Application {

    String name;

    void run(String[] args) {
        // implement me
        System.out.println(name);
        Arrays.asList(args).forEach(element -> System.out.println(element));
    }
}