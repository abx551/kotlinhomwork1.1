import java.util.Scanner

fun main(args: Array<String>) {
    val user = User("Shax", "Shax003@gmail.com", 20, "Caster")

    val scanner = Scanner(System.`in`)

    println("Введите имя пользователя:")
    val username = scanner.nextLine()

    println("Введите email:")
    val email = scanner.nextLine()

    println("Введите возраст:")
    val age = scanner.nextInt()

    println("Введите пароль:")
    val password = scanner.next()

    val verifier = User(username, email, age, password)
    try {
        user.verify(verifier)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    scanner.close()
}