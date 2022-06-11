package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Alves"
    var cpf: String = "123.123.123.12"

}
fun main(){
    val alves = Pessoa()
    println(alves.nome)
    println(alves.cpf)
}