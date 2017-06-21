package zg.augusto

class ParametroSistema {

    static mapping = {
        table 'PARAMETROS_SISTEMA'
        id column: 'ID_PARAMETRO_SISTEMA'
        version false

        chave column: 'DS_CHAVE'
        valor column: 'DS_VALOR'
    }

    static constraints = {
        chave blank: false, maxSize: 255
        valor maxSize: 255
    }

    String chave
    String valor

}