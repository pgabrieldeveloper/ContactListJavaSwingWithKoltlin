package business

import java.lang.Exception

class ContactBusiness {

    private fun validarAdicaoDeContato (nome: String, telefone:String) {
        if(nome == ""){
            throw Exception("Campo nome é obrigatorio");
        }
        if(telefone == "") {
            throw Exception("Campo Telefone é obrigatorio");
        }
    }

    private fun validarDelecaoDeContato(nome: String, telefone:String){
        if(nome == "" || telefone ==""){
            throw Exception ("É necessario selecionar um contato a ser excluido ");
        }
    }

    fun adicionarUmContato(nome: String, telefone:String){
        this.validarAdicaoDeContato(nome, telefone);
    }

    fun deletarUmContato(nome: String, telefone:String){
        this.validarDelecaoDeContato(nome,telefone);
    }


}