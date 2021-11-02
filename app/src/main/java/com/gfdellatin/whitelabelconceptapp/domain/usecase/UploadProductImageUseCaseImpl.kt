package com.gfdellatin.whitelabelconceptapp.domain.usecase

import android.net.Uri
import com.gfdellatin.whitelabelconceptapp.data.ProductRepository
import javax.inject.Inject

class UploadProductImageUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
) : UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
        return productRepository.uploadProductImage(imageUri)
    }
}