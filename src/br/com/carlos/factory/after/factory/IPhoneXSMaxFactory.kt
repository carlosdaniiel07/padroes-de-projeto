package br.com.carlos.factory.after.factory

import br.com.carlos.factory.after.models.IPhone
import br.com.carlos.factory.after.models.IPhoneXSMax

class IPhoneXSMaxFactory : IPhoneFactory() {
    override fun createIPhone(): IPhone = IPhoneXSMax()
}