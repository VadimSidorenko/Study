import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Вадим Сидоренко on 19.06.2017.
 */
/*public class NewPRogram {
    public static void main(String[] args) {
        for (int n = 3; n < 1000; n++) {
            boolean Simple = true;

            for (int d = 2; d < n; d++) {
                if (n % d == 0) {
                    Simple = false;
                    break;
                }
            }

            if (Simple) {
                System.out.println(n + " простое!");
            }
        }
    }
} */



        /*int num;
        num = (new Random()).nextInt(10);
        System.out.println(num);
        if ((num / 2 * 2) == num) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        } */

       /* for (int i = 0; i < 10; i++) {
            int num;
            num = (new Random()).nextInt(10);
            System.out.println(num);
            if ((num / 2 * 2) == num) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }
        }
    }
}/*

     /* for (int i = 0; i < 5; i++) {
          System.out.println("Iteration " + i);
      } */

//  for (; ; ) {
//     System.out.println(" всегда люблю тебя, Cолнце моё ");
//      }
//   }


      /* int i = 0;
       while (i < 5) {
           /*System.out.println("Iteration " + i);
           i = i + 1;*/

           /*System.out.println("Iteration " + i);
           i += 1;*/

           /*System.out.println("Iteration " + i);
           i++;*/

//System.out.println("Iteration " + i++);

//System.out.println("Iteration " + ++i);


         /*  i += 1;
           System.out.println("Iteration " + i);

       }
    }
} */

//public class NewPRogram  {
//  public static void main(String[] args) {
//    int num;
//  for (num i = 0; i < 100; i / 2)

public class NewPRogram {
    public static void main(String[] args) {
        /*InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br=new BufferedReader(reader);*/

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите первое число");
            String str1 = br.readLine();
            int num1 = Integer.parseInt(str1);
            System.out.println(num1);

            System.out.println("Введите второе число");
            String str2 = br.readLine();
            int num2 = Integer.parseInt(str2);
            System.out.println(num2);

            System.out.println("Введите оператор");
            String operator = br.readLine();
            System.out.println(operator);

            /*if (operator.equals("+")) {
                int result = num1 + num2;
                System.out.println("Результат: " + result);
            }
            if (operator.equals("-")) {
                int result = num1 - num2;
                System.out.println("Результат: " + result);
            }
            if (operator.equals("/")) {
                int result = num1 / num2;
                System.out.println("Результат: " + result);
            }
            if (operator.equals("*")) {
                int result = num1 * num2;
                System.out.println("Результат: " + result);
            }*/

            /*if (operator.equals("+")) {
                int result = num1 + num2;
                System.out.println("Результат: " + result);
            } else {
                if (operator.equals("-")) {
                    int result = num1 - num2;
                    System.out.println("Результат: " + result);
                } else {
                    if (operator.equals("/")) {
                        int result = num1 / num2;
                        System.out.println("Результат: " + result);
                    } else {
                        if (operator.equals("*")) {
                            int result = num1 * num2;
                            System.out.println("Результат: " + result);
                        }
                    }
                }
            }*/

            /*if (operator.equals("+")) {
                int result = num1 + num2;
                System.out.println("Результат: " + result);
            }
            else if (operator.equals("-")) {
                int result = num1 - num2;
                System.out.println("Результат: " + result);
            }
            else if (operator.equals("/")) {
                int result = num1 / num2;
                System.out.println("Результат: " + result);
            }
            else if (operator.equals("*")) {
                int result = num1 * num2;
                System.out.println("Результат: " + result);
            }
            else {
                System.out.println("Оператор не поддерживается");
            }*/

            /*int result;
            if (operator.equals("+")) {
                result = num1 + num2;
            }
            else if (operator.equals("-")) {
                result = num1 - num2;
            }
            else if (operator.equals("/")) {
                result = num1 / num2;
            }
            else if (operator.equals("*")) {
                result = num1 * num2;
            }
            else {
                System.out.println("Оператор не поддерживается");
                return;
            }

            System.out.println("Результат: " + result);*/

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}