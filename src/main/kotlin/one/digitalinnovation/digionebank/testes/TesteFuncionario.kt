package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa1  = Pessoa("Ariel","123456789")
    println(pessoa1.nome)
    println(pessoa1.cpf)

    val ariel = Funcionario("Alves", "123456789", BigDecimal.valueOf(3.800))
    println(ariel.nome)
    println(ariel.cpf)
}