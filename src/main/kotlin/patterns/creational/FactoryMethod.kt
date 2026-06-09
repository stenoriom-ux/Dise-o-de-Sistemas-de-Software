package patterns.creational

// PRODUCT
interface Product {
    fun description(): String
}

// CONCRETE PRODUCT
class ProductoDigital : Product {
    override fun description(): String = "producto digital"
}

// CREATOR
abstract class Creator {

    fun createOrder(): String {
        val product = createProduct()
        return "Pedido preparado para ${product.description()}"
    }

    protected abstract fun createProduct(): Product
}

// CONCRETE CREATOR
class DigitalCreator : Creator() {
    override fun createProduct(): Product = ProductoDigital()
}

// CLIENT
class FactoryMethodDemo {
    fun ejecutar(): String {
        val creator: Creator = DigitalCreator()
        return creator.createOrder()
    }
}
"paso-1: implemento metodo fabrica"
