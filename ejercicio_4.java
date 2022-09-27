import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        int[][] num = new int [3][3];
        Scanner numero = new Scanner(System.in);
        for(int i=0; i<num.length;i++){//Dimensión uno.
            for (int j=0;j<num.length;j++){//Dimensión dos.
                System.out.print("Ingrese los números:");
                num[i][j]=numero.nextInt();                
            }
        }
        System.out.println("Imprimiendo Tabla");
        for(int i=0;i<num.length;i++){
             System.out.println();
             for (int j=0;j<num.length;j++){
                 System.out.println(num[i][j]+"");
             }
         }
        System.out.println("\nSuma Fila.");
        int suma=0;
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                suma +=num[i][j];
            }
            System.out.println("Fila"+i+"="+suma);
            suma=0;
        }
        System.out.println("\nSuma Columna");
        for(int i =0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                suma +=num[j][i];            
            }
            System.out.println("Columna"+i+"="+suma);
            suma=0;
        }
    }
}
