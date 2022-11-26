import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class alphabetize {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\luada\\OneDrive\\Dokumenty\\ang.txt"));
        ArrayList<String> words = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            words.add(line);
        }
        br.close();
        Collections.sort(words);

        FileWriter wr = new FileWriter("C:\\Users\\luada\\OneDrive\\Dokumenty\\ang.txt");
        for (String s: words ) {
            wr.write(s + "\r\n");
        }
        wr.close();

        System.out.println(words);
    }
}
