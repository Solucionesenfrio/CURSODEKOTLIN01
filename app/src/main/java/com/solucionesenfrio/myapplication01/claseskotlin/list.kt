package com.solucionesenfrio.myapplication01.claseskotlin

fun main(){

   // inmutableList()

    mutableList()
}
fun inmutableList(){
    val readOnly:List<String> =listOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[2])
    println(readOnly.last())       // buscar al ultimo

 println(readOnly.first())            //buscar al primerp

    // filtrar

    val example =readOnly.filter { it.contains("a") }
println(example)

    readOnly.forEach{ weekDay -> println(weekDay) }



}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")

weekDays.add("aristeidei")     //  por defecto en el ultimo casilla
    weekDays.add(2,"aristeidei") //poniendo el numero aparece el valor

    println(weekDays)
if (weekDays.isEmpty()){
    // no voy a pintar nada pòr que no hay

}else{
    weekDays.forEach{ println(it) }
}
if (weekDays.isNotEmpty()){
    weekDays.forEach{println(it)}
}
for (subcribite in weekDays){

}

}