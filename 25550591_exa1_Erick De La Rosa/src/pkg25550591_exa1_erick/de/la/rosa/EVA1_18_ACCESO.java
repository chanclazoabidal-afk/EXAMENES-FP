
package eva1_18_acceso;

import java.util.Scanner;
public class EVA1_18_ACCESO {
    final static String PWD = "2007";
    final static String USUARIO = "memo";
    
    public static void main(String[] args) {
    String usuario, contra;
    Scanner input = new Scanner (System.in);
    System.out.println("bienvenido");
    System.out.println("cual es tu Usuario ");
    usuario = input.nextLine();
    System.out.print("ingresar Contraseña");
    contra = input.nextLine();
    if(usuario.equals(USUARIO)){
    if(contra.equals(PWD)) {
        System.out.println("ACCESO PERMITIDO");
    }else{
        System.out.println("ACCESO NEGADO");
    }
    }else{
        System.out.println("ACCESO NEGADO, LAS CRDENCIALES SON INCORRECTAS");
        }
      }    
}
