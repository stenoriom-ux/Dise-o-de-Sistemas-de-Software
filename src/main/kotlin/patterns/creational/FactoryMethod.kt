package patterns.creational

// Product
interface Producto {
    fun descripcion(): String
}

// Concrete Products
class ProductoFisico : Producto {
    override fun descripcion(): String = "producto físico enviado por mensajería"
}

class ProductoDigital : Producto {
    override fun descripcion(): String = "producto digital disponible para descarga"
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

// Concrete Creators
class TallerFisico : TallerPendiente() {
    override fun crearProducto(): Producto = ProductoFisico()
}

class TallerDigital : TallerPendiente() {
    override fun crearProducto(): Producto = ProductoDigital()
}

class FactoryMethodDemo {
    fun ejecutar(): String {

        // El cliente trabaja con la abstracción
        val taller: TallerPendiente = TallerDigital()

        return taller.prepararPedido()
    }
}
"paso-1: implemento metodo fabrica"
