package br.com.carlos.factory.before.models

class IPhoneXSMax : IPhone() {
    override fun getHardware() {
        println("Hardware list");
        println("\t- 6.5in Screen");
        println("\t- A12 Chipset");
        println("\t- 4Gb RAM");
        println("\t- 512Gb Memory");
    }
}