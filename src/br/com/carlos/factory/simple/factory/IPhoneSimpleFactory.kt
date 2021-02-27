package br.com.carlos.factory.simple.factory

import br.com.carlos.factory.simple.models.*

class IPhoneSimpleFactory {
    companion object {
        @JvmStatic
        fun orderIphone(generation: String, level: String): IPhone {
            val device: IPhone = if (generation == "x") {
                if (level == "standard") IPhoneX() else IPhoneXSMax()
            } else {
                if (level == "standard") IPhone11() else IPhonePro()
            }

            device.getHardware()
            device.assemble()
            device.certificates()
            device.pack()

            return device
        }
    }
}