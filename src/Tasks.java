import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static Scanner in = new Scanner(System.in);
    public static Random gen = new Random();

    public static void main(String[] args) {
        //taskZero();
        //taskOne();
        //taskTwo();
        //taskThree();
        //taskFour();
        //taskFive();
        //taskSix();
        //taskSeven();
        //taskEight();
        //taskNine();
        //taskTen();
        //taskEleven();
        //taskTwelve();
        taskThirteen();
        //taskFourteen();
        //taskFifteen();
        //taskSixteen();
    }

    public static void taskSixteen() {
        System.out.print("Enter the A value: ");
        int a = in.nextInt();
        int[] array = initialArray();
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                break;
            }
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }
        System.out.printf("The quantity of even elements before the A value: %d.\n", evenCounter);
    }

    public static void taskFifteen() {
        int[] array = new int[30];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(500, 1000);
            if (array[i] % 5 == 0 && array[i] % 8 == 0) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("The sum of elements to multiple of 5 and 8: %d.\n", sum);
    }

    public static void taskFourteen() {
        int[] array = initialArray();
        double avg = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= -2 && array[i] < 10) {
                avg += array[i];
                counter++;
            }
        }
        avg /= counter;
        System.out.printf("The avg of array elements in range between -2 and 10: %f.\n", avg);
    }

    public static void taskThirteen() {
        //int[] array = initialArray();
        int[] array = {0, 1, 2, 3, 13, 5, 6, 17, 8, 9};
        int min = 0;
        int minimalDeleteValue = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= min) {
                    minimalDeleteValue++;
                    break;
                }
            }
        }
        System.out.printf("The minimal quantity of elements to delete for increased sequence: %d.\n", minimalDeleteValue);
    }

    public static void taskTwelve() {
        int[] array = initialArray();
        String[] newArray = new String[array.length + 1];
        int counter;
        for (int i = 0; i < array.length; i++) {
            counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            newArray[counter] = String.valueOf(array[i]);
        }
        String mostFreq = null;
        int mostFreqInd = 0;
        for (int i = newArray.length - 1; i >= 0; i--) {
            if (newArray[i] != null) {
                mostFreq = newArray[i];
                mostFreqInd = i;
                break;
            }
        }
        System.out.printf("The most frequent value of array: %s found: %s times.\n", mostFreq, mostFreqInd);
    }

    public static void taskEleven() {
        int[] array = initialArray();
        int[] newArray;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        newArray = Arrays.copyOf(array, array.length + 1);
        newArray[maxIndex + 1] = maxIndex;
        for (int i = maxIndex + 1, j = maxIndex + 2; i < array.length || j < newArray.length; i++, j++) {
            newArray[j] = array[i];
        }
        System.out.printf("The maximal element of array is: %d, index: %d.\n", max, maxIndex);
        printArray(newArray);
    }

    public static void taskTen() {
        int[] array = initialArray();
        int max = Integer.MIN_VALUE;
        boolean isUnique = true;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                isUnique = false;
            } else if (max < array[i] && i % 2 == 0) {
                max = array[i];
            }
        }
        System.out.printf("The maximal element on even position: %d is unique: %b.\n", max, isUnique);
    }

    public static void taskNine() {
        System.out.print("Enter the A value: ");
        int a = in.nextInt();
        System.out.print("Enter the B value: ");
        int b = in.nextInt();
        int[] array = initialArray();
        boolean w = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % a == 0 && array[i] % b != 0) {
                w = true;
                break;
            }
        }
        System.out.printf("The array have the element multiple to A and not multiple to B: %b.\n", w);
    }

    public static void taskEight() {
        boolean r = false;
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6, 7, 9, 11, 22, 33};
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i] == array[i + 2]) {
                r = true;
                break;
            }
        }
        System.out.printf("The array have the three equals elements: %b.\n", r);
    }

    public static void taskSeven() {
        int[] array = initialArray();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void taskSix() {
        String[] names = {"Дима", "Саша", "Петя", "Степа", "Матвей", "Глеб", "Витя", "Гоша", "Олег", "Антон"};
        printArray(names);
        for (int i = names.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    swap(names, j, j + 1);
                } else if (names[j].compareTo(names[j + 1]) == 0) {
                    swap(names, j, j + 1);
                }
            }
        }
        printArray(names);
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void taskFive() {
        int[] array = initialArray();
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        printArray(array);
    }

    public static void taskFour() {
        System.out.print("Enter the size of array: ");
        int arraySize = in.nextInt();
        while (arraySize <= 5 || arraySize > 10) {
            System.out.println("The value must be bigger than five and smaller than eleven");
            System.out.println("Please try again");
            System.out.print("Enter the size of array: ");
            arraySize = in.nextInt();
        }
        int[] array = initialArray(arraySize);
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        int[] newArray;
        if (evenCount > 0) {
            newArray = new int[evenCount];
            for (int i = 0, j = 0; i < array.length; ) {
                if (array[i] % 2 == 0) {
                    newArray[j] = array[i];
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            System.out.println("The new array for even elements: " + Arrays.toString(newArray));
        } else {
            System.out.println("There is no even elements");
        }

    }

    public static void taskThree() {
        int[] firstArray = initialArray();
        double firstAvg = 0;
        int[] secondArray = initialArray(firstArray.length);
        double secondAvg = 0;
        for (int i = 0; i < firstArray.length; i++) {
            firstAvg += firstArray[i];
            secondAvg += secondArray[i];
        }
        firstAvg /= firstArray.length;
        secondAvg /= secondArray.length;
        if (firstAvg > secondAvg) {
            System.out.printf("The avg of first array is bigger than avg of second array: %f > %f.\n", firstAvg, secondAvg);
        } else if (secondAvg > firstAvg) {
            System.out.printf("The avg of second array is bigger than avg of first array: %f > %f.\n", secondAvg, firstAvg);
        } else if (firstAvg == secondAvg) {
            System.out.printf("The avg of first and second arrays is equals: %f == %f.\n", firstAvg, secondAvg);
        }
    }

    public static void taskTwo() {
        System.out.print("Enter the size of array: ");
        double[] array = new double[in.nextInt()];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10;
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
            avg += array[i];
        }
        avg /= array.length;
        System.out.println(Arrays.toString(array));
        System.out.printf("The max value: %f, the min value: %f, the avg value: %f.\n", max, min, avg);

    }

    public static void taskOne() {
        System.out.print("Enter the value: ");
        int searchElement = in.nextInt();
        int searchCount = 0;
        int[] array = initialArray();
        int[] newArray;
        System.out.println("Origin array: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                searchCount++;
            }
        }
        if (searchCount > 0) {
            newArray = new int[array.length - searchCount];
            for (int i = 0, j = 0; i < array.length; ) {
                if (array[i] != searchElement) {
                    newArray[j] = array[i];
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            System.out.printf("Array without %d: " + Arrays.toString(newArray) + ".\n", searchElement);
        } else {
            System.out.printf("The value %d is NOT enter to the array.\n", searchElement);
        }
    }

    public static void taskZero() {
        System.out.print("Enter the value: ");
        int searchElement = in.nextInt();
        boolean findFlag = false;
        int[] array = initialArray();
        for (int i : array) {
            if (i == searchElement) {
                findFlag = true;
                break;
            }
        }
        if (findFlag) {
            System.out.printf("The value %d is enter to the array.\n", searchElement);
        } else {
            System.out.printf("The value %d is NOT enter to the array.\n", searchElement);
        }
    }

    public static int[] initialArray() {
        System.out.print("Enter the size of array: ");
        int sizeArray = in.nextInt();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] initialArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }
}