package br.com.carlos.factory.halfSimple.models

class IPhoneX : IPhone() {
    override fun getHardware() {
        println("\t- 5.8in Screen");
        println("\t- A11 Chipset");
        println("Hardware list");
        println("\t- 3Gb RAM");
        println("\t- 256Gb Memory");
    }
}