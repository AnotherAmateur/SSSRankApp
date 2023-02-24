package com.example.sssrankapp.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import com.example.sssrankapp.R

class SingleCustomAdapter(private var activity: Activity, private var items: ArrayList<String>):
    BaseAdapter() {

    override fun getCount(): Int {
       return items.size
    }

    override fun getItem(i: Int): Any {
        return items[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?

        if (convertView == null) {
            val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.wthisthat1, null)
        }
        else {
            view = convertView
        }

        view?.findViewById<TextView>(R.id.singleTxt)?.text = items[position]

        return view as View
    }
}