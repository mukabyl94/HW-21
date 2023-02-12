import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Alphabet.txt");
        fileWriter.write("A a\n" +
                "B b\n" +
                "C c\n" +
                "D d\n" +
                "E e\n" +
                "F f\n" +
                "G g\n" +
                "H h\n" +
                "I i\n" +
                "J j\n" +
                "K k\n" +
                "L l\n" +
                "M m\n" +
                "N n\n" +
                "O o\n" +
                "P p\n" +
                "Q q\n" +
                "R r\n" +
                "S s\n" +
                "T t\n" +
                "U u\n" +
                "V v\n" +
                "W w\n" +
                "X x\n" +
                "Y y\n" +
                "Z z\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9");
        fileWriter.close();
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader("Alphabet.txt");
        Scanner scan = new Scanner(fileReader);
        int number = 1;
        while(scan.hasNext()){
            stringBuilder.append(number + ": " +scan.nextLine()+"\n");
            number++;
        }
        fileReader.close();
        System.out.println(stringBuilder);
    }
}