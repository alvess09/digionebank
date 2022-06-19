package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "José",
        cpf = "1234567892",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)

}