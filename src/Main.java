import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        double sumMonthly = 0;
        for (int value : arr) {
            sumMonthly += value;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonthly + " рублей");
        System.out.println("________________________");

        System.out.println("Вторая задача");

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[29] + " рублей.");

        System.out.println("________________________");

        System.out.println("Третья задача");

        double sumMedium = sumMonthly/30;
        System.out.println("Средняя сумма трат за месяц составила "+sumMedium+" рублей");

        System.out.println("________________________");

        System.out.println("Четвертая задача");

        char name[] = " чивонавИ навИ вонавИ".toCharArray();
        for (int i = name.length-1; i >0; i--) {
            System.out.print(name[i]);
        }
       }

    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
            // System.out.println(i+" - "+arr[i]);
        } return arr;
    }
}

/**
 *
 public class Main {
 public static void main(String[] args) {
 int[] arr = generateRandomArray();
 }
 };

 public static int[] generateRandomArray() {
 java.util.Random random = new java.util.Random();
 int[] arr = new int[30];
 for (int i = 0; i < arr.length; i++) {
 arr[i] = random.nextInt(100_000) + 100_000;
 }
 return arr;
 }
 */