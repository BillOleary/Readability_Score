import java.io.InputStream;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

       byte[] element = inputStream.readAllBytes();
       for (int index = 0; index < element.length; index++) {
           System.out.print(element[index]);
       }
        inputStream.close();
    }
}