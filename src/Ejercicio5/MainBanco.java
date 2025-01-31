package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MainBanco {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();

        Banco bbva = new Banco(1,"BBVA");
        bancos.add(bbva);
            Sucursal sucursalBbva1 = new Sucursal(1,"Castellón",bbva);
                bbva.addSucursal(sucursalBbva1);
            Sucursal sucursalBbva2 = new Sucursal(2,"Aragón",bbva);
                bbva.addSucursal(sucursalBbva2);

            Cuenta cJose = new Cuenta(1,sucursalBbva1);
                sucursalBbva1.addCuenta(cJose);

            Cliente jose = new Cliente("3231F","Jose");
                jose.addCuenta(cJose);
                cJose.addCliente(jose);

            Cliente carmen = new Cliente("5453X","Carmen");
                carmen.addCuenta(cJose);
                cJose.addCliente(carmen);

            Prestec pJose = new Prestec(1,200,jose,sucursalBbva1);
                jose.addPrestec(pJose);
                sucursalBbva1.addPrestec(pJose);

            Domiciliacion dom1 = new Domiciliacion(1,"Agua",350,cJose);
                cJose.addDomiciliacion(dom1);

        Banco santandader = new Banco(2,"Santander");
        bancos.add(santandader);
            Sucursal sucursalSantandader1 = new Sucursal(1,"Bilbao",santandader);
            santandader.addSucursal(sucursalSantandader1);
            Sucursal sucursalSantandader2 = new Sucursal(2,"Vigo",santandader);
            santandader.addSucursal(sucursalSantandader2);

            Cuenta cJavi = new Cuenta(1,sucursalSantandader2);
                sucursalSantandader2.addCuenta(cJavi);

            Cliente javi = new Cliente("4826G","Javi");
            javi.addCuenta(cJavi);
            cJavi.addCliente(javi);

        for(Banco banco : bancos) {
            System.out.println(banco);
            for(Sucursal sucursal : banco.getSucursales()) {
                System.out.println("\t" + sucursal);
                for(Cuenta cuenta : sucursal.getCuentas()) {
                    System.out.println("\t\t" + cuenta);
                    for(Domiciliacion domiciliacion : cuenta.getDomiciliaciones()) {
                        System.out.println("\t\t\t" + domiciliacion);
                    }
                }
            }
        }
    }
}
