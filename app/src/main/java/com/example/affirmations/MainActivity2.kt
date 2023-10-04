package com.example.affirmations

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
var activity2:ImageView=findViewById<ImageView>(R.id.activity2)
        var textV:TextView=findViewById<TextView>(R.id.activity2data)
        val intent=intent
        val img=intent.getIntExtra("selected_image" , -1)
        val text=intent.getIntExtra("selected_data"  , -1)

       activity2.setImageResource(img)
        textV.text = getString(text)




    }

}