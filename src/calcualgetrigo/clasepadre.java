package calcualgetrigo;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.Scanner;

public class clasepadre {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opci;
        System.out.print("Digite el numero segun requiera realizar el calculo\n1. Algebra\n2. Trigonometria");
        opci=entrada.nextInt();
        subclase.calcular(opci);
    
    }
    
    
}