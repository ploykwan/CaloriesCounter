package com.example.kwankaew.caloriescounter.Model

import ir.mirrajabi.searchdialog.core.Searchable

class Menu(private var dish:String?,val calories: Int,val unit: String):Searchable {

    override fun getTitle(): String {
        return dish!!
    }
    override fun toString(): String{
        return " ${dish} 1 ${unit} ${calories} calories"
    }
}