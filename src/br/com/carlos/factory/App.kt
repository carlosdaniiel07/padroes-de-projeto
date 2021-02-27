package br.com.carlos.factory

import br.com.carlos.factory.before.Client
import br.com.carlos.generic.Example

class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val withoutFactory: Example = Client()
            val fullFactory: Example = br.com.carlos.factory.after.Client()
            val halfSimpleFactory: Example = br.com.carlos.factory.halfSimple.Client()
            val simpleFactory: Example = br.com.carlos.factory.simple.Client()

            // withoutFactory.runExample()
            // fullFactory.runExample()
            // halfSimpleFactory.runExample()
            simpleFactory.runExample()
        }
    }
}