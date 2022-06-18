package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12 )

    //consegimos usar a copia de objetos que estendem a Dataclasses
    val banco2 = digiOneBank.copy(nome = "Bradesco")
   println(banco2.info())

}