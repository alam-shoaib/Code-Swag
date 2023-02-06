package com.example.codeswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.codeswag.Model.Category
import com.example.codeswag.R
import com.example.codeswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categorie :ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categorie = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataServices.category
        )
        listView.adapter=categorie
    }


}