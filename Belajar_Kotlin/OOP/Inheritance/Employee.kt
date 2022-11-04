open class Employee(val name: String){
    fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}