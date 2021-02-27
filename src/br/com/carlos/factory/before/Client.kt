package br.com.carlos.factory.before

import br.com.carlos.factory.before.models.*
import br.com.carlos.generic.Example

class Client : Example {
    override fun runExample() {
        val client = Client()

        println("### Ordering an iPhone X")
        val iphone = client.orderIPhone("X", "standard")
        println(iphone)

        println("### Ordering an iPhone 11 HighEnd")
        val iphone2 = client.orderIPhone("11", "highEnd")
        println(iphone2)
    }

    private fun orderIPhone(generation: String, level: String): IPhone {
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