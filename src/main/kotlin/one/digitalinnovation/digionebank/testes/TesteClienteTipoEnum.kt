package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    //dessa forma conseguimos chamar a função diretamente da Enum Class ClienteTipo
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name}  ${elemento.descricao}")
    }

}