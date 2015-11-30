
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
public class Assignment1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int keyboard = 0;

        while (keyboard < 4) {
            System.out.println("1-Print message");
            System.out.println("2-Sum sequence");
            System.out.println("3-Print sequence");
            System.out.println("4-Quit");

            Scanner num1 = new Scanner(System.in);
            keyboard = Integer.parseInt(num1.nextLine());
            switch (keyboard) {
                case 1:
                    PrintMessage.Hello();
                    break;
                case 2:
                    new SumOfNumber().Sum();
                    break;
                case 3:
                    new inDaySo().sequence();
                    break;
                default:
                    break;
            }

        }

    }

}
