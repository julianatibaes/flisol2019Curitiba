package com.flisol.combustivel

// essa é uma classe só pra mostrar como podemos criar
// sem precisar declarar os getters e setters igual era no java
// perceba que só a propriedade nome que é obrigatório
class Teste (
    val nome: String,
    var idade: Int = 18,
    var apelido: String = ""
)

// pra chamar basta
// val teste = Teste(nome = "Juliana", apelido = "J", idade = 31)
// só precisando passar o parâmetro nome, como obrigatório, por exemplo
// val teste = Teste(nome = "Juliana")