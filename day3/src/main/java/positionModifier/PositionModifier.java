package main.java.positionModifier;

public class PositionModifier {

    public static Integer moveThreeToRight(String currentMapRow, int currentPosition) {
        int lengthOfRow = currentMapRow.length();
        int newPosition = currentPosition + 3;

        if (newPosition >= lengthOfRow) {
            newPosition -= lengthOfRow;
        }
        return newPosition;
    }

}
