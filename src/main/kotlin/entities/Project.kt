package entities

import helperClass.LocalTimeHelper
import java.time.LocalTime

class Project:BaseEntity {
    var id:Int
    var name:String
    var color:String
    var categoryId:Int
    var userId:Int
    var startTime: LocalTime? = null
    var endTime: LocalTime? = null
    var dailyTime:LocalTime?=null
    var isStarted:Boolean=false

    constructor(name:String,color:String,categoryId:Int,userId:Int){
        this.name=name
        this.color=color
        this.categoryId=categoryId
        this.userId=userId
        this.id= baseid
        baseid++
    }

    fun StartTime(project: Project){
        project.startTime=LocalTime.now()
    }
    fun DailyTime(project: Project){
        project.endTime= LocalTime.now()
        var differenceTime = project?.endTime?.toSecondOfDay()!! - project?.startTime?.toSecondOfDay()!!
        project.dailyTime=LocalTimeHelper.secondsToTime(differenceTime)
    }
}