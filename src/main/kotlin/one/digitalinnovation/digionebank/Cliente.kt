package one.digitalinnovation.digionebank

class Cliente(
    nome: String = "Alves",
    cpf: String = "123.123.123.12",
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel{
    override fun login(): Boolean = "123456" == senha
    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}