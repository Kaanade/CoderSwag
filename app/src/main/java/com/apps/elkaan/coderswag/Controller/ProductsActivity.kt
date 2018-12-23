package com.apps.elkaan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.apps.elkaan.coderswag.R
import com.apps.elkaan.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }


}
