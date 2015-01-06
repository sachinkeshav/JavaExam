package com.knight.exam.java.bmiDtaManager;

import java.util.Scanner;

/**
 * Created by sachinkeshav on 12/27/14.
 */
public class BMIDataManager {

    public BMIDataManager() {
    }

    public void displayMenu() {
        System.out.printf("\t\t\t\t\tBMI Data Manager\n");
        System.out.printf("---------------------------------------------------------------------\n");

        System.out.printf("1. Input data\n");
        System.out.printf("2. Display\n");
        System.out.printf("3. Sort by name\n");
        System.out.printf("4. Sort by weight\n");
        System.out.printf("5. Search\n");
        System.out.printf("6. Display Extreme BMI\n");
        System.out.printf("7. Exit\n");

        System.out.printf("Enter options 1-7: ");
    }

    private void inputData() {

        for (int i = 0; i < STUDENT_ID; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("\nPlease enter name, then height and weight for person %d: ", (i + 1));
            String name = input.nextLine();

            do {
                if (this.isValidName(name)) {
                    nameArray[i] = name;
                } else {
                    System.out.printf("You entered an invalid name.\n");
                    System.out.printf("Please input a valid name: ");
                    name = input.nextLine();
                    nameArray[i] = name;
                }
            } while (!this.isValidName(name));

            System.out.printf("Please enter height(cm): ");
            int height = input.nextInt();

            do {
                if (this.isValidHeight(height)) {
                    heightArray[i] = height;
                } else {
                    System.out.printf("You entered an invalid height.\n");
                    System.out.printf("Please input a valid height: ");
                    height = input.nextInt();
                    heightArray[i] = height;
                }
            } while (!this.isValidHeight(height));

            System.out.printf("Please enter weight(kg): ");
            int weight = input.nextInt();

            do {
                if (this.isValidWeight(weight)) {
                    weightArray[i] = weight;
                } else {
                    System.out.printf("You entered an invalid weight.\n");
                    System.out.printf("Please input a valid weight: ");
                    weight = input.nextInt();
                    weightArray[i] = weight;
                }
            } while (!this.isValidWeight(weight));

            double bmi = this.calculateBmi(height, weight);
            bmiArray[i] = bmi;
        }
    }

    private double calculateBmi(int height, int weight) {
        return (double) weight / Math.pow((double) height / 100, 2);
    }

    public void displayData() {
        System.out.printf("\n\t\t\t\t\tBMI Data Manager\n");
        System.out.printf("=====================================================================\n");
        System.out.printf("\tName\t\t\t\tHeight\t\t\t\tWeight\t\t\t\tBMI\n");
        System.out.printf("---------------------------------------------------------------------\n");

        for (int i = 0; i < STUDENT_ID; i++) {
            System.out.printf("%s\t\t\t\t%d\t\t\t\t%d\t\t\t\t%.2f\n", nameArray[i], heightArray[i], weightArray[i], bmiArray[i]);
        }
        System.out.printf("---------------------------------------------------------------------\n\n");
        System.out.printf("Total %d results!\n\n", STUDENT_ID);
    }

    public void sortByName() {

        String[] sortedNameArray = new String[STUDENT_ID];
        int[] sortedHeightArray = new int[STUDENT_ID];
        int[] sortedWeightArray = new int[STUDENT_ID];
        double[] sortedBmiArray = new double[STUDENT_ID];

        for (int i = 0; i < STUDENT_ID; i++) {
            sortedNameArray[i] = nameArray[i];
            sortedHeightArray[i] = heightArray[i];
            sortedWeightArray[i] = weightArray[i];
            sortedBmiArray[i] = bmiArray[i];
        }

        for (int i = 0; i < STUDENT_ID; i++) {
            for (int j = i + 1; j < STUDENT_ID; j++) {
                if (sortedNameArray[j].compareTo(sortedNameArray[i]) < 0) {
                    String tempName = sortedNameArray[i];
                    sortedNameArray[i] = sortedNameArray[j];
                    sortedNameArray[j] = tempName;

                    int tempHeight = sortedHeightArray[i];
                    sortedHeightArray[i] = sortedHeightArray[j];
                    sortedHeightArray[j] = tempHeight;

                    int tempWeight = sortedWeightArray[i];
                    sortedWeightArray[i] = sortedWeightArray[j];
                    sortedWeightArray[j] = tempWeight;

                    double tempBmi = sortedBmiArray[i];
                    sortedBmiArray[i] = sortedBmiArray[j];
                    sortedBmiArray[j] = tempBmi;
                }
            }
        }

        System.out.printf("\n\t\t\t\t\tBMI Data Manager\n");
        System.out.printf("=====================================================================\n");
        System.out.printf("\tName\t\t\t\tHeight\t\t\t\tWeight\t\t\t\tBMI\n");
        System.out.printf("---------------------------------------------------------------------\n\n");

        for (int i = 0; i < STUDENT_ID; i++) {
            System.out.printf("%s\t\t\t\t%d\t\t\t\t%d\t\t\t\t%.2f\n", sortedNameArray[i], sortedHeightArray[i], sortedWeightArray[i], sortedBmiArray[i]);
        }
        System.out.printf("---------------------------------------------------------------------\n\n\n");
        System.out.printf("Total %d results!\n\n", STUDENT_ID);

    }

