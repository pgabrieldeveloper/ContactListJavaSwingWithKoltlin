package business

import Entity.ContactEntity
import Repository.ContatRepository
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
        val contato = ContactEntity(nome,telefone);
        ContatRepository.save(contato);
    }

    fun deletarUmContato(nome: String, telefone:String){
        this.validarDelecaoDeContato(nome,telefone);
    }

    fun getList (): List<ContactEntity>{
        return ContatRepository.getList();
    }


    fun countContatsSize(): String {
        val list = getList();
        return when {
            list.isEmpty() -> "0 Contatos";
            list.size == 1 -> "1 Contato";
            else -> "${list.size} Contatos";
        }

    }

}