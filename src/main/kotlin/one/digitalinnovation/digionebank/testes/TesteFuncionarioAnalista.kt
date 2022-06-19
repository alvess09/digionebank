package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val ariel = Analista("Alves", "123456789", 3.800)
    ImprimeRelatorioFuncionario.imprime(ariel)
}