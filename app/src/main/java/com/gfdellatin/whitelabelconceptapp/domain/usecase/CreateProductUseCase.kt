package com.gfdellatin.whitelabelconceptapp.domain.usecase

import android.net.Uri
import com.gfdellatin.whitelabelconceptapp.domain.model.Product

interface CreateProductUseCase {

    suspend operator fun invoke(description: String, price: Double, imageUri: Uri): Product

}