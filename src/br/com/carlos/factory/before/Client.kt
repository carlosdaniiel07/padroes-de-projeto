package br.com.carlos.factory.before

import br.com.carlos.factory.before.models.*

class Client {
    public fun orderIPhone(generation: String, level: String): IPhone {
        val device = if (generation == "X") {
            if (level == "standard") IPhoneX() else if (level == "highEnd") IPhoneXSMax() else null
        } else {
            if (level == "standard") IPhone11() else if (level == "highEnd") IPhonePro() else null
        }

        device?.let {
            device.getHardware()
            device.assemble()
            device.certificates()
            device.pack()
        }

        return device!!
    }
}