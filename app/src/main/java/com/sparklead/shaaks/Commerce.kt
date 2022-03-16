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

class Commerce : AppCompatActivity() , View.OnClickListener{

    private var kSelectedoptionposition :Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commerce)




        tv_option7_1.setOnClickListener(this)
        tv_option7_2.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.tv_option7_1 -> {
                selectedoption(tv_option7_1, 1)
            }
            R.id.tv_option7_2 -> {
                selectedoption(tv_option7_2, 2)
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

            btn_next7_1.setOnClickListener{
                when (selectedoptionnum) {
                    1 -> {
                        val intent = Intent(this, commercewithmath::class.java)
                        startActivity(intent)
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    }
                    2 -> {
                        val intent = Intent(this, CommerceWithoutMaths::class.java)
                        startActivity(intent)
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    }
                }
            }
        }


    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option7_1)
        options.add(1,tv_option7_2)




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