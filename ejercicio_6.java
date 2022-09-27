import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                int aleat = (int) (Math.random()*20 + 1) ;
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = "+aleat);
                matriz[i][j] = aleat;
                //matriz[i][j] = sc.nextInt();
                if(i+j == (matriz.length - 1)){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }  
        
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        
        System.out.println("La suma de la diagonal secundaria es : "+sumaDiagonal);
    }
}