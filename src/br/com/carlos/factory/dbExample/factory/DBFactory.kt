package br.com.carlos.factory.dbExample.factory

import br.com.carlos.factory.dbExample.model.DB
import br.com.carlos.factory.dbExample.model.DbType

interface DBFactory {
    fun getInstance(type: DbType): DB
}