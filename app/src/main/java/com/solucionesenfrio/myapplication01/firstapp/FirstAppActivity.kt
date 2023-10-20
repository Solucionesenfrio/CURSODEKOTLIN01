package com.solucionesenfrio.myapplication01.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import com.solucionesenfrio.myapplication01.R

class FirstAppActivity<AppCompatButton : View?> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //arranaca la pantalla
val btnStar = findViewById<AppCompatButton>(R.id.btnStar)
        val etName = findViewById<AppCompatEditText>(R.id.etName)



        btnStar?.setOnClickListener {

            val name = etName.text.toString()

            if (name.isNotEmpty()){
                val intent = Intent(this,ResulActivity::class.java)

                intent.putExtra("EXTRA_NAME",name)





            //Log.i("Aristedevs","Button Pulsado $name")



                startActivity(intent)
            }
        }


    }
}