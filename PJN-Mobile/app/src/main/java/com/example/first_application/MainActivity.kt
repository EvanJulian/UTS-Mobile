package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import org.w3c.dom.Text
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    // Function onCreate adalah function secara otomatis menjalankan activity ketika activity dibuat.
    private lateinit var nameEditText : EditText
    private lateinit var sayHelloButton : Button
    private lateinit var sayHelloTextView : TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.inputName)
        sayHelloButton = findViewById(R.id.showNameButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    private fun initViews(){
        setContentView(R.layout.new_linear_layout)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView digunakan untuk menampilkan layout.
        // Untuk menghubungkan layout dengan main class, kita dapat menggunakan R class.
        // R class digunakan untuk mengidentifikasi layout yang ingin dihubungkan dengan main class.
        // Selain digunakan untuk mengidentifikasi layout, R.class juga digunakan untuk mengidentifikasi komponen melalui ID.
        initViews()
        // Untuk menambahkan seluruh komponen kedalam activity main, kita dapat membuat variabel yang merepresentasi komponen tersebut.
        // val nameEditText: EditText = findViewById(R.id.inputName)
        //val sayHelloButton: Button = findViewById(R.id.showNameButton)
        // val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)
        initComponents()
        // Untuk memberikan listener, kita mencari listener yang dimiliki oleh masing-masing component class dari variabel yang kita buat.
        sayHelloButton.setOnClickListener{
            // Untuk menampilkan keterangan pada terminal ketika kita sedang menjalankan aplikasi, kita dapat menggunakan log.
            // Log sendiri memiliki 5 tingkatan yaitu:
            /// V: Verbose, tingkatan paling tinggi.
            /// D: Debug
            /// I: Information
            /// W: Warning
            /// E: Error

            Log.v("EJS", "Ini log v")
            Log.d("EJS","Ini Log d")
            Log.i("EJS","Ini Log i")
            Log.w("EJS","Ini Log w")
            Log.e("EJS", "Ini Log e")

            // Toast adalah pesan singkat yang akan dimunculkan sementara dan menghilang
            Toast.makeText(this,resources.getString(R.string.toast_1), Toast.LENGTH_SHORT).show()

            // .text mirip seperti setter method pada java
            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi $name"
        }
        sayHelloTextView.text = resources.getString(R.string.app_name)
    }
}