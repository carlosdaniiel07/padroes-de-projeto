package br.com.carlos.factory.halfSimple.models

abstract class IPhone {
    public abstract fun getHardware(): Unit

    public fun assemble(): Unit = println("Assembling all the hardwares")

    public fun certificates(): Unit = println("Testing all the certificates")

    public fun pack(): Unit = println("Packing the device")
}