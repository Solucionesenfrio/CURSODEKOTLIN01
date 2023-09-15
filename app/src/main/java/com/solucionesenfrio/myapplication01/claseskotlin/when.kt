package com.solucionesenfrio.myapplication01.claseskotlin

fun getMonth1(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> {
            println("Julio")          //pedir varios print  entre llaves
            println("Julio2")
        }

        else -> println("ningun mes")
    }


}
fun getMonth(month: Int) {
    if (month == 1) {
        println("enero")
    } else
        if (month == 2) {
            println("febrero")
        } else
            if (month == 3) {
                println("marzo")
            } else
                if (month == 4) {
                    println("abril")
                } else
                    if (month == 5) {
                        println("mayo")
                    } else
                        if (month == 6) {
                            println("junio")
                        } else
                            if (month == 7) {
                                println("julio")
                            } else
                                if (month == 8) {
                                    println("agosto")
                                } else {
                                    println("no existe este mes ")
                                }
}
fun getTrimester(month: Int){
    when(month){
        1,2-> print("primer trimestre")
        // 2-> print("primer trimestre")  // Rangos de when
        3-> print("segundo trimestre")
        4-> print("segundo trimestre")
        5-> print("tercer trimestre")
        6-> print("tercer trimestre")
        7-> print("cuato semestre")
        8-> print("cuarto semenstre")
        9-> print("sexto semestre")
        10-> print("sexto semestre")
        else-> println("mes nop valido xxxxx")




    }
}
fun getSemester(month: Int){
    when(month){
        in 1..6-> println("primer semestre ")
        !in 7..12-> println("segundo semester  no valido  ")// signo de admiracion
        else-> println("ningun semestre")
    }

}
fun result(value:Any){

    when (value){
        is Int-> value+ value
        is String -> println(value)
        is Boolean ->if(value) println("holiw3")

    }

}


fun main() {
 //getMonth(2)
 //   getMonth1(5)
//getTrimester(8)
  //  getSemester(5)
   // result(true)
   // getReturn(2)

}

