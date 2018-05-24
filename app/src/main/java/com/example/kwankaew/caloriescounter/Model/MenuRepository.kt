package com.example.kwankaew.caloriescounter.Model

abstract class MenuRepository {
    abstract fun loadAllMenu()
    abstract fun getMenus(): ArrayList<Menu>
}