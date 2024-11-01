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
                Scanner menu = new Scanner(System.in);
                System.out.println("----------------------------------------------------------");
                System.out.println("Bienvenidos al lab #4. Que desea hacer?");
                System.out.println("1. Conversion decimal-binario");
                System.out.println("2. Validar correo");
                System.out.println("3. Formar palabra");
                System.out.println("4. Salir");
                resp = menu.nextLine().charAt(0);
                
                 switch(resp){
                       case '1':
                            System.out.println("------------------------------------------------");
                            System.out.println("Has selecionado convertir un decimal a binario");
                            
                            String bi;
                            boolean vad;
                            do{
                                System.out.println("Ingrese una cadena binaria:");
                                bi = menu.nextLine();
                                vad= bi.length() == 8;
                                for (int i = 0; i < bi.length() && vad; i++) {
                                    if (bi.charAt(i) != '0' && bi.charAt(i) != '1') {
                                        vad = false;
                                    }
                                }
                                if(!vad){
                                    System.out.println("Cadena invalida. Ingrese otra.");
                                }
                            }while(!vad);
                            
                            int dec = binario(bi);
                                System.out.println("El valor decimal es " + dec);
                             break;
                             
                       case '2':
                           System.out.println("----------------------------------------");
                           System.out.println("Has selecionado la validacion de correo");
                           System.out.println("Ingrese correo:");
                           String correo = menu.nextLine();
                           
                           int 
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                    }        
            }while(resp !='4');
        }
    public static int binario(String binario){
        int dec = 0;
        int exp = 0;
        for (int i = binario.length()-1; i>=0; i--){
            if (binario.charAt(i) == '1'){
                dec += Math.pow(2,exp);
            }
            exp++;
        }
        return dec;
    }
}
            
    
    
    

    

