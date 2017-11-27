
package exemplo.pkgswitch;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner res= new Scanner(System.in);
        metodos obx = new metodos();
        System.out.println(" **** MENU ****\n 1-LUNS\n 2-MARTES\n 3-MERCORES\n 4-XOVES\n 5-VENRES\n 6-SABADO\n 7-DOMINGO\n preme unha opcion");
        String op = res.next();
        obx.comparar(op);
        
        
        
    }
    
}
