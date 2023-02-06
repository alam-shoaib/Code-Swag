package com.example.codeswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.codeswag.Adapets.CategoryAdaptar
import com.example.codeswag.Model.Category
import com.example.codeswag.R
import com.example.codeswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categorie :CategoryAdaptar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categorie = CategoryAdaptar(this,
        DataServices.category)
        listView.adapter=categorie
    }


}