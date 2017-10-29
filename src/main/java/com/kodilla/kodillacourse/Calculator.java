package com.kodilla.kodillacourse;

public class Calculator {

    public int addXAndY(int x, int y) {
        return x + y;
    }

    public int subtractXAndY(int x, int y) {
        return x - y;
    }

        public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int sum = calculator.addXAndY(15, 10);
        int diff = calculator.subtractXAndY(25, 10);

        System.out.println("Sum: " + sum + "\n" + "Diff.: " + diff);

    }
}
