import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dame el valor de A: ");
        float a= scanner.nextFloat();scanner.nextLine();
        System.out.println("Dame el valor de B: ");
        float b=scanner.nextFloat();scanner.nextLine();
        System.out.println("Dame el valor de C: ");
        float c=scanner.nextFloat();scanner.nextLine();
        float triangulo=((a-c)*b)/2,rectangulo=(b*c),total=triangulo+rectangulo;
        System.out.println("El area es: "+ total );
    }
}