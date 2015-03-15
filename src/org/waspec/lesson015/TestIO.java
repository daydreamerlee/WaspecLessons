package org.waspec.lesson015;

import org.waspec.lesson014.Calculator;

import java.io.*;

/**
 * Created by Administrator on 2015/2/25.
 */
public class TestIO {
    public static void testStandardIO() {
        Integer x, y;
        Calculator calculator;
        System.out.println("Please insert two numbers:");
        try {
            while (true) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                x = Integer.parseInt(bufferedReader.readLine());
                y = Integer.parseInt(bufferedReader.readLine());
                calculator = new Calculator();
                int result = calculator.add(x, y);
                System.out.println(String.format("The result of %d + %d is %d", x, y, result));
                if (result == 99) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Something is wrong with your input, please check!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Something is wrong with your input, please check!");
            e.printStackTrace();
        }

    }

    public static void testFileIO() {
        int result = 0;
        String line;
        Integer number;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\test.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\result.txt"));
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    System.out.println("End of File.");
                    break;
                }
                number = Integer.parseInt(line);
                System.out.println(number.intValue());
                result += number;
            }
            System.out.println(result);

            bufferedWriter.write(String.format("The result is %d", result));
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found! Please Check!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File Error!");
            e.printStackTrace();
        }
    }
}
