package lista_05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num){
        val x = input.nextInt()
        val y = input.nextInt()

        if (y == 0) { println("divisao impossivel"); continue}

        println("%.1f".format( x/y.toFloat()))
    }
}