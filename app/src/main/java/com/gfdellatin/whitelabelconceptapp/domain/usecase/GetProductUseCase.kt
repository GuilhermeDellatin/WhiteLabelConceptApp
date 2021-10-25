package com.gfdellatin.whitelabelconceptapp.domain.usecase

import com.gfdellatin.whitelabelconceptapp.domain.model.Product

interface GetProductUseCase {

    suspend operator fun invoke(): List<Product>

}