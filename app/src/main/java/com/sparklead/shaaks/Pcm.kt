package com.sparklead.shaaks

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_commerce.*
import kotlinx.android.synthetic.main.activity_pcb.*
import kotlinx.android.synthetic.main.activity_pcm.*

class Pcm : AppCompatActivity(),View.OnClickListener{

    private var kSelectedoptionposition :Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pcm)



        tv_option3_1.setOnClickListener(this)
        tv_option3_2.setOnClickListener(this)
        tv_option3_3.setOnClickListener(this)
        tv_option3_4.setOnClickListener(this)

    }
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.tv_option3_1 -> {
                selectedoption(tv_option3_1, 1)
            }
            R.id.tv_option3_2 -> {
                selectedoption(tv_option3_2, 2)
            }
            R.id.tv_option3_3 -> {
                selectedoption(tv_option3_3, 3)
            }
            R.id.tv_option3_4 -> {
                selectedoption(tv_option3_4, 4)
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

        btn_next3_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {
                    val intent = Intent(this, Engineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

                }
                2 -> {

                    val intent = Intent(this, barchetecture::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                3 -> {

                    val intent = Intent(this, sciencecourseafter12::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

                }
                4 -> {

                    val intent = Intent(this, pharmacycourseafter12::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)

                }
            }

        }

    }



    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option3_1)
        options.add(1,tv_option3_2)
        options.add(2,tv_option3_3)
        options.add(3,tv_option3_4)




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