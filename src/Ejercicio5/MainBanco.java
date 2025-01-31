package Ejercicio5;

public class MainBanco {
    public static void main(String[] args) {

        Banco bbva = new Banco(1,"BBVA");
            Sucursal sucursalBbva1 = new Sucursal(1,"Castellón",bbva);
            bbva.addSucursal(sucursalBbva1);
            Sucursal sucursalBbva2 = new Sucursal(2,"Aragón",bbva);
            bbva.addSucursal(sucursalBbva2);

            Cliente jose = new Cliente("3231F","Jose");
            Prestec pJose = new Prestec(1,200,jose);
            jose.addPrestec(pJose);

        Banco santandader = new Banco(2,"Santander");
            Sucursal sucursalSantandader1 = new Sucursal(1,"Bilbao",santandader);
            santandader.addSucursal(sucursalSantandader1);
            Sucursal sucursalSantandader2 = new Sucursal(2,"Vigo",santandader);
            santandader.addSucursal(sucursalSantandader2);

        bbva.getSucursales().stream().forEach(System.out::println);

        jose.getPrestecs().forEach(System.out::println);
    }
}
