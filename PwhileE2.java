 /*
 * @author Silvia Martinez
 */

import java.util.Scanner;

public class PwhileE2 {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner (System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pincorrecto = 1234567;
        int correcto = 0;
        System.out.println("Acceso al sistema. !");
        while (correcto <= 0) {
            System.out.print("Favor de ingresar usuario " );
            usuario = scanner.nextLine();
            //Entradas
            System.out.print("Favor de ingresar su pin " );
            pin = scanner.nextInt();
            //verificar 
            if ((usuario.equals(usuarioCorrecto))&&(pin == pincorrecto)) {
                correcto = 1;
            }
            System.out.println("Su Usuario y/o pin es incorrecto.! ");
              usuario = scanner.nextLine(); //reseteo(resetear) String
        }
             System.out.println("Sea usted bienvenido a nuestro sistem.!!");
             scanner.close();
    }
}
