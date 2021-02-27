package br.com.carlos.factory.simple.models

class IPhonePro : IPhone() {
    override fun getHardware() {
        println("Hardware list");
        println("\t- 6.5in Screen");
        println("\t- A13 Chipset");
        println("\t- 4Gb RAM");
        println("\t- 512Gb Memory");
    }
}