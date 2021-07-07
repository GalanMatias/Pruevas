package lol;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        try{
        int num = dato.nextInt();
        System.out.println("lol: " + num);
        }catch(InputMismatchException ex){
            System.out.println("Eerr: " +ex.getMessage());        
        }catch(Exception e){
        System.out.println("Eerr: " +e.getMessage());
        }finally{
        System.out.println("Ingrese un numero");
        int num2 = dato.nextInt();
        System.out.println("lol: " + num2);
        }
    }
    
}
