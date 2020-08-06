fun Fridge.take(productName:String):Product{
    val product:Product
    this.open()
    product = this.find(productName)
    this.close()
    return product
}