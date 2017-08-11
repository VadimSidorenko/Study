import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Вадим Сидоренко on 17.07.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[300];

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            /*boolean turnedIn = true;
            while (turnedIn) {
                System.out.println("ПРИВЕТ");
                System.out.print("Продолжить? : ");

                String a = br.readLine();
                if (!a.equals("да")) {
                    turnedIn = false;
                    System.out.println("Досвиданья!");
                }
            }*/

            /*boolean turnedIn;
            do {
                System.out.println("ПРИВЕТ");
                System.out.print("Продолжить? : ");

                String a = br.readLine();
                if (!a.equals("да")) {
                    turnedIn = false;
                    System.out.println("Досвиданья!");
                } else {
                    turnedIn = true;
                }
            } while (turnedIn);*/

            /*int i = 0;
            while ( i < 6) {
                System.out.println(i);
                i++;
            }*/

         /*   for (int i=0; i<6; i++) {
                System.out.println(i);
            } */
        } catch (Exception e) {
        }

        /*
        arr[0] = 2;
        arr[1] = 3;

        System.out.println(arr[0]);
        System.out.println(arr[3]);
        */

        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int i = 0;
        swhile (i < arr.length) {
            arr[i] = i + 1;
            i++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

     /*   System.out.print("   ");
        for (int x = 1; x <= 10; x++) {
            if (x < 10) {
                System.out.print(" ");
            }
            System.out.print(x);
            System.out.print(" ");
        }

        System.out.println();

        for (int y = 1; y <= 10; y++) {
            if (y < 10) {
                System.out.print(" ");
            }
            System.out.print(y);
            System.out.print(" ");

            for (int x = 1; x <= 10; x++) {
                int result = x * y;
                if (result < 10) {
                    System.out.print(" ");
                }
                System.out.print(result);
                System.out.print(" ");
            }

            System.out.println();
        } */

        /*int[] a = new int[100];
        int i = 0;
        while (i < 100) {
            a[i] = 1;
            i++;
        }*/

        Random random = new Random();

        int lenght = 5;

        int[] a = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            a[i] = random.nextInt(40) - 20;

        }

        for (int i = 0; i < lenght; i++) {
            System.out.println("Ячейка " + i + ": " + a[i]);
        }

        int sum = 0;
        for (int i = 0; i < lenght; i++) {
            //sum=sum+a[i];
            sum += a[i];
        }

        System.out.println("Сумма: " + sum);

        /*float sumF = sum;
        float average = sumF/lenght;*/
        float average = (float) sum / lenght;
        System.out.println("Среднее число: " + average);

        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                min = a[i];
                max = a[i];
            } else {
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }

        System.out.println("Min число: " + min);
        System.out.println("Max число: " + max);

        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) {
                System.out.println("Числа > среднего: " + a[i]);
            }
        }
    }
}

