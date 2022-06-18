package one.digitalinnovation.digionebank

open class Pessoa (
    //colocamos a classe pessoa como open para que as classes que herdem de pessoa possam
    // sobrescrever as propriedades da classe Pessoa ao herdar -> "polimorfismo"
    open val nome: String = "Alves",
    open val  cpf: String = "123.123.123.12"
)