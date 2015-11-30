
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
public class inDaySo {

    public  void sequence() {
        int n;
        System.out.println("Enter any number: ");
        Scanner num1 = new Scanner(System.in);
        n = Integer.parseInt(num1.nextLine());
        System.out.println("Your sequence:");
        if (n<0) {
            
            for (int i = 0; i >= n; i--) {
                
                System.out.print(i);
                
            }
           
        }
        else
        {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
                
            }
        }
    }
}
