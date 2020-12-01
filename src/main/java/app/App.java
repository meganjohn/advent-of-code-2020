package main.java.app;

import main.java.accountsReader.AccountsReader;
import main.java.multiplier.Multiplier;
import main.java.sumsTo.SumsTo;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        AccountsReader reader = new AccountsReader("/Users/Megan.John/PROJECTS/AdventOfCode/src/main/resources/accounts");
        ArrayList<Integer> accountsList = reader.getAccountFigures();

        SumsTo summationCalculator = new SumsTo();
        int[] equals2020 = summationCalculator.twoEqualsTarget(accountsList,2020);
        int productOfTwoNumbers = Multiplier.multiplyTwoNumbers(equals2020);

        int[] tripletFor2020 = summationCalculator.threeEqualsTarget(accountsList, 2020);
        int productOfThreeNumbers = Multiplier.multiplyThreeNumbers(tripletFor2020);


        System.out.println(productOfTwoNumbers);
        System.out.println(productOfThreeNumbers);
        System.out.println("done");
    }
}
