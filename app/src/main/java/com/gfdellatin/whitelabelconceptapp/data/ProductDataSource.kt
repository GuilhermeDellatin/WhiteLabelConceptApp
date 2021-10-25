package com.gfdellatin.whitelabelconceptapp.data

import android.net.Uri
import com.gfdellatin.whitelabelconceptapp.domain.model.Product

interface ProductDataSource {

    suspend fun getProducts(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product

}