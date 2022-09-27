import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int contMas = 0;
        int contMenos = 0;
        double media = 0;
        
        //Leer el número de personas
        do{
            System.out.print("Numero de personas : ");
            N = sc.nextInt();
        }while(N<=0);
        
        //Se crea el array de tamaño "N"
        double alto[] = new double[N];
        
        //Leer alturas
        System.out.println("Lectura de la altura de las personas : ");
        for(int i = 0; i<alto.length; i++) {
            System.out.print("Persona "+(i+1)+" = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; // se suma la estatura leída para calcular la media
        }
        
        //Calcular la media
        media = media / N;
        
        //Recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        for(int i = 0; i<alto.length;i++){
            if(alto[i]>media){ //si la estructura es mayor que la media
                contMas++;
            }else if(alto[i]<media){ //si es menor
                contMenos++;
            }
        }
        
        //Mostrar Resultados
        System.out.println("Estatura media : "+media);
        System.out.println("Personas con estatura superior a la media : "+contMas);
        System.out.println("Persona con estatura inferior a la media : "+contMenos);
    }
}
