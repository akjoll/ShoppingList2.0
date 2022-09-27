package com.example.shoppinglist20.Main

fun main() {
    //create a list with int elements elements
    val list:List<Int> = listOf(1,2,3)
    println("\nlist : ${list}")

    var sum = list.sumOf{it*2}
    println("Sum of all elements after multiplyying each element by 2 : ${sum}")

    sum = list.sumOf{it * it}
    println("Sum of all elements after square each element : ${sum}")
}