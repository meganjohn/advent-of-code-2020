package main.java.positionModifier;

public class PositionModifier {

    public static Integer moveThreeToRight(String currentMapRow, int currentPositionAlongRow) {
        int lengthOfRow = currentMapRow.length();
        int newPositionAlongRow = currentPositionAlongRow + 3;

        if (newPositionAlongRow >= lengthOfRow) {
            newPositionAlongRow -= lengthOfRow;
        }
        return newPositionAlongRow;
    }

    public static Integer moveOneToRight(String currentMapRow, int currentPositionAlongRow) {
        int lengthOfRow = currentMapRow.length();
        int newPositionAlongRow = currentPositionAlongRow + 1;

        if (newPositionAlongRow >= lengthOfRow) {
            newPositionAlongRow -= lengthOfRow;
        }
        return newPositionAlongRow;
    }

    public static Integer moveFiveToRight(String currentMapRow, int currentPositionAlongRow) {
        int lengthOfRow = currentMapRow.length();
        int newPositionAlongRow = currentPositionAlongRow + 5;

        if (newPositionAlongRow >= lengthOfRow) {
            newPositionAlongRow -= lengthOfRow;
        }
        return newPositionAlongRow;
    }

    public static Integer moveSevenToRight(String currentMapRow, int currentPositionAlongRow) {
        int lengthOfRow = currentMapRow.length();
        int newPositionAlongRow = currentPositionAlongRow + 7;

        if (newPositionAlongRow >= lengthOfRow) {
            newPositionAlongRow -= lengthOfRow;
        }
        return newPositionAlongRow;
    }

//    public static Integer moveOneRowDown(int currentMapRow) {
//        return (currentMapRow + 1);
//    }
//
//    public static Integer moveTwoRowsDown(int currentMapRow) {
//        return (currentMapRow + 2);
//    }

}
