// How To Create a Function in Kotlin Language
fun main(){
    // How To Print in Kotlin Language
    print("Hello World"); // Tanpa Spasi
    println("Hello World"); // Dengan Spasi

    // Data Types in Kotlin Language
    /// Integer Number
    var age: Byte = 30;
    var height: Int = 170;
    var distance: Short = 2000
    var balance: Long = 100000000L
    /// Floating Number
    var value: Float = 98.98f
    var radius: Double = 2342342343.54535
    /// Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF // If we want to create a variable of hexadecimal number, we should give 0x in front the number we want.
    var binaryLiteral: Int = 0b0001 // If we want to create a variable of binary number, we should give 0b in front the number we want.
    /// Underscore
    //// Underscore tidak memiliki kegunaan khusus dalam pemrograman kotlin, kita menggunakan underscore hanya untuk mempermudah coder dalam membaca.
    var age: Byte = 3_0;
    var height: Int = 1_7_0;
    var distance: Short = 2_000
    var balance: Long = 1_000_000_00L
    /// Conversion
    var number: Int = 100
    //// Conversion Example
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
    /// Character
    var char1: Char = 'E'
    var char2: Char = 'V'
    var char3: Char = 'A'
    var char4: Char = 'N'
    /// Boolean
    var benar: Boolean = true;
    var salah: Boolean = false;
    /// String
    var name: String = "Evan Julian Sudarman"
    var deskripsi: String = """
        Evan Julian Sudarman merupakan
        seorang remaja berusia 20 Tahun.
        Saat ini Evan Julian Sudarman sedang
        berkulah di Maranatha dan mengambil jurusan IT.
    """
    //// Trim Margin Method
    ///// Method ini digunakan untuk memangkas margin yang ada.
    var deskripsiTrim: String = """
        Evan Julian Sudarman merupakan
        seorang remaja berusia 20 Tahun.
        Saat ini Evan Julian Sudarman sedang
        berkulah di Maranatha dan mengambil jurusan IT.
    """.trimMargin()
    var deskripsiTrimChar: String = """
    >Evan Julian Sudarman merupakan
    >seorang remaja berusia 20 Tahun.
    >Saat ini Evan Julian Sudarman sedang
    >berkulah di Maranatha dan mengambil jurusan IT.
    """.trimMargin(">")
    //// String Concat
    var stringConcat: String = name + " " + deskripsiTrim
    //// String Template
    var firstName: String = "Yohanes Paulus"
    var middleName: String = "Samuel Evan"
    var lastName: String = "Julian Sudarman"
    var fullName: String = "$fullName $middleName $lastName"
    var fullNameLength: String = "$fullName length = ${fullName.length}"
    /// Range Data Types
    var range: Integer = 0..100
    //// Counting how many data in the range
    println(range.count())
    //// Checking
    println(range.count()) // True/False
    //// Get the first number
    println(range.first)
    //// Get the last number
    println(range.last)
    //// Get the step between the number
    println(range.step)
    //// Reverse Range (Range terbalik)
    var reverseRange: Int = 100 downTo 1
    //// Stepping range
    var steppingRange1: Integer = 0..100 step 5
    var steppingRange1: Integer = 100 downTo 1 step 5

    //Variable Types
    /// Mutable Variable (var)
    //// Coder can initialize this variable whenever they need.
    var txt: String = "Hello I'm your varsy"
    /// Immutable Variable (var)
    //// Coder cannot change the value of this varible.
    val code: Integer = 7890
    /// Nullable Variabel
    //// This variable can have null value.
    var firstName: String? = "Evan"
    /// Constant Variable
    //// You can access this immutable variable from anywhere.
    //// You should give this variable name using uppercase.
    const val APP = "Belajar Kotlin"
    const val Version = "0.0.1"

    // Array
    /// Standard Array
    var myArray: Array<String> = arrayOf("Evan", "Julian", "Sudarman")
    /// Accessing Standard Array
    println(myArray.get(0))
    println(myArray[0])
    /// Add another item to array
    val newArray = myArray.toMutableList()
    newArray.add("Bambang")
    println(newArray.get(3))
    /// Detect array size
    newArray.size()
    /// Change data in specific Position
    newArray.set(0,"Evans")
    newArray[0,"Evano"]
    /// Nullable Array (Tidak Lazim)
    val otherArray: Array<String?> = arrayof("Apa", "Iya", "Deck")

    // If Statement (Sama Seperti Java)
    
    // When Statement (Serupa dengan switch di java), Namun berbeda dengan java pada when statement kita bisa menambahkan sebuah statement menggunakan variable, tidak hanya sebuah karakter.
    val finalExam: String = 'A'
    when(finalExam){
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Nothing")
    }
    val examValue: Int = 90
    when(examValue){
        examValue < 55 -> println("Stupid")
        examValue > 66 -> println("Smart")
        else -> println("Nothing")
    }
    /// When Statement Multiple Option
    when(finalExam){
        'A', 'B', 'C' -> println("Pass")
        else -> println("Nothing")
    }

    // For Loop
    /// For each array
    for(x in newArray){
        println(x)
    }
    /// For each range
    for(value in 0..100){
        println(value)
    } 

    // While Loop (sama seperti java)

    // Do While Loop (sama seperti java)

    // Break and Continue (sama seperti java) 
}
// Function Default Parameter
fun newFunction(parameter1:String, parameter2:String){
    println("Nama Lengkap: $parameter1 $parameter2")
}

// Unit Function, Unit Function merupakan salah satu jenis return function yang ditentukan oleh statement if.
fun unitFunction(name:String?): Unit{
    if(name == null){
        println("null")
    }else{
        println("Nama Anda $name")
    }
}

// Function return type.
fun sum(a: Int, b:Int):Int{
    val total = a+b;
    return total;
}

// Single Expression Function.
fun double(a:Int): Int = a*2

fun hi(name:String):Unit = println("Hi $name")

// Function Return If
fun sayHello(name: String=""):String{
    return if(name  = ""){
        "Hello Bro"
    }else{
        "Hello $name"
    }
}