package br.com.carlos.factory.dbExample.model

class OracleDB : DB {
    private val prefix = "[OracleDB]"

    override fun query(sql: String): Collection<Any> {
        println("$prefix - executando consulta: $sql")
        return listOf()
    }

    override fun execute(sql: String) {
        println("$prefix - executando SQL: $sql")
    }
}