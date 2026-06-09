// PRODUCT
interface Product {
    fun description(): String
}

// CONCRETE PRODUCT
class ProductoDigital : Product {
    override fun description(): String = "producto digital descargable"
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
class DigitalStore : Creator() {
    override fun createProduct(): Product {
        return ProductoDigital()
    }
}

// CLIENT
class FactoryMethodDemo {
    fun ejecutar(): String {
        val creator: Creator = DigitalStore()
        return creator.createOrder()
    }
}
