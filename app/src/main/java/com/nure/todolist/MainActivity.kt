package com.nure.todolist
import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    private val myName:String = "Oleksandr Dehtiar"
    private val labOpt:Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        list_view.adapter = adapter

        add_btn.setOnClickListener{
            val text = edit_text.text.toString()
            adapter.add(text)
            adapter.notifyDataSetChanged()
        }

        // Personal part
        adapter.add(myName)
        edit_text.setText(labOpt.toString())
    }
}