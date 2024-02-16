package com.example.myapplication55

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
   private lateinit var txtv:TextView
   private lateinit var btn1:Button
   private lateinit var edtxt:EditText

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      txtv=findViewById(R.id.text_View)
      btn1=findViewById(R.id.btn_show)
      edtxt=findViewById(R.id.editTextDate)

        btn1.setOnClickListener{
        // make function outside and call it here
            ChangeStr()
        }

    }
    fun ChangeStr(){
        val currentYear =Calendar.getInstance().get(Calendar.YEAR)
        txtv.text=(currentYear - Integer.parseInt(edtxt.text.toString())).toString()


    }

}