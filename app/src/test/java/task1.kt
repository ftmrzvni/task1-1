import kotlin.math.E

fun fun1(a: Int, b: Int, c: Int ) {
    var max: Int = 0
    var min: Int = 0
    var average : Int = 0

    //FIND MAX
    if (a > b && a > c) {
        max = a
    }
    if (b > a && b > c){
        max = b
    }
    if (c > a && c > b) {
        max = c
    }

    println("The maximum number is : $max")

//FIND MIN
    if (b > a && c > a) {
        min = a
    }
    if (a > b && c > b) {
        min = b
    }
    if (a > c && b > c) {
        min = c
    }
    println("The minimum number is : $min")

//odd or even
    if (a % 2==0) {
        if (b % 2 == 0) {
            if (c % 2 == 0) {
                println("The even numbers are :$a , $b , $c ")
                println("The odd numbers are : ")
            }
        }
    }
    if (a % 2 == 1) {
        if (b % 2 == 0) {
            if (c % 2 == 0) {
                println("The even numbers are : $b , $c ")
                println("The odd numbers are : $a ")

            }
        }
    }
    if (a % 2 == 1) {
        if (b % 2 == 1) {
            if (c % 2 == 0) {
                println("The even numbers are : $c ")
                println("The odd numbers are : $a , $b  ")
            }
        }
    }
    if (a % 2 == 1) {
        if (b % 2 == 1) {
            if (c % 2 == 1) {
                println("The even numbers are : ")
                println("The odd numbers are : $a , $b , $c ")

            }
        }
    }
    if (a % 2 == 0) {
        if (b % 2 == 1) {
            if (c % 2 == 1) {
                println("The even numbers are :  $a ")
                println("The odd numbers are : $b , $c ")


            }
        }
    }
    if (a % 2 == 0) {
        if (b % 2 == 0) {
            if (c % 2 == 1) {
                println("The even numbers are :  $a , $b ")
                println("The odd numbers are : $c ")

            }
        }
    }
    if (a % 2 == 1) {
        if (b % 2 == 0) {
            if (c % 2 == 1) {
                println("The even numbers are :  $b ")
                println("The odd numbers are : $a , $c ")

            }
        }
    }
    if (a % 2 == 0) {
        if (b % 2 == 1) {
            if (c % 2 == 0) {
                println("The even numbers are : $a , $c ")
                println("The odd numbers are :  $b ")
            }
        }
    }
    average= (a+b+c)/3
    println("average= $average ")

}

fun main() {
    fun1(200,365,81)

}


