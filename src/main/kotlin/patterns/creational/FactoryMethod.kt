package patterns.creational

interface ProductoPendienteFactoryMethod {
    fun descripcion(): String
}

class PendientePersonalizado : ProductoPendienteFactoryMethod {
    override fun descripcion(): String = "pendiente personalizado"
}

abstract class TallerPendiente {

    fun prepararPedido(): String {
        val producto = crearProductoPendiente()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    protected abstract fun crearProductoPendiente(): ProductoPendienteFactoryMethod
}

class TallerLocal : TallerPendiente() {

    override fun crearProductoPendiente(): ProductoPendienteFactoryMethod {
        return PendientePersonalizado()
    }
}

class FactoryMethodDemo {

    fun ejecutar(): String {
        val taller: TallerPendiente = TallerLocal()
        return taller.prepararPedido()
    }
}
