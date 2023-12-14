//p3-s2-e2
import java.util.Scanner;

public class For2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //variable
        int tabla, result;
        System.out.print("Que tabla desea mostrar:" );
        tabla = scanner.nextInt();
        //bucle
      for (int i = 1;  i < 11; i++){
          result = tabla * i;
          //salida del resultado como el de printf de C
          System.out.println(tabla + "x" + i + "=" + result);
        }
        scanner.close ();
    }

}


