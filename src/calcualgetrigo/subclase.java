package calcualgetrigo;

import java.util.Scanner;

public class subclase {
    
    public static String calcular(int opc){
        Scanner entrada = new Scanner(System.in);
        String O="Finalizando Aplicacion...";

        switch (opc){
            case 1:
                System.out.println(subclase.algebra());
                break;
            case 2:
                System.out.println(subclase.trigo());
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
        return O;
    }
    
    public static String algebra(){
        int opc;
        Double num1,num2,result=null;
        String resualgeb;
        Scanner entrada = new Scanner( System.in );
        System.out.print("Digite la operacion a ejecutar\n1. sumar \n2. restar \n3. multiplicacion \n4. division");
        opc=entrada.nextInt();
        System.out.print("Escriba el primer numero");
        num1=entrada.nextDouble();
        System.out.print("Escriba el segundo numero");
        num2=entrada.nextDouble();
        
        switch (opc)
        {
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
               break;
            case 4:
                result=num1/num2;
               break;
            default:
                System.out.println("error");
                break;
        }
        resualgeb="El resultado es: "+result;
        return resualgeb;
    }
    
    public static String trigo(){
        Scanner entrada = new Scanner( System.in );
        double angulo = 0,valor = 0,anguloaRadianes;
        int oper;
        String resutri;
        System.out.print("Escriba el numero a operar");
        angulo=entrada.nextInt();
        anguloaRadianes=Math.toRadians(angulo);
        System.out.print("Digite la opcion que desea realizar\n1. coseno\n2. seno\n3. tangente\n4. coseno\n5. cotangente\n6. cosecante");
        oper=entrada.nextInt();        
        
        switch (oper) {
            case 1:
                valor = Math.cos(anguloaRadianes);
                resutri="Coseno de "+angulo+"º = "+valor;
                break;
            
            case 2:
                valor = Math.sin(anguloaRadianes);
                resutri=("Seno de "+angulo+"º = "+valor);
                break;
            
            case 3:
                valor = Math.tan(anguloaRadianes);
                resutri=("Tangente de "+angulo+"º = "+valor);
                break;
            case 4:
                anguloaRadianes = Math.acos(valor);
                angulo = Math.toDegrees(anguloaRadianes);
                resutri=("Arco Coseno de "+valor+" = "+angulo+"º");
                break;
            case 5:
                anguloaRadianes = Math.asin(valor);
                angulo = Math.toDegrees(anguloaRadianes);
                resutri=("Arco Seno de "+valor+" = "+angulo+"º");
                break;
            case 6:
                anguloaRadianes = Math.atan(valor);
                angulo = Math.toDegrees(anguloaRadianes);
                resutri=("Arco Tangente de "+valor+" = "+angulo+"º");
                break;

            default:
                resutri=("error");
                break;
        }
        return resutri;
    }
}