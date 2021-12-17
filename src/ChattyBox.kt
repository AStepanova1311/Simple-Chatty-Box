import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val yourName = scanner.nextLine()

    println("What a great name you have, $yourName!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $yourAge; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    val number = scanner.nextInt()
    for (i in 0..number) {
        println("$i!")
    }
    println("Completed, have a nice day!")
}