package com.example.sssrankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.sssrankapp.adapters.SingleCustomAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.someListView)
        val adapter = SingleCustomAdapter(this, getData())
        listView.adapter = adapter
    }

    private fun getData(): ArrayList<String> {
        var result = ArrayList<String>()

        for (i in 1..16) {
            result.add(i.toString())
        }

        return result
    }
}