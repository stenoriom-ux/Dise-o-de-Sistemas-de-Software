package patterns.creational

interface Producto {
    fun descripcion(): String
}

class ConcreteProduct : Producto {
    override fun descripcion(): String {
        return "producto concreto"
    }
}

abstract class Creator {

    fun prepararPedido(): String {
        val producto = create()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    abstract fun create(): Producto
}

class ConcreteCreator : Creator() {

    override fun create(): Producto {
        return ConcreteProduct()
    }
}

class FactoryMethodDemo {

    fun ejecutar(): String {
        val creator: Creator = ConcreteCreator()
        return creator.prepararPedido()
    }
}
