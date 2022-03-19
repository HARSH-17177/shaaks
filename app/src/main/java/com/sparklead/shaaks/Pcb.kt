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
import kotlinx.android.synthetic.main.activity_pcb.*
import kotlinx.android.synthetic.main.activity_science.*

class Pcb : AppCompatActivity() , View.OnClickListener{

    private var kSelectedoptionposition : Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pcb)

        tv_option4_1.setOnClickListener(this)
        tv_option4_2.setOnClickListener(this)
        tv_option4_3.setOnClickListener(this)
        tv_option4_4.setOnClickListener(this)
        tv_option4_5.setOnClickListener(this)
        tv_option4_6.setOnClickListener(this)
        tv_option4_7.setOnClickListener(this)
        tv_option4_8.setOnClickListener(this)
        tv_option4_9.setOnClickListener(this)
        tv_option4_10.setOnClickListener(this)
        tv_option4_11.setOnClickListener(this)
        tv_option4_12.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.tv_option4_1->{
                selectedoption(tv_option4_1,1)
            }
            R.id.tv_option4_2->{
                selectedoption(tv_option4_2,2)
            }
            R.id.tv_option4_3->{
                selectedoption(tv_option4_3,3)
            }
            R.id.tv_option4_4->{
                selectedoption(tv_option4_4,4)
            }
            R.id.tv_option4_5->{
                selectedoption(tv_option4_5,5)
            }
            R.id.tv_option4_6->{
                selectedoption(tv_option4_6,6)
            }
            R.id.tv_option4_7->{
                selectedoption(tv_option4_7,7)
            }
            R.id.tv_option4_8->{
                selectedoption(tv_option4_8,8)
            }
            R.id.tv_option4_9->{
                selectedoption(tv_option4_9,9)
            }
            R.id.tv_option4_10->{
                selectedoption(tv_option4_10,10)
            }
            R.id.tv_option4_11->{
                selectedoption(tv_option4_11,11)
            }
            R.id.tv_option4_12->{
                selectedoption(tv_option4_12,12)
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

        btn_next4_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {
                    val intent = Intent(this, mbbs::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                2 -> {
                    val intent = Intent(this, bds::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                3 -> {
                    val intent = Intent(this, bhms::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                4 -> {
                    val intent = Intent(this, Eleven::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                5 -> {
                val intent = Intent(this, Eleven::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                6 -> {
                val intent = Intent(this, bvscandah::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                7 -> {
                val intent = Intent(this, pharmacycourseafter12::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                8 -> {
                val intent = Intent(this, bot::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                9 -> {
                val intent = Intent(this, bmlt::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                10 -> {
                val intent = Intent(this, bpth::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                11 -> {
                val intent = Intent(this, bscnursing::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                12 -> {
                    val intent = Intent(this, bnys::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }

            }

        }


    }

    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option4_1)
        options.add(1,tv_option4_2)
        options.add(2,tv_option4_3)
        options.add(3,tv_option4_4)
        options.add(4,tv_option4_5)
        options.add(5,tv_option4_6)
        options.add(6,tv_option4_7)
        options.add(7,tv_option4_8)
        options.add(8,tv_option4_9)
        options.add(9,tv_option4_10)
        options.add(10,tv_option4_11)
        options.add(11,tv_option4_12)




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