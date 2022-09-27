package com.example.shoppinglist20.Domain

class SumShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun sumShopList(): Int {
       return shopListRepository.sumShopList()
    }
}