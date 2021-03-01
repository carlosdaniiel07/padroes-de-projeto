package br.com.carlos.factory.dbExample

import br.com.carlos.factory.dbExample.factory.DBFactory
import br.com.carlos.factory.dbExample.factory.DBSimpleFactory
import br.com.carlos.factory.dbExample.model.DB
import br.com.carlos.factory.dbExample.model.DbType
import br.com.carlos.generic.Example

class Client : Example {
    override fun runExample() {
        val factory: DBFactory = DBSimpleFactory()
        val mysql: DB = factory.getInstance(DbType.MySQL)

        mysql.query("SELECT * FROM product")
        mysql.execute("UPDATE product SET active = 0 WHERE id = 42")
    }
}