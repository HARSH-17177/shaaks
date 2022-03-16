package com.sparklead.shaaks

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_commerce_without_maths.*
import kotlinx.android.synthetic.main.activity_selection.*

class CommerceWithoutMaths : AppCompatActivity() , View.OnClickListener{

    private var mSelectedoptionposition:Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commerce_without_maths)

        tv_option11_1.setOnClickListener(this)
        tv_option11_2.setOnClickListener(this)
        tv_option11_3.setOnClickListener(this)
        tv_option11_4.setOnClickListener(this)
        tv_option11_5.setOnClickListener(this)



    }

    private fun selectedoption(tv: TextView, selectedoptionnum:Int){

        defaultOptionsView()
        mSelectedoptionposition = selectedoptionnum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)

        tv.elevation = 50f

        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_background

        )

        btn_next11_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {
                    val intent = Intent(this, managementcoursecommerce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                2 -> {
                    val intent = Intent(this, proffesionalcoursecomerrce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                3 -> {
                    val intent = Intent(this, creativecoursecommerce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                4 -> {
                    val intent = Intent(this, diplomacoursecommerce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                5 -> {
                    val intent = Intent(this, bestcoursecommerce::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
            }
        }
    }

    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.tv_option11_1->{
                selectedoption(tv_option11_1,1)
            }
            R.id.tv_option11_2->{
                selectedoption(tv_option11_2,2)
            }
            R.id.tv_option11_3->{
                selectedoption(tv_option11_3,3)
            }
            R.id.tv_option11_4->{
                selectedoption(tv_option11_4,4)
            }
            R.id.tv_option11_5->{
                selectedoption(tv_option11_5,5)
            }


        }

    }
    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option11_1)
        options.add(1,tv_option11_2)
        options.add(2,tv_option11_3)
        options.add(3,tv_option11_4)
        options.add(3,tv_option11_5)



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