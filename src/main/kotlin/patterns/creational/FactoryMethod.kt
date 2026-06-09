package patterns.creational

// Product
interface Producto {
    fun descripcion(): String
}

// Concrete Product
class Bicicleta : Producto {
    override fun descripcion(): String = "bicicleta de montaña"
}

// Creator
abstract class TallerPendiente {

    fun prepararPedido(): String {
        val producto = crearProducto()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    // Factory Method
    protected abstract fun crearProducto(): Producto
}

// Concrete Creator
class TallerBicicletas : TallerPendiente() {
    override fun crearProducto(): Producto {
        return Bicicleta()
    }
}

class FactoryMethodDemo {
    fun ejecutar(): String {
        val taller: TallerPendiente = TallerBicicletas()
        return taller.prepararPedido()
    }
}
