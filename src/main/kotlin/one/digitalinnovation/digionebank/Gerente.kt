package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
    ): Funcionario(nome, cpf, salario), Logavel{

    override fun calculaAuxilio(): Double = salario * 0.4

    //aqui implementamos a inteface
    override fun login(): Boolean = "123senha" == senha


}