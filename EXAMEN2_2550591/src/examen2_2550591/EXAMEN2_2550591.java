/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_2550591;
import java.util.Scanner;

public class EXAMEN2_2550591 {


    public static void main(String[] args) {

        int numeero1;
        Scanner lee = new Scanner(System.in);

        System.out.print("Pon un numero entero");
        numeero1 = lee.nextInt();

        
        System.out.println("1  primos");              
        System.out.println("2  no primos");
        
        int opci = lee.nextInt();

        System.out.println("el resutlado es");

        for(int n=2; n<=numeero1; n++){

            boolean esPrim = true;

            for(int x=2; x<=n/2; x++){
                if(n % x == 0){
                    esPrim = false;
                    break;
                }
            }

            if(opci == 1){
                if(esPrim == true){
                    System.out.print("num "+ n);
                    for(int j=1; j<=n; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if(opci == 2){
                if(esPrim == false){
                    System.out.print("num "+ n);
                    for(int j=1; j<=n; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                              }
                         }
                                 }

    }
}
