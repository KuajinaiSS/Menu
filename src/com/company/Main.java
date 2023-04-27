package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double frasco3KG = 1.8*3;// 1.8 * 3 * x
        double frasco5KG = 1.5*5;// 1.5 * 5 * y
        double frasco9KG = 1.2*9;// 1.2 * 9 * z

        double totalcompra = 0;
        double totalDia = 0;
        int KgDia = 0;
        int KgComprar = 0;
        int Nfactura = 0;
        int NumeroDeFrascos = 0;

        // pequeño ejemplo de lectura desde teclado

        System.out.println("Ingresar nuevo pedido:");
        System.out.println("[1] SI");
        System.out.println("[0] NO");
        // obtenemos valor desde teclado con scan.nextInt();
        int opcion1 = scan.nextInt();

        while(opcion1 !=0){
            System.out.println("================================");
            System.out.println("Ingrese una opcion:");
            System.out.println("[1] 3 Kg");
            System.out.println("[2] 5 Kg");
            System.out.println("[3] 9 Kg");
            System.out.println("[0] terminar pedido");

            int opcion2 = scan.nextInt();

            while(opcion2 != 0){
                switch (opcion2){

                    case 1:
                        System.out.println("================================");
                        System.out.println("Cuantos frascos de 3Kg va a comprar: ");
                        int x = scan.nextInt();
                        totalcompra = totalcompra + (x*frasco3KG);
                        NumeroDeFrascos = NumeroDeFrascos + x;
                        KgComprar = KgComprar + (3*x);

                        break;

                    case 2:
                        System.out.println("================================");
                        System.out.println("Cuantos frascos de 5Kg va a comprar: ");
                        int y = scan.nextInt();
                        totalcompra = totalcompra + (y*frasco5KG);
                        NumeroDeFrascos = NumeroDeFrascos + y;
                        KgComprar = KgComprar + (5*y);


                        break;

                    case 3:
                        System.out.println("================================");
                        System.out.println("Cuantos frascos de 9Kg va a comprar: ");
                        int z = scan.nextInt();
                        totalcompra = totalcompra + (z*frasco9KG);
                        NumeroDeFrascos = NumeroDeFrascos + z;
                        KgComprar = KgComprar + (9*z);


                        break;


                    default:
                        System.out.println("================================");
                        System.out.println("error");
                        break;
                }
                System.out.println("================================");
                System.out.println("Monto actual: "+totalcompra);
                System.out.println("Ingrese una opcion:");
                System.out.println("[1] 3 Kg");
                System.out.println("[2] 5 Kg");
                System.out.println("[3] 9 Kg");
                System.out.println("[0] terminar pedido");
                opcion2 = scan.nextInt();

            }
            Nfactura = Nfactura+1;
            System.out.println("================================");
            System.out.println("Factura N° "+Nfactura);
            System.out.println("Total frascos comprados: "+NumeroDeFrascos);
            System.out.println("Total Kg: "+KgComprar);
            System.out.println("Monto: $"+totalcompra);


            KgDia = KgDia + KgComprar;
            totalDia = totalDia + totalcompra;
            totalcompra = 0;


            System.out.println("================================");
            System.out.println("========fin de compra===========");
            System.out.println("================================");

            System.out.println("Ingresar nuevo pedido:");
            System.out.println("[1] SI");
            System.out.println("[0] NO");
            opcion1 = scan.nextInt();
        }
        System.out.println("================================");
        System.out.println("Monto total del dia: $"+totalDia);
        System.out.println("Total Kg vendidos: "+KgDia);
        System.out.println("cerrando sistema");
    }
}