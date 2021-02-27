package br.com.carlos.factory.halfSimple.factory

import br.com.carlos.factory.halfSimple.models.IPhone

abstract class IPhoneFactory {
    fun orderIPhone(level: String): IPhone {
        val device = this.createIPhone(level)

        device?.let {
            device.getHardware()
            device.assemble()
            device.certificates()
            device.pack()
        }

        return device!!
    }

    protected abstract fun createIPhone(level: String): IPhone?
}