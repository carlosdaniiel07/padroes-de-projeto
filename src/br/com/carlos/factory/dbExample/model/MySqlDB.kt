package br.com.carlos.factory.dbExample.model

class MySqlDB : DB {
    private val prefix = "[MySqlDB]"

    override fun query(sql: String): Collection<Any> {
        println("$prefix - executando consulta: $sql")
        return listOf()
    }

    override fun execute(sql: String) {
        println("$prefix - executando SQL: $sql")
    }
}