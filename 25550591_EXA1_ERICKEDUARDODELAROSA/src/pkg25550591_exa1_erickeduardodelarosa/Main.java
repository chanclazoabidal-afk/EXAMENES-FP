/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550591_exa1_erickeduardodelarosa;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class Main {
    final static String PWD = "1234";   
    final static int SALDO_INICIAL = 5000;
    final static String CASO1 = "1";  
    final static String CASO2 = "2";   
    final static String CASO3 = "3";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contra, pulsaste;
        int saldo = SALDO_INICIAL; 
        int retirar;

        System.out.print("Ingresa tu Contraseña: "); 
        contra = input.nextLine();

        if (contra.equals(PWD)) {
            System.out.println("ACCESO PERMITIDO");

            System.out.println("1 Consultar saldo");
            System.out.println("2 Retirar dinero");
            System.out.println("3 Depositar dinero");
            pulsaste = input.nextLine();

            if (pulsaste.equals(CASO2)) {
                System.out.print("Cuánto vas a retirar?: ");
                retirar = input.nextInt();
                input.nextLine();
                if (retirar <= saldo) {
                    saldo -= retirar;
                    System.out.println("Tu nuevo saldo es: " + saldo);
                } else {
                    System.out.println("Fondos insuficientes");
                }
            } else if (pulsaste.equals(CASO3)) {
                System.out.print("Cuánto vas a depositar?: ");
                int deposito = input.nextInt();
                input.nextLine();
                saldo += deposit; // ERROR: nombre de variable mal escrito
                System.out.println("Depósito exitoso. Tu nuevo saldo es: " + saldo);
            } else if (pulsaste.equals(CASO1)) {
                System.out.println("Tu saldo es: " + saldo);
            } else {
                System.out.println("Opción no válida");
            }

        } else {
            System.out.println("ACCESO NEGADO");
        }

        input.close();
    }
}