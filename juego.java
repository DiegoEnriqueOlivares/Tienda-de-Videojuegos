package TiendaJuegos;

import java.util.Scanner;

public class juego {
    public static Scanner sca = new Scanner(System.in);

    public static int mostrar(int c){
        int op;
        System.out.println("\nCliente #"+c+"\n" +
                "Tenemos los siguientes juegos:\n" +
                "1. The Legend of Zelda: Breath of the Wild - $59.99\n" +
                "2. Red Dead Redemption 2 - $69.99\n" +
                "3. FIFA 22 - $79.99\n" +
                "4. Cyberpunk 2077 - $89.99\n" +
                "5. The Last of Us Part II - $99.99\n" +
                "6. Assassin's Creed Valhalla - $109.99  \nIngrese el número del juego que desea comprar (ingrese 0 para finalizar):");
        op = sca.nextInt();
        return op;
    }
    public static void main(String[] args) {
        double LoZ = 59.99, RDR = 69.99, FF = 79.99, CyP = 89.99, TLoUs = 99.99, Assa = 109.99,sumaV = 0,sumaT=0;
        String Loz = "The Legend of Zelda: Breath of the Wild", RdR = "Red Dead Redemption 2", ff = "FIFA 22", CyPu = "Cyberpunk 2077", TloUs = "The Last of Us Part II", assa = "Assassin's Creed Valhalla";
        int opc,conL = 0, conR = 0, conF = 0, conC = 0, conT = 0, conA = 0, clien = 0,Tcom=0;
        char res,res1;

        do {
            do {
                clien++;
                do {
                    opc = mostrar(clien);
                    if(opc==1){
                        conL++;
                        Tcom++;
                        sumaV=sumaV+LoZ;
                        System.out.println("Ha adquirido "+conL+" juego de "+Loz);
                        System.out.println("Subtotal: "+sumaV);
                    } else if (opc == 2) {
                        conR++;
                        Tcom++;
                        sumaV=sumaV+RDR;
                        System.out.println("Ha adquirido "+conR+" juego de "+RdR);
                        System.out.println("Subtotal: "+sumaV);
                    } else if (opc == 3) {
                        conF++;
                        Tcom++;
                        sumaV=sumaV+FF;
                        System.out.println("Ha adquirido "+conF+" juego de "+ff);
                        System.out.println("Subtotal: "+sumaV);
                    } else if (opc == 4) {
                        conC++;
                        Tcom++;
                        sumaV=sumaV+CyP;
                        System.out.println("Ha adquirido "+conC+" juego de "+CyPu);
                        System.out.println("Subtotal: "+sumaV);
                    } else if (opc == 5) {
                        conT++;
                        Tcom++;
                        sumaV=sumaV+TLoUs;
                        System.out.println("Ha adquirido "+conT+" juego de "+TloUs);
                        System.out.println("Subtotal: "+sumaV);
                    } else if (opc == 6) {
                        conA++;
                        Tcom++;
                        sumaV=sumaV+Assa;
                        System.out.println("Ha adquirido "+conA+" juego de "+assa);
                        System.out.println("Subtotal: "+sumaV);
                    }

                }while(opc!=0);

                if(Tcom>=5 || sumaV>=100){

                    System.out.println("\nTotal de la compra del Cliente #1: $"+sumaV+"\n" +
                            "¡Felicidades! Has obtenido un descuento del 10% en esta compra.\n" +
                            "Descuento aplicado: $"+(sumaV*0.10)+"\n" +
                            "Total a pagar: $"+(sumaV-(sumaV*0.10)));
                } else {

                    System.out.println("\nTotal de la compra del Cliente #1: $"+sumaV+"\n" +
                            "Total a pagar: "+sumaV);
                }
                System.out.println("\n¿Desea seguir comprando? No (n/N)  Si (s/S)");
                res1 = sca.next().charAt(0);
                sumaT=sumaT+sumaV;
                sumaV=0;
            }while(res1 == 's' || res1 == 'S');
            System.out.println("\n¿Quieres seguir vendiendo? No (n/N)  Si (s/S)");
            res = sca.next().charAt(0);
        } while (res == 's' || res == 'S');
        System.out.println("\nThe Legend of Zelda: Breath of the Wild: "+conL+ "copias vendidas.\n" +
                "Red Dead Redemption 2: "+conR+" copias vendidas.\n" +
                "FIFA 22: "+conF+" copias vendidas.\n" +
                "Cyberpunk 2077: "+conC+" copias vendidas.\n" +
                "The Last of Us Part II: "+conT+" copias vendidas.\n" +
                "Assassin's Creed Valhalla: "+conA+" copias vendidas.\n" +
                "\n" +
                "Resumen de ventas:\n" +
                "Total de clientes atendidos: "+clien+"\n" +
                "Total de ventas: $"+sumaT);
    }
}
