package patterns.creational

interface Product {
    fun descripcion(): String
}

class ConcreteProduct : Product {
    override fun descripcion(): String {
        return "producto concreto"
    }
}

abstract class Creator {

    fun prepararPedido(): String {
        val producto = create()
        return "Pedido preparado para ${producto.descripcion()}"
    }

    abstract fun create(): Product
}

class ConcreteCreator : Creator() {

    override fun create(): Product {
        return ConcreteProduct()
    }
}

class FactoryMethodDemo {

    fun ejecutar(): String {
        val creator: Creator = ConcreteCreator()
        return creator.prepararPedido()
    }
}
