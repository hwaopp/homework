package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("購買張數: ")
    var piece = scanner.nextInt()
    print("購買來回張數: ")
    var returnPiece = scanner.nextInt()

    val tik = TicketKT(piece, returnPiece)
    tik.print()
}

class TicketKT(var piece: Int, var returnPiece: Int){
    fun print(){
        var count = 1000 * piece
        var count2 = 2000* returnPiece * 0.9f
        var total = count + count2
        println("您購買了，單程張數: " + piece + "\t" +
                "來回張數: " + returnPiece + "\t" + "總金額: " + total)
    }
}
