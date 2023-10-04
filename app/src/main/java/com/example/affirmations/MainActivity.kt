package com.example.affirmations

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset){
            data ->
            onItemClick(data)
        }

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }

    private fun onItemClick(data : Affirmation){

    intent =Intent(this, MainActivity2::class.java)
    intent.putExtra("selected_image", data.imageResourceId)
        intent.putExtra("selected_data", data.stringResourceId)
    startActivity(intent)

    // Toast.makeText(this , getString(data.stringResourceId) , Toast.LENGTH_SHORT).show()
    }

}