    public void sortByWeight() {

        String[] sortedNameArray = new String[STUDENT_ID];
        int[] sortedHeightArray = new int[STUDENT_ID];
        int[] sortedWeightArray = new int[STUDENT_ID];
        double[] sortedBmiArray = new double[STUDENT_ID];

        for (int i = 0; i < STUDENT_ID; i++) {
            sortedNameArray[i] = nameArray[i];
            sortedHeightArray[i] = heightArray[i];
            sortedWeightArray[i] = weightArray[i];
            sortedBmiArray[i] = bmiArray[i];
        }

        for (int i = 0; i < STUDENT_ID; i++) {
            for (int j = i + 1; j < STUDENT_ID; j++) {
                if (sortedWeightArray[j] < sortedWeightArray[i]) {
                    int tempWeight = sortedWeightArray[i];
                    sortedWeightArray[i] = sortedWeightArray[j];
                    sortedWeightArray[j] = tempWeight;

                    String tempName = sortedNameArray[i];
                    sortedNameArray[i] = sortedNameArray[j];
                    sortedNameArray[j] = tempName;

                    int tempHeight = sortedHeightArray[i];
                    sortedHeightArray[i] = sortedHeightArray[j];
                    sortedHeightArray[j] = tempHeight;


                    double tempBmi = sortedBmiArray[i];
                    sortedBmiArray[i] = sortedBmiArray[j];
                    sortedBmiArray[j] = tempBmi;
                }
            }
        }

        System.out.printf("\n\t\t\t\t\tBMI Data Manager\n");
        System.out.printf("=====================================================================\n");
        System.out.printf("\tName\t\t\t\tHeight\t\t\t\tWeight\t\t\t\tBMI\n");
        System.out.printf("---------------------------------------------------------------------\n\n");

        for (int i = 0; i < STUDENT_ID; i++) {
            System.out.printf("%s\t\t\t\t%d\t\t\t\t%d\t\t\t\t%.2f\n", sortedNameArray[i], sortedHeightArray[i], sortedWeightArray[i], sortedBmiArray[i]);
        }
        System.out.printf("---------------------------------------------------------------------\n\n\n");
        System.out.printf("Total %d results!\n\n", STUDENT_ID);

    }

    public void search(String name) {
        int searchIndex = -1;
        boolean searchFlag = false;
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].equalsIgnoreCase(name)) {
                searchFlag = true;
                searchIndex = i;
                break;
            }
        }

        if (searchFlag) {
            System.out.printf("\n%s - Height: %d(cm) Weight: %d(kg) BMI: %.2f\n\n", nameArray[searchIndex], heightArray[searchIndex], weightArray[searchIndex], bmiArray[searchIndex]);
        } else {
            System.out.printf("The searched person is not found in the record!");
        }
    }

    public void displayExtremes() {
        int indexOfMinBMI = -1;
        int indexOfMaxBMI = -1;

        double minBMI = Double.MAX_VALUE;
        double maxBMI = Double.MIN_VALUE;

        for (int i = 0; i < bmiArray.length; i++) {
            if (bmiArray[i] < minBMI) {
                minBMI = bmiArray[i];
                indexOfMinBMI = i;
            }

            if (bmiArray[i] > maxBMI) {
                maxBMI = bmiArray[i];
                indexOfMaxBMI = i;
            }
        }

        System.out.printf("\nThe person has minimum BMI is %s, with BMI %.2f.", nameArray[indexOfMinBMI], bmiArray[indexOfMinBMI]);
        System.out.printf("\nThe person has maximum BMI is %s, with BMI %.2f.\n\n", nameArray[indexOfMaxBMI], bmiArray[indexOfMaxBMI]);
    }

    private boolean isValidName(String name) {
        char[] chars = name.toCharArray();
        boolean spaceFlag = false;

        for (char c : chars) {
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && (c != ' '))
                return false;
            if (c == ' ')
                spaceFlag = true;
        }
        if (spaceFlag) return true;
        return false;
    }

    private boolean isValidHeight(int height) {
        if (height < 100 || height > 220)
            return false;

        return true;
    }

    private boolean isValidWeight(int weight) {
        if (weight < 0 || weight > 300)
            return false;

        return true;
    }

    public static void main(String[] args) {
        int option;
        Scanner input = new Scanner(System.in);

        BMIDataManager bmiDataManager = new BMIDataManager();

        do {
            bmiDataManager.displayMenu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    bmiDataManager.inputData();
                    break;
                case 2:
                    bmiDataManager.displayData();
                    break;
                case 3:
                    bmiDataManager.sortByName();
                    break;
                case 4:
                    bmiDataManager.sortByWeight();
                    break;
                case 5:
                    Scanner inputName = new Scanner(System.in);
                    System.out.printf("\nPlease enter a person name: ");
                    String name = inputName.nextLine();
                    bmiDataManager.search(name);
                    break;
                case 6:
                    bmiDataManager.displayExtremes();
                    break;
                case 7:
                    System.out.printf("\nGoodbye!!!");
                    break;
                default:
                    System.out.printf("\nPlease select valid option!\n\n");
                    break;
            }

        } while (option != 7);

    }

    private static final int STUDENT_ID = 6;
    private static int[] heightArray = new int[STUDENT_ID];
    private static int[] weightArray = new int[STUDENT_ID];
    private static String[] nameArray = new String[STUDENT_ID];
    private static double[] bmiArray = new double[STUDENT_ID];
}
