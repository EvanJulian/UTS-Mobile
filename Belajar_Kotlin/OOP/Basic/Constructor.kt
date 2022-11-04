class Person(firstNameParam: String,
            middleNameParam:String?,
            lastNameParam:String){
            
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName:String = lastNameParam}

fun main(args: Array<String>) {
    val eko = Person("Eko","Kurniawan","Khannedy")    
}