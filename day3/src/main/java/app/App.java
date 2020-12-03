package main.java.app;

import main.java.mapReader.MapReader;
import main.java.positionModifier.PositionModifier;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        ArrayList<String> mapArrayList = MapReader.getMapArrayList("../day3/src/main/resources/map.txt");

        int positionAlongRow = 0;
        int treesOnRoute = 0;

        for (int i = 0; i < mapArrayList.size(); i++) {
            String mapRow = MapReader.getMapRow(mapArrayList, i);
            boolean treeAtCurrentLocation = MapReader.readCurrentPosition(mapRow, positionAlongRow);
            if(treeAtCurrentLocation) {
                treesOnRoute++;
            }
            positionAlongRow = PositionModifier.moveThreeToRight(mapRow, positionAlongRow);

        }
        System.out.println(treesOnRoute);
    }

}
