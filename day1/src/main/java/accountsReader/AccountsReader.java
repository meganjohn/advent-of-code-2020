package main.java.accountsReader;

import java.io.*;
import java.util.ArrayList;

public class AccountsReader {
    private final File accountsFile;
    private final ArrayList<Integer> accountsList = new ArrayList<>();

    public AccountsReader(final String path) {
        this.accountsFile = new File(path);
    }

    public ArrayList<Integer> getAccountFigures() throws IOException {
        try (final var reader = new BufferedReader(new FileReader(accountsFile))){
            String text;

            while ((text = reader.readLine()) != null) {
                accountsList.add(Integer.parseInt(text));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return accountsList;
    }

}

