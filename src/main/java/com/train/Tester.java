package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("購買張數: ");
        Scanner scanner = new Scanner(System.in);
        int piece = scanner.nextInt();
        System.out.print("購買來回張數: ");
        int returnPiece = scanner.nextInt();
        Ticket ticket = new Ticket(piece, returnPiece);
        ticket.print();
    }
}
