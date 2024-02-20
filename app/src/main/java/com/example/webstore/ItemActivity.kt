package com.example.webstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.item_title)
        val text: TextView = findViewById(R.id.item_desc)
        val price: TextView = findViewById(R.id.item_price)
        val image: ImageView = findViewById(R.id.item_image)
        val button: Button = findViewById(R.id.button_buy)

        title.text = intent.getStringExtra("ItemTitle")
        text.text = intent.getStringExtra("ItemText")
        price.text = intent.getStringExtra("ItemPrice")
        val imageId = this.resources.getIdentifier(intent.getStringExtra("ItemImage"),"drawable", this.packageName)
        image.setImageResource(imageId)
    }
}