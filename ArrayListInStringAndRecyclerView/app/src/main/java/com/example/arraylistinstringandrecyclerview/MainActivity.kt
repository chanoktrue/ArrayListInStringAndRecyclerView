package com.example.arraylistinstringandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var movies = arrayOf(
        "Banshee Season 1",
        "Banshee Season 2",
        "Banshee Season 3",
        "Banshee Season 4",
        "House of Card Season 1",
        "House of Card Season 2",
        "F.B.I. Season 1",
        "F.B.I. Season 2",
        "F.B.I. Most Wanted Season 1",
        "F.B.I. Most Wanted Season 2",
        "Magnum P.I. Season 1",
        "Magnum P.I. Season 2",
        "Magnum P.I. Season 3",
    )

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        val itemAdapter = MyAdapter(movies, this)
        recyclerView!!.setAdapter(itemAdapter)
    }
}