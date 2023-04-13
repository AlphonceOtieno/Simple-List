package com.example.mysimplelistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Contacts:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Contacts = findViewById(R.id.TopListView)

        Contacts.setOnItemClickListener { adapterView, view, i, l ->

            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        }

    }
}