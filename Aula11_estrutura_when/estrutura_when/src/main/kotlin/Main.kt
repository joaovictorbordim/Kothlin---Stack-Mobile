fun main(args: Array<String>) {

    var opcao = 3

    /*when (opcao){
        1 -> println("Suco de Laranja")
        2 -> println("Suco de Uva")
        3 -> println("Suco de Morango")
        else -> println("Nenhuma opção validada.")
    }*/

    var mensagem = when(opcao){
        1 -> "SUCO DE LARANJA"
        2 -> "SUCO DE UVA"
        3 -> "SUCO DE MORANGO"
        else -> "NENHUM OPÇÃO SELECIONADA"
    }
        println(mensagem)
}