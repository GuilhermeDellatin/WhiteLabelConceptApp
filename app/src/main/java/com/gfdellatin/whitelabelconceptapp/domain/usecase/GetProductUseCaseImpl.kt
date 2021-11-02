package com.gfdellatin.whitelabelconceptapp.domain.usecase

import com.gfdellatin.whitelabelconceptapp.data.ProductRepository
import com.gfdellatin.whitelabelconceptapp.domain.model.Product
import javax.inject.Inject

class GetProductUseCaseImpl @Inject constructor(
    private val productRepository: ProductRepository
) : GetProductUseCase {

    override suspend fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}