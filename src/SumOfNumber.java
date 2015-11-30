
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lvhung
 */
public class SumOfNumber {

    public  void Sum() throws IOException {
        int n, sum = 0;
        //   int[] arr1 = null;
        System.out.println("Enter number element of sum");
        Scanner input = new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        //Add
        if (n < 0) {

            for (int i = 0; i >= n; i--) {
                sum += i;
            }
            System.out.println("Sum of " + n + " is : " + sum);

        } else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of " + n + " is : " + sum);

        }

    }

}
