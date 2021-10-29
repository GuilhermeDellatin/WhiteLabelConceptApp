package com.gfdellatin.whitelabelconceptapp.domain.usecase

import android.net.Uri
import com.gfdellatin.whitelabelconceptapp.data.ProductRepository

class UploadProductImageUseCaseImpl(
    private val productRepository: ProductRepository
) : UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
        return productRepository.uploadProductImage(imageUri)
    }
}