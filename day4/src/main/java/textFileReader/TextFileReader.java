package main.java.textFileReader;

import java.io.*;
import java.util.ArrayList;

public class TextFileReader {
    public static ArrayList<String> getPassportEntries(String filePath) throws IOException {
        final ArrayList<String> passportEntries = new ArrayList<>();
        final File passportFile = new File(filePath);
        try (final var reader = new BufferedReader(new FileReader(passportFile))){
            String text;

            while ((text = reader.readLine()) != null) {
                passportEntries.add(text);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return passportEntries;
    }
}
