package br.com.carlos.factory.after.factory

import br.com.carlos.factory.after.models.IPhone
import br.com.carlos.factory.after.models.IPhoneX

class IPhoneXFactory : IPhoneFactory() {
    override fun createIPhone(): IPhone = IPhoneX()
}