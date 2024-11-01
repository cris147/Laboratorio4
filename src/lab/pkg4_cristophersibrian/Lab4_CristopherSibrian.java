/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg4_cristophersibrian;

import java.util.Scanner;

/**
 *
 * @author BLINTEC
 */
public class Lab4_CristopherSibrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char resp;
        do{
            resp = menu();
            Scanner lab = new Scanner(System.in);
             if (resp == '1'){
                 System.out.println("------------------------------------------------");
                 System.out.println("Has selecionado convertir un decimal a binario");
                 System.out.println("Ingrese una cadena binaria:");
                 String bi = lab.nextLine();
                 
                 int lim = 8;
                if (bi.length()<=8) {
                    for (int i= 0; i<= lim; i++){
                        System.out.print(i);
                    }
                }else{
                    System.out.println("La cadena no es valida");
                    return;
                }
             } 
        
        }while(resp !=3);
    }
    

   public static char menu(){
        Scanner menu = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Bienvenidos al lab #4. Que desea hacer?");
        System.out.println("1. Conversion decimal-binario");
        System.out.println("2. Validar correo");
        System.out.println("3. Salir");
        return menu.next().charAt(0);
    }
}