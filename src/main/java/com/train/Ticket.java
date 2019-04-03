package com.train;

public class Ticket {
    int piece; //張數
    int returnPiece; //來回張數

    public Ticket(int piece, int returnPiece) {
        this.piece = piece;
        this.returnPiece = returnPiece;
    }

    private float total() {
        int count = 1000 * piece;
        float count2 = 2000 * returnPiece * 0.9f;
        return count + count2;
    }

    public void print(){
        System.out.println("您購買了，單程張數: " + piece + "\t" +
                "來回張數: " + returnPiece + "\t" + "總金額: " + total());
    }




}
