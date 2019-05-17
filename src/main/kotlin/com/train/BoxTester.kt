package com.train

import java.util.*

fun main(args: Array<String>) {

    var length: Float
    var width: Float
    var height: Int

    var scanner = Scanner(System.`in`)

    print("請輸入長度: ")
    length = scanner.nextFloat()
    print("請輸入寬度: ")
    width = scanner.nextFloat()
    print("請輸入高度: ")
    height = scanner.nextInt()

    val box3Kt = Box3Kt()
    val box5Kt = Box5Kt()

    if (box3Kt.validate(length, width, height)){
        println("可選擇Box3")
    } else if (box5Kt.validate(length, width, height)){
        println("可選擇Box5")
    } else {
        println("不符合容量大小！")
    }
}

open class BoxKt(var length: Float, var width: Float, var height: Int) {
    open fun validate (length: Float, width: Float, height: Int): Boolean =
        (length <= this.length && width <= this.width && height <= this.height)
}

class Box3Kt: BoxKt(23f,14f,13)

class Box5Kt: BoxKt(39.5f, 27.5f, 23)