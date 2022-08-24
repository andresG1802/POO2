import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Digite la distancia entre las ciudades(en km): ");
        float distancia=scanner.nextFloat();scanner.nextLine();
        System.out.println("Digite la velocidad(km/h): ");
        float velocidad=scanner.nextFloat();scanner.nextLine();
        System.out.print("El tiempo que se demora en llegar es: "+(int)(distancia/velocidad)+" horas");
    }
}