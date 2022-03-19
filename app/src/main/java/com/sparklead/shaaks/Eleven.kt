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
import kotlinx.android.synthetic.main.activity_eleven.*
import kotlinx.android.synthetic.main.activity_selection.*

class Eleven : AppCompatActivity(), View.OnClickListener {

    private var kSelectedoptionposition :Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleven)



        tv_option2_1.setOnClickListener(this)
        tv_option2_2.setOnClickListener(this)
        tv_option2_3.setOnClickListener(this)



    }

    override fun onClick(k: View?) {

        when(k?.id) {
            R.id.tv_option2_1 -> {
                selectedoption(tv_option2_1, 1)
            }
            R.id.tv_option2_2 -> {
                selectedoption(tv_option2_2, 2)
            }
            R.id.tv_option2_3 -> {
                selectedoption(tv_option2_3, 3)
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

        btn_next2_1.setOnClickListener{
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
                    val intent = Intent(this, arts_after_12::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
            }

        }
    }

    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option2_1)
        options.add(1,tv_option2_2)
        options.add(2,tv_option2_3)


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