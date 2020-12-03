package main.java.app;

import main.java.mapReader.MapReader;
import main.java.positionModifier.PositionModifier;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        ArrayList<String> mapArrayList = MapReader.getMapArrayList("../day3/src/main/resources/map.txt");

        //Counters for Challenge 1
        int positionAlongRowRoute1 = 0;
        int treesOnRoute1 = 0;

        //Counters for Challenge 2
        long treesOnSlope1 = 0;
        long treesOnSlope2 = 0;
        long treesOnSlope3 = 0;
        long treesOnSlope4 = 0;
        long treesOnSlope5 = 0;

        try {
            //Challenge 1
            for (int i = 0; i < mapArrayList.size(); i++) {
                String mapRow = MapReader.getMapRow(mapArrayList, i);
                boolean treeAtCurrentLocation = MapReader.readCurrentPosition(mapRow, positionAlongRowRoute1);
                if (treeAtCurrentLocation) {
                    treesOnRoute1++;
                }
                positionAlongRowRoute1 = PositionModifier.moveThreeToRight(mapRow, positionAlongRowRoute1);
            }

            //Challenge 2
            int slope1Position = 0;
            int slope2Position = 0;
            int slope3Position = 0;
            int slope4Position = 0;
            int slope5Position = 0;

            for (int j = 0; j < mapArrayList.size(); j++) {
                String mapRow = MapReader.getMapRow(mapArrayList, j);

                boolean[] treesAtCurrentLocations = MapReader.readCurrentPositions(mapRow, slope1Position, slope2Position, slope3Position, slope4Position);
                if (treesAtCurrentLocations[0]) treesOnSlope1++;
                if (treesAtCurrentLocations[1]) treesOnSlope2++;
                if (treesAtCurrentLocations[2]) treesOnSlope3++;
                if (treesAtCurrentLocations[3]) treesOnSlope4++;
                slope1Position = PositionModifier.moveOneToRight(mapRow, slope1Position);
                slope2Position = PositionModifier.moveThreeToRight(mapRow, slope2Position);
                slope3Position = PositionModifier.moveFiveToRight(mapRow, slope3Position);
                slope4Position = PositionModifier.moveSevenToRight(mapRow, slope4Position);

                //Run slope 5 on even rows
                if (j%2 == 0) {
                    boolean treeAtCurrentLocation = MapReader.readCurrentPosition(mapRow, slope5Position);
                    if (treeAtCurrentLocation) treesOnSlope5++;
                    slope5Position = PositionModifier.moveOneToRight(mapRow, slope5Position);
                }
            }
            //Challenge 1 output
            System.out.println(treesOnRoute1);

            //Challenge 2 output
            System.out.println(treesOnSlope1*treesOnSlope2*treesOnSlope3*treesOnSlope4*treesOnSlope5);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
