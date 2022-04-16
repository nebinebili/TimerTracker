package entities

class User:BaseEntity {
    var id:Int
    var lastName:String
    var surName:String
    var userName: String
    var password: String
    var projects = listOf<Project>()

    constructor(lastName:String,surName:String,userName:String,password:String){
        this.lastName=lastName
        this.userName=userName
        this.surName=surName
        this.password=password
        this.id=baseid
        baseid++
    }
}