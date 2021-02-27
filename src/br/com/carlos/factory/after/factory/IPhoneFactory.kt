package br.com.carlos.factory.after.factory

import br.com.carlos.factory.after.models.IPhone

abstract class IPhoneFactory {
    fun orderIPhone(): IPhone {
        val device = this.createIPhone()

        device.getHardware()
        device.assemble()
        device.certificates()
        device.pack()

        return device
    }

    protected abstract fun createIPhone(): IPhone
}