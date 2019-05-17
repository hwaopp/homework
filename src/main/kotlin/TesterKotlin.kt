import java.util.*

fun main(args: Array<String>) {
    var exit = 0

    val scanner = Scanner(System.`in`)

    while (exit != -1) {

        if (exit <= 0) {
            print("購買張數: ")
            var piece = scanner.nextInt()
            print("購買來回張數: ")
            var returnPiece = scanner.nextInt()

            val tik = TicketKT(piece, returnPiece)
            tik.print()
        }

        println("\n如需繼續購買，請按下0。\n如不購買，請按下-1")
        exit = scanner.nextInt()
    }

    println("已離開購票系統")
}

class TicketKT(var piece: Int, var returnPiece: Int){
    fun print(){
        print(" 您購買了，單程張數: $piece \t來回張數: $returnPiece \t總金額: ${total()}")
    }

    private fun total(): Float {
        var count = 1000 * piece
        var count2 = 2000 * returnPiece * 0.9f
        var total = count + count2
        return total
    }
}
