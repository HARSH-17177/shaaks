package com.sparklead.shaaks

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.sparklead.shaaks.ui.chatbot
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_selection.*

class Selection : AppCompatActivity() , View.OnClickListener{

    private var mSelectedoptionposition :Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        val username =intent.getStringExtra(Constants.User_name)

        tv_username.text = "Hey $username \n\nSelect your current class."


        tv_option1.setOnClickListener(this)
        tv_option2.setOnClickListener(this)
        tv_option3.setOnClickListener(this)
        tv_option4.setOnClickListener(this)
        tv_option5.setOnClickListener(this)
        tv_option6.setOnClickListener(this)

        btn_bot.setOnClickListener {

            val intent = Intent(this, chatbot::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

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

        btn_next1.setOnClickListener{
            if(selectedoptionnum==1 || selectedoptionnum ==2  )
            {
                val intent = Intent(this, Eight::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
            else if(selectedoptionnum==5 || selectedoptionnum==6)
            {
                val intent = Intent(this, Eleven::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
            else if(selectedoptionnum == 3)
            {
                val intent = Intent(this, exams_in_9th_10th::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
            else if(selectedoptionnum == 4)
            {
                val intent = Intent(this, exams_after_10th::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            }
        }
    }

    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.tv_option1->{
                selectedoption(tv_option1,1)
            }
            R.id.tv_option2->{
                selectedoption(tv_option2,2)
            }
            R.id.tv_option3->{
                selectedoption(tv_option3,3)
            }
            R.id.tv_option4->{
                selectedoption(tv_option4,4)
            }
            R.id.tv_option5->{
                selectedoption(tv_option5,5)
            }
            R.id.tv_option6->{
                selectedoption(tv_option6,6)
            }


        }

    }
    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option1)
        options.add(1,tv_option2)
        options.add(2,tv_option3)
        options.add(3,tv_option4)
        options.add(4,tv_option5)
        options.add(5,tv_option6)



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