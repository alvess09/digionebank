package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculaAuxilio(): Double
    override fun toString(): String = """
        nome: $nome,
        cpf: $cpf,
        Salario: $salario,
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()
}