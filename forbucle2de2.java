public class forbucle2de2  {

      public static void main(String[] args) {
        //variable
        int tabla, result;
        //bucle
      for (tabla = 1; tabla < 11; tabla++){
         System.out.println(" ----------------------------- ");
         System.out.println("Mostrando tabla del" + tabla);
         System.out.println(" ----------------------------- ");
         for (int i = 1;  i < 11; i++){
             result = tabla * i;
             //salida del resultado como el de printf de C
             System.out.println(tabla + "x" + i + "=" + result);
           }
        }
        
    }

}
    
