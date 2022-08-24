import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.print("Digite el precio de la pieza del automovil:");
        float precio=scanner.nextFloat();scanner.nextLine();
        System.out.print("Digite la ganacia que desee adquirir del precio en porcentajes: ");
        float ganacia= scanner.nextFloat();scanner.nextLine();
        ganacia/=100;
        ganacia*=precio;
        System.out.println("Deberias vender este producto a: "+(precio+ganacia));
        
    }
}