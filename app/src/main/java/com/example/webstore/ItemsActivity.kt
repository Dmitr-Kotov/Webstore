package com.example.webstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()
        items.add(Item(1, "sofa", "Диван", "удобный диван", "очень очень очень удобный диван", 1000))
        items.add(Item(2, "light", "Свет", "яркий свет", "очень очень очень яркий свет", 2000))
        items.add(Item(3, "kitchen", "Кухня", "просторная кухня", "очень очень очень просторная кухня", 3000))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)

    }
}