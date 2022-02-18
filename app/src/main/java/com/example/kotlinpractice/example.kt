package com.example.kotlinpractice

fun main() {
    val num1 = 10
    if (num1 > 0) println("num1 > 0")

    val arrList = arrayListOf<Int>()
    for (i in 1..num1) {
        arrList.add(i)
    }
    println(arrList.toString())

    for (i in arrList.size downTo 1 step 2) {
        print("$i ")
    }
    println()
    for (i in 0 until arrList.size ) {
        if ((arrList[i] % 2) != 0) {
            print(arrList[i].toString() + " ")
        }
    }
    println()
    when(num1) {
        5 -> arrList.add(num1)
        10 -> arrList.add(500)
        else -> arrList.add(200)
    }
    print(arrList.toString())


}