package br.com.carlos.factory.halfSimple.models.factory

import br.com.carlos.factory.halfSimple.models.IPhone
import br.com.carlos.factory.halfSimple.models.IPhone11

class IPhone11Factory : IPhoneFactory() {
    override fun createIPhone(level: String): IPhone? =
        when (level) {
            "standard" -> IPhone11()
            "highEnd" -> IPhone11()
            else       -> null
        }
}