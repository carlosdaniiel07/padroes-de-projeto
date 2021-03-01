package br.com.carlos.factory.dbExample.model

interface DB {
    fun query(sql: String): Collection<Any>
    fun execute(sql: String): Unit
}