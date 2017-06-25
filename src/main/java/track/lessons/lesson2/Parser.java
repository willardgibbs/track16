package track.lessons.lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Parser {

    Document parse(String data) {
        return null;
    }

    public static void main(String[] args) throws Exception {

        String path = "path/to/file";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        // reader умеет читать по строкам с помощью метода readLine()
        StringBuilder lines = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {//как тут остановиться?
            lines.append(line);
        }
        // Создайте объект Parser
        Parser pars = new Parser();

        // Получите объект Document, реализовав метод parse()
        pars.parse(lines.toString());

    }
}
