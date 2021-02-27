package br.com.carlos.factory.before

class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val client = Client()

            println("### Ordering an iPhone X")
            val iphone = client.orderIPhone("X", "standard")
            println(iphone)

            println("### Ordering an iPhone 11 HighEnd")
            val iphone2 = client.orderIPhone("11", "highEnd")
            println(iphone2)
        }
    }
}