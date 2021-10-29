package com.gfdellatin.whitelabelconceptapp.domain.usecase

import com.gfdellatin.whitelabelconceptapp.data.ProductRepository
import com.gfdellatin.whitelabelconceptapp.domain.model.Product

class GetProductUseCaseImpl(
    private val productRepository: ProductRepository
) : GetProductUseCase {

    override suspend fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}