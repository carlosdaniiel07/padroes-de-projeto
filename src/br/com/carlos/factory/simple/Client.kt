package br.com.carlos.factory.simple

import br.com.carlos.factory.simple.factory.IPhoneSimpleFactory
import br.com.carlos.generic.Example

class Client : Example {
    override fun runExample() {
        println("### Ordering an iPhone X")
        val iphone = IPhoneSimpleFactory.orderIphone("X", "standard")
        println(iphone)

        println()
        println()
        println()

        println("### Ordering an iPhone 11 HighEnd")
        val iphone2 = IPhoneSimpleFactory.orderIphone("11", "highEnd")
        println(iphone2)
    }
}