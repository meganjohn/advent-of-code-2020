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

    public static boolean[] readCurrentPositions(String mapRow, int positionAlongRow1, int positionAlongRow2, int positionAlongRow3, int positionAlongRow4) {
        boolean[] treesOnSlopes = new boolean[4];
        treesOnSlopes[0] = mapRow.charAt(positionAlongRow1) == '#';
        treesOnSlopes[1] = mapRow.charAt(positionAlongRow2) == '#';
        treesOnSlopes[2] = mapRow.charAt(positionAlongRow3) == '#';
        treesOnSlopes [3] = mapRow.charAt(positionAlongRow4) == '#';
        return treesOnSlopes;
    }
}