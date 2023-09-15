package com.solucionesenfrio.myapplication01.claseskotlin

fun main(){
    ifInt()
    ifBasico()
    ifAnimado()
    ifBoolean()
    ifMultiple()
    ifMultibleOr()

}

fun ifMultibleOr(){
    var isHappy=true
var pet ="dog"

//    if (pet == "dog"){
  //      println("Es un gato o un perro ")
    //}
    //if (pet == "cat"){
     //   println("Es un gato o un perro ")
   // }
//if (pet=="dog"|| pet== "cat" ){                                   //or y &&
  //  println("mi mascota es una o otra  imprime esto ")
//}
    if (pet=="dog"||( pet== "cat"&& isHappy )){               //super condiciones
        println("mi mascota es una o otra  imprime esto ")
    }else{
        println("no se cumplen las dos condiciones ")
    }

}






fun ifBasico(){
   val name ="Aris"
    //val name ="pablo cruz"
    if (name=="Aris"){
println ("oye si es igual a Aris ")

    }else{
        println("este no es Aris ")

    }
}

fun ifAnimado(){
    val animal="bird" +
            ""
  if(animal== "dog"){                         //se usa el primer if sin else

     println("Es un perrito ")
 }

     else if(animal== "bird"){
         println("Es un es un pajaro  ")
     }

         else if(animal== "cat"){
             println("Es un gatito  ")
         }else{                                   //se usa un ultimo else
       println("No es un ninmguno ")
 }

}

fun ifBoolean(){
    var Soyfeliz:Boolean = true

    if (!Soyfeliz)                 //signo de exclamacion ! true es falso
        println("soy muy feliz")
}

fun ifInt(){
    var age = 9
    if (age>=18){
        println("Puedes beber cervezas")
    }else{
        println("solo puedes beber jugo  ")
    }

}

fun ifMultiple(){

    var inHappy= true
    var age =16
    var parentPermission = true

    if (age>=17&& parentPermission&&inHappy){
            println("puedes beber serveza")
    }else{
        println ("solo puedes beber jugo ")
    }
    }


   // if (age>=17){
     //   if (!parentPermission){
  //          println("puede beber cerveza ")
   //     }else{
   //         println("beber jugo ")
    //    }

  //  }



