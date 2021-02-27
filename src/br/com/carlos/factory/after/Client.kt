package br.com.carlos.factory.after

import br.com.carlos.factory.after.factory.IPhone11ProFactory
import br.com.carlos.factory.after.factory.IPhoneFactory
import br.com.carlos.factory.after.factory.IPhoneXFactory

class Client {
    fun runExample(): Unit {
        val iphoneXFactory: IPhoneFactory = IPhoneXFactory()
        val iphone11ProFactory: IPhoneFactory = IPhone11ProFactory()

        println("### Ordering an iPhone X")
        val iphone = iphoneXFactory.orderIPhone()
        println(iphone)

        for(i in 1..3 step 1) {
            println()
        }

        println("Ordering an iPhone 11 HighEnd")
        val iphone2 = iphone11ProFactory.orderIPhone()
        println(iphone2)
    }
}