final class Manager(): Employee(name){
    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName:String = lastNameParam
    constructor(firstName:String, lastName:String, name:String){
        this.firstName = firstName;
        this.lastName = lastName;
        super(name);
    }
}
final class VicePresident(name:String): Employee(name)