package br.com.carlos.factory.after.factory

import br.com.carlos.factory.after.models.IPhone
import br.com.carlos.factory.after.models.IPhone11

class IPhone11Factory : IPhoneFactory() {
    override fun createIPhone(): IPhone = IPhone11()
}