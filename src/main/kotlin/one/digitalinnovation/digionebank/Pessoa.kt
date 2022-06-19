package one.digitalinnovation.digionebank

abstract class Pessoa (
    //colocamos a classe pessoa como open para que as classes que herdem de pessoa possam
    // sobrescrever as propriedades da classe Pessoa ao herdar -> "polimorfismo"
     val nome: String = "Alves",
     val  cpf: String = "123.123.123.12"
)