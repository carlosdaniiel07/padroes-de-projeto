package br.com.carlos.factory.halfSimple.factory

import br.com.carlos.factory.halfSimple.models.IPhone
import br.com.carlos.factory.halfSimple.models.IPhoneX
import br.com.carlos.factory.halfSimple.models.IPhoneXSMax

class IPhoneXFactory : IPhoneFactory() {
    override fun createIPhone(level: String): IPhone? =
        when (level) {
            "standard" -> IPhoneX()
            "highEnd" -> IPhoneXSMax()
            else       -> null
        }
}