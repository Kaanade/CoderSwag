package com.apps.elkaan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.apps.elkaan.coderswag.Model.Product
import com.apps.elkaan.coderswag.R
import com.apps.elkaan.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productDetailImage.setImageResource(resourceId)
        productDetailName.text = product.title
        productDetailPrice.text = product.price
    }
}
