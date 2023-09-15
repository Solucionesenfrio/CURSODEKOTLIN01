package com.solucionesenfrio.myapplication01.claseskotlin

fun main(){

    var name1:String="marcelody"
    var name2:String="marcelody"
    var name3:String="marcelody"


    val weekDays= arrayOf("lunes","martes","miercoles" )
//indice 0 a 3
   // tamaño 4
    //println(weekDays[1])
    println(weekDays.size)
    if (weekDays.size >=4){
println(weekDays[2])
    }else{
        println("No hay mas valores en el arrays")
    }

    weekDays[0]="holita"
    println(weekDays[0])


    //bucles para Arrays
    for (position in weekDays.indices){
        println(weekDays[position])

    }
for ((position,value) in weekDays.withIndex()){
    println("la position $position,   contiene $value")
}
for (weekDay in weekDays){
    println("Ahora es $weekDay")
}
}