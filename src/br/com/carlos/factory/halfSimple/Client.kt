package br.com.carlos.factory.halfSimple

import br.com.carlos.factory.halfSimple.factory.IPhone11Factory
import br.com.carlos.factory.halfSimple.factory.IPhoneFactory
import br.com.carlos.factory.halfSimple.factory.IPhoneXFactory
import br.com.carlos.generic.Example

class Client : Example {
    override fun runExample() {
        val genXFactory: IPhoneFactory = IPhoneXFactory()
        val gen11Factory: IPhoneFactory = IPhone11Factory()

        println("### Ordering an iPhone X")
        println(genXFactory.orderIPhone("standard"))

        println()
        println()

        println("### Ordering an iPhone 11 HighEnd")
        println(gen11Factory.orderIPhone("highEnd"))
    }
}