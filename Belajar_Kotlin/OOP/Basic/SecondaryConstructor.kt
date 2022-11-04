class Person(firstNameParam: String,
            middleNameParam:String?,
            lastNameParam:String){
            
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName:String = lastNameParam
    // Secondary Constructor harus memiliki parameter yang berbeda jumlah atau tipe data dengan primary constructor.
    constructor(firstNameParam: String, lastNameParam:String):
        this(firstNameParam, null, lastNameParam){

        }
}
// Kita juga dapat membuat class tanpa primary constructor
class PersonNonPrimary {
    constructor(firstNameParam: String,
    middleNameParam:String?,
    lastNameParam:String){
        firstName = firstNameParam;
        middleName = middleNameParam;
        lastName = lastNameParam;
    }
    
}