fun main(args: Array<String>) {

    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos", "Frango")
    var indice = 0

    // Estrutura de repetição - While (Enquanto)
    //while (indice <= 8){

    // Estrutura utilizando lista.size - Obs.: Deve-se utilizar size-1 para correção do erro, pois o size acrescenta um novo item.
    while (indice <= listaCompras.size-1){
        println(listaCompras[indice])
        indice++
    }
}