package Repository

import Entity.ContactEntity

class ContatRepository {

    companion object {
        private val contactList = mutableListOf<ContactEntity>();

        fun save (contato: ContactEntity){
            contactList.add(contato);
        }
        fun deletar (contato: ContactEntity){

        }

        fun getList (): List<ContactEntity>{
            return contactList;
        }


    }

}