class Person(firstNameParam: String,
            middleNameParam:String?,
            lastNameParam:String){
            
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName:String = lastNameParam
    // Baris kode yang akan dieksekusi saat constructor dipanggil.
    init{
        println("Initializer Block")
    }}