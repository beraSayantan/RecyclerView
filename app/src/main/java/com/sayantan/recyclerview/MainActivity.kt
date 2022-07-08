package com.sayantan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            Todo("Todo 1",false),
            Todo("Todo 2",true),
            Todo("Todo 3", true),
            Todo("Todo 4",false)
        )

        val adapter = TodoAdapter(todoList)

        //rvTodos.adapter = adapter
        //rvTodos.layoutManager = LinearLayoutManager(this)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.rvTodos

    }
}