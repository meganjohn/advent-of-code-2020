package main.java.app;

import main.java.textFileReader.TextFileReader;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<String> passports = TextFileReader.getPassportEntries("../day3/src/main/resources/passports.txt");

    }
}
