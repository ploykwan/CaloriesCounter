package com.example.kwankaew.caloriescounter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_searching_menu.*
import kotlinx.android.synthetic.main.activity_user_info.*
import javax.sql.StatementEvent
import kotlin.math.pow

class UserInfo : AppCompatActivity() {

    internal lateinit var sp: Spinner
    var bmi = 0.0
    var cal = 0.0
    var vari = 1.2
    var move = arrayOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        sp = findViewById(R.id.spinner) as Spinner
        move = arrayOf("นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย", "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน",
                "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 3-5 วัน", "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน",
                "ออกกำลังกายหรือเล่นกีฬาอย่างหนักทุกวันเช้าเย็น");

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, move)
        sp.adapter = adapter

        sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var chosen = move.get(position)
                if (chosen.equals("นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย")) {
                    vari = 1.2
                } else if (chosen.equals("ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน")) {
                    vari = 1.375
                } else if (chosen.equals("ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 3-5 วัน")) {
                    vari = 1.55
                } else if (chosen.equals("ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน")) {
                    vari = 1.725
                } else if (chosen.equals("ออกกำลังกายหรือเล่นกีฬาอย่างหนักทุกวันเช้าเย็น")) {
                    vari = 1.9
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }


    }

    fun enterButton(view: View){
        val heigth = inputHeight.text.toString()
        val weight = inputWeight.text.toString()
        val gender = genderSwitch.isChecked.toString()
        val age = inputAge.text.toString()

        calculate(heigth, weight, gender, age, vari)
    }

    fun backButton(view: View){
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
    }

    fun calculate(h: String, w: String, g: String, a: String, v: Double) {

        var bmr = 1.0
        var height = h.toDouble()
        var weight = w.toDouble()
        var gender: String
        var age = a.toDouble()

        this.bmi = weight / ((height / 100).pow(2))
        if (g.equals("false")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 - age) //66 + (13.7 x น้ำหนักตัวเป็น กก.) + (5 x ส่วนสูงเป็น ซม.) – (6.8 x อายุ)
        } else if (g.equals("true")) {
            bmr = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age) //665 + (9.6 x น้ำหนักตัวเป็น กก.) + (1.8 x ส่วนสูงเป็น ซม.) – (4.7 x อายุ)
        }
        this.cal = bmr * v

        caloriesLabel.setText(java.lang.String.format("%.0f", cal))
        BMILabel.setText(java.lang.String.format("%.2f", bmi))

    }

    fun getBMI(): String {
        return java.lang.String.format("%.2f", bmi)
    }
    fun getCalories(): String {
        return java.lang.String.format("%.0f", cal)
    }

    fun setCalories(cal:Double){
        this.cal = cal
    }

}
