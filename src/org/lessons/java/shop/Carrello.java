package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Prodotto> carrello = new ArrayList<>();

        System.out.print("Quanti prodotti vuoi inserire nel carrello?");
        int productsNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productsNumber; i++) {
            System.out.println("\nProdotto " +  (i + 1) + ":");
            System.out.println("Inserisci il tipo di prodotto (Smartphone, Televisore, Cuffie): ");
            String type = scanner.nextLine().trim();

            System.out.println("Inserisci il nome del prodotto: ");
            String name = scanner.nextLine().trim();

            System.out.println("Inserisci il brand del prodotto: ");
            String brand = scanner.nextLine().trim();

            System.out.println("Inserisci il prezzo: ");
            BigDecimal price = new BigDecimal(scanner.nextLine());

            System.out.println("Inserisci l'iva: ");
            BigDecimal iva = scanner.nextBigDecimal();
            scanner.nextLine();

            if (type.equalsIgnoreCase("Smartphone")) {
                System.out.println("Inserisci il codice IMEI: ");
                String IMEICode = scanner.nextLine();
                System.out.println("Inserisci la quantità di memoria (in GB): ");
                int memory = scanner.nextInt();
                scanner.nextLine();
                carrello.add(new Smartphone(name, brand, price, iva, IMEICode, memory));
            } else if (type.equalsIgnoreCase("Televisore")) {
                System.out.println("Il televisore è smart (SI/NO): ");
                String smartResponse = scanner.nextLine().trim();
                boolean smart = smartResponse.equalsIgnoreCase("Si");
                System.out.println("Quanti pollici ha il televisore: ");
                int size = scanner.nextInt();
                carrello.add(new Televisore(name, brand, price, iva, smart, size));
            } else if (type.equalsIgnoreCase("Cuffie")) {
                System.out.println("Le cuffie sono cablate? (SI/NO): ");
                String cabledResponse = scanner.nextLine().trim();
                boolean cabled = cabledResponse.equalsIgnoreCase("Si");
                System.out.println("Di che colore sono le cuffie?: ");
                String color = scanner.nextLine();
                carrello.add(new Cuffie(name, brand, price, iva, cabled, color));
            } else {
                System.out.println("Tipo di prodotto non trovato. Prodotto ignorato");
            }
            if (scanner.hasNextLine()){
                scanner.nextLine();
            }
        }

        System.out.println("\nPossiedi una carta fedeltà? (SI/NO): ");
        String fidelity = scanner.nextLine().trim();
        boolean hasFidelity = fidelity.equalsIgnoreCase("Si");

        BigDecimal total = BigDecimal.ZERO;
        System.out.println("\n--- Contenuto del carrello ---");
        for (Prodotto p : carrello) {
            System.out.println(p.toString());
            if (hasFidelity) {
                total = total.add(p.getDiscountedPrice());
            } else {
                total = total.add(p.getPriceIVA());
            }
        }

        System.out.println("Totale: ");
        System.out.println(total.setScale(2,RoundingMode.HALF_UP));
        scanner.close();
    }
}
