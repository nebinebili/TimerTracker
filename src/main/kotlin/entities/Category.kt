package entities

import java.time.LocalTime

class Category:BaseEntity {
    var id:Int
    var name: String
    var color:String
    var projects = listOf<Project>()

    constructor(name:String,color:String){
        this.name=name
        this.color=color
        this.id= baseid
        baseid++
    }
}