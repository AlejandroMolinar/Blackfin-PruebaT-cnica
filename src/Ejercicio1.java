/***********************************************************************************
 * Escribe, en el lenguaje de programación que desees, un programa que muestre     *
 * en pantalla los números del 1 al 100, sustituyendo los múltiplos de 3 por el    *
 * palabro “VIN” y, a su vez, los múltiplos de 5 por “CLE”. Para los casos que, al *
 * tiempo, son múltiplos de 3 y 5, utiliza el combinado “VINCLE”.                  *
 ***********************************************************************************/

public class Ejercicio1 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i++) {
            //Multipo de 5 y 3
            if(i%5 == 0 && i%3 == 0){
                System.out.println("VINCLE");
            }
            //Multipo de 3
            else if(i%3 == 0){
                System.out.println("VIN");
            }
            //Multipo de 5
            else if(i%5 == 0){
                System.out.println("CLE");
            }else{
                System.out.println(i);
            }
        }
    }
}