import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Importe de la compra: ");
        float precio_producto=scanner.nextFloat();scanner.nextLine();
        System.out.print("Ingrese las cantidades compradas: ");
        float cantidad=scanner.nextFloat();scanner.nextLine();
        System.out.print("Porcentaje de descuento del producto(Digite en porcentajes): ");
        float descuento= scanner.nextFloat();scanner.nextLine();
        float importe_venta=(precio_producto*cantidad)-((precio_producto*cantidad))*((descuento/100));

        System.out.println("Importe de compra: "+precio_producto*cantidad);
        System.out.println("Descuento: "+descuento+"% ");
        System.out.println("Importe de venta: "+importe_venta);
        

    }
}