package patterns.creational

interface Product {
    fun descripcion(): String
}

class PendientePersonalizado : Product {
    override fun descripcion(): String = "pendiente personalizado"
}

abstract class TallerPendiente {

    fun prepararPedido(): String {
        val producto = crearProducto()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    protected abstract fun crearProducto(): Product
}

class TallerLocal : TallerPendiente() {

    override fun crearProducto(): Product {
        return PendientePersonalizado()
    }
}

class FactoryMethodDemo {

    fun ejecutar(): String {
        val taller: TallerPendiente = TallerLocal()
        return taller.prepararPedido()
    }
}
