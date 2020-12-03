package main.java.sumsTo;

import java.util.ArrayList;

public class SumsTo {
    public static int[] twoEqualsTarget(ArrayList<Integer> accountsList, int targetTotal) {
        int[] sumsToTotal = new int[2];
        ArrayList<Integer> subtractedFromTarget = new ArrayList<>();
        for (int e : accountsList) {
            if (!subtractedFromTarget.contains(e)) {
                subtractedFromTarget.add(targetTotal - e);
            } else {
                sumsToTotal[0] = e;
                sumsToTotal[1] = targetTotal - e;
            }
        }
        return sumsToTotal;
    }

    public static int[] threeEqualsTarget(ArrayList<Integer> accountsList, int targetTotal) {
        int[] sumsToTotal = new int[3];
        for (int i = 0; i < accountsList.size()-2; i++) {
            for (int j = 1; j < accountsList.size()-1; j++) {
                for (int k = 2; k < accountsList.size(); k++) {
                    if(accountsList.get(i)+accountsList.get(j)+accountsList.get(k) == targetTotal) {
                        sumsToTotal[0] = accountsList.get(i);
                        sumsToTotal[1] = accountsList.get(j);
                        sumsToTotal[2] = accountsList.get(k);
                    }
                }
            }
        }
        return sumsToTotal;
    }
}
