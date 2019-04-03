package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int exit = 0;
        Scanner scanner = new Scanner(System.in);

        while (exit != -1) {


            if (exit <= 0) {
                System.out.print("購買張數: ");
                int piece = scanner.nextInt();
                System.out.print("購買來回張數: ");
                int returnPiece = scanner.nextInt();
                Ticket ticket = new Ticket(piece, returnPiece);
                ticket.print();
            }


            System.out.println("\n如需繼續購買，請按下0。\n如不購買，請按下-1");
            exit = scanner.nextInt();
        }

        System.out.println("已離開購票系統");
    }
}
