package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val tatiane = Gerente("Tatiane N T Alves", "1212121221", 5000.00, "123senha")

    ImprimeRelatorioFuncionario.imprime(tatiane)

    TesteAutenticacao().autentica(tatiane)
}