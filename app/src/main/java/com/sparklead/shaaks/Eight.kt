package com.sparklead.shaaks

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_eight.*
import kotlinx.android.synthetic.main.activity_selection.*
import kotlinx.android.synthetic.main.activity_selection.tv_username

class Eight : AppCompatActivity(), View.OnClickListener {

    private var kSelectedoptionposition :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)


        tv_username.text = "Courses After 10th Class"

        tv_option1_1.setOnClickListener(this)
        tv_option1_2.setOnClickListener(this)
        tv_option1_3.setOnClickListener(this)
        tv_option1_4.setOnClickListener(this)
        tv_option1_5.setOnClickListener(this)
        tv_option1_6.setOnClickListener(this)
        tv_option1_7.setOnClickListener(this)
        tv_option1_8.setOnClickListener(this)


    }

    override fun onClick(k: View?) {


        when(k?.id) {
            R.id.tv_option1_1 -> {
                selectedoption(tv_option1_1, 1)
            }
            R.id.tv_option1_2 -> {
                selectedoption(tv_option1_2, 2)
            }
            R.id.tv_option1_3 -> {
                selectedoption(tv_option1_3, 3)
            }
            R.id.tv_option1_4 -> {
                selectedoption(tv_option1_4, 4)
            }
            R.id.tv_option1_5 -> {
                selectedoption(tv_option1_5, 5)
            }
            R.id.tv_option1_6 -> {
                selectedoption(tv_option1_6, 6)
            }
            R.id.tv_option1_7 -> {
                selectedoption(tv_option1_7, 7)
            }
            R.id.tv_option1_8 -> {
                selectedoption(tv_option1_8, 8)
            }


        }

    }

    private fun selectedoption(tv: TextView, selectedoptionnum:Int){

        defaultOptionsView()
        kSelectedoptionposition = selectedoptionnum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)

        tv.elevation = 50f

        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_background

        )

        btn_next1_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {
                    val intent = Intent(this, Science::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                2 -> {
                    val intent = Intent(this, Commerce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                3 -> {
                    val intent = Intent(this, Arts::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                4->{
                    val intent = Intent(this, Iti::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                5->{
                    val intent = Intent(this, Shorttermcourse::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                6->{
                    val intent = Intent(this, Vocational::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                7->{
                    val intent = Intent(this, Diploma::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                8->{
                    val intent = Intent(this, Diploma::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }

            }
        }
    }

    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option1_1)
        options.add(1,tv_option1_2)
        options.add(2,tv_option1_3)
        options.add(3,tv_option1_4)
        options.add(4,tv_option1_5)
        options.add(5,tv_option1_6)
        options.add(6,tv_option1_7)
        options.add(7,tv_option1_8)



        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT

            option.elevation = 10f

            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_background_for_text
            )

        }

    }

}