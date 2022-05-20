package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import android.widget.Toast
import java.util.*

class MainActivity2 : AppCompatActivity() {
    private var male: EditText? = null
    private var female: EditText? = null
    var tv: TextView? = null
    var result: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun showResult(view: View?) {
        male = findViewById(R.id.editText1ID)
        female = findViewById(R.id.editText2ID)
        tv = findViewById(R.id.calculateetextI)
        val f = female?.getText().toString()
        val m = male?.getText().toString()
        var sum = m + f
        sum = sum.lowercase(Locale.getDefault())
        val value = sum.hashCode()
        val random = Random(value.toLong())
        result = (random.nextInt(100) + 1).toString() + "%"
        if (f == "" || m == "") {
            Toast.makeText(this@MainActivity2, "Enter Names", Toast.LENGTH_SHORT).show()
        }
        tv?.setText(result)
    }
}