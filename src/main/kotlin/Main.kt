import entities.Project
import entities.User
import java.time.LocalTime

fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val time = LocalTime.of(3, 15, 10)
    println(LocalTime.now())

    var project=Project(name = "project123", color = "sasdasd")
    /*var user1= User("nebi","nebili", password = "1233", userName = "nebili23" )
    var user2= User("nesbi","neasbili", password = "12as33", userName = "nebisali23" )
    println(user1.id)
    println(user2.id)*/
}