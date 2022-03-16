package com.sparklead.shaaks

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_arts.*
import kotlinx.android.synthetic.main.activity_commerce.*

class Arts : AppCompatActivity(), View.OnClickListener {

    private var kSelectedoptionposition:Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arts)


        tv_option9_1.setOnClickListener(this)
        tv_option9_2.setOnClickListener(this)
        tv_option9_3.setOnClickListener(this)
        tv_option9_4.setOnClickListener(this)
        tv_option9_5.setOnClickListener(this)
        tv_option9_6.setOnClickListener(this)
        tv_option9_7.setOnClickListener(this)
        tv_option9_8.setOnClickListener(this)




    }

    override fun onClick(v: View?) {


        when (v?.id) {
            R.id.tv_option9_1 -> {
                selectedoption(tv_option9_1, 1)
            }
            R.id.tv_option9_2 -> {
                selectedoption(tv_option9_2, 2)
            }
            R.id.tv_option9_3 -> {
                selectedoption(tv_option9_3, 3)
            }
            R.id.tv_option9_4 -> {
                selectedoption(tv_option9_4, 4)
            }
            R.id.tv_option9_5 -> {
                selectedoption(tv_option9_5, 5)
            }
            R.id.tv_option9_6 -> {
                selectedoption(tv_option9_6, 6)
            }
            R.id.tv_option9_7 -> {
                selectedoption(tv_option9_7, 7)
            }
            R.id.tv_option9_8 -> {
                selectedoption(tv_option9_8, 8)
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

        btn_next9_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {

                }
                2 -> {

                }
                3 -> {

                }
                4 -> {

                }
                5 -> {

                }
                6 -> {

                }
                7 -> {

                }
                8->{

                }

            }

        }

    }


    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option9_1)
        options.add(1,tv_option9_2)
        options.add(2,tv_option9_3)
        options.add(3,tv_option9_4)
        options.add(4,tv_option9_5)
        options.add(5,tv_option9_6)
        options.add(6,tv_option9_7)
        options.add(7,tv_option9_8)



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