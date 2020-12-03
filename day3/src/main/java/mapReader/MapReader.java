package main.java.mapReader;

import java.io.*;
import java.util.ArrayList;

public class MapReader {

    public static ArrayList<String> getMapArrayList(String filePath) throws IOException {
        final ArrayList<String> mapArrayList = new ArrayList<>();
        final File mapFile = new File(filePath);
        try (final var reader = new BufferedReader(new FileReader(mapFile))){
            String text;

            while ((text = reader.readLine()) != null) {
                mapArrayList.add(text);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        return mapArrayList;
    }

    public static String getMapRow(ArrayList<String> mapArray, int rowIndex) {
        return mapArray.get(rowIndex);
    }

    public static boolean readCurrentPosition(String mapRow, int positionAlongRow) {
        return mapRow.charAt(positionAlongRow) == '#';
    }

}