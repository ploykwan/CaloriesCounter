package com.example.kwankaew.caloriescounter

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.kwankaew.caloriescounter.Model.Menu
import com.example.kwankaew.caloriescounter.Model.ThaiMenuRepository
import ir.mirrajabi.searchdialog.SimpleSearchDialogCompat
import ir.mirrajabi.searchdialog.core.SearchResultListener
import kotlinx.android.synthetic.main.activity_searching_menu.*


class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching_menu)

        btnUserInfo.setOnClickListener {
            val intent = Intent(this, UserInfo::class.java)
            startActivity(intent)
        }

        btnSearch.setOnClickListener {
            SimpleSearchDialogCompat(this@Main, "Searching menu", "What are you looking for...?", null, initData(), SearchResultListener { baseSearchDialogCompat, item, position ->
//                Toast.makeText(this@Main, item.title, Toast.LENGTH_SHORT).show()
                ate.setText(item.toString());
                baseSearchDialogCompat.dismiss()
            }).show()
        }



    }

    private fun initData(): ArrayList<Menu> {
        var menu = ThaiMenuRepository()
        menu.loadAllMenu()
        return menu.getMenus()
    }


}