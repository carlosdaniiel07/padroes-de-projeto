package br.com.carlos.factory.dbExample.factory

import br.com.carlos.factory.dbExample.model.DB
import br.com.carlos.factory.dbExample.model.DbType
import br.com.carlos.factory.dbExample.model.MySqlDB
import br.com.carlos.factory.dbExample.model.OracleDB

class DBSimpleFactory : DBFactory {
    override fun getInstance(type: DbType): DB =
        when (type) {
            DbType.Oracle   -> OracleDB()
            DbType.MySQL    -> MySqlDB()
            else            -> OracleDB()
        }
}