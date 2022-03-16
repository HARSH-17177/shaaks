package com.sparklead.shaaks

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_engineering.*
import kotlinx.android.synthetic.main.activity_pcb.*

class Engineering : AppCompatActivity(), View.OnClickListener{

    private var kSelectedoptionposition : Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engineering)

        tv_option10_1.setOnClickListener(this)
        tv_option10_2.setOnClickListener(this)
        tv_option10_3.setOnClickListener(this)
        tv_option10_4.setOnClickListener(this)
        tv_option10_5.setOnClickListener(this)
        tv_option10_6.setOnClickListener(this)
        tv_option10_7.setOnClickListener(this)
        tv_option10_8.setOnClickListener(this)
        tv_option10_9.setOnClickListener(this)
        tv_option10_10.setOnClickListener(this)
        tv_option10_11.setOnClickListener(this)
        tv_option10_12.setOnClickListener(this)
        tv_option10_13.setOnClickListener(this)
        tv_option10_14.setOnClickListener(this)
        tv_option10_15.setOnClickListener(this)
        tv_option10_16.setOnClickListener(this)
        tv_option10_17.setOnClickListener(this)
        tv_option10_18.setOnClickListener(this)
        tv_option10_19.setOnClickListener(this)
        tv_option10_20.setOnClickListener(this)
        tv_option10_21.setOnClickListener(this)
        tv_option10_22.setOnClickListener(this)


    }

    override fun onClick(v: View?) {


        when (v?.id) {
            R.id.tv_option10_1 -> {
                selectedoption(tv_option10_1, 1)
            }
            R.id.tv_option10_2 -> {
                selectedoption(tv_option10_2, 2)
            }
            R.id.tv_option10_3 -> {
                selectedoption(tv_option10_3, 3)
            }
            R.id.tv_option10_4 -> {
                selectedoption(tv_option10_4, 4)
            }
            R.id.tv_option10_5 -> {
                selectedoption(tv_option10_5, 5)
            }
            R.id.tv_option10_6 -> {
                selectedoption(tv_option10_6, 6)
            }
            R.id.tv_option10_7 -> {
                selectedoption(tv_option10_7, 7)
            }
            R.id.tv_option10_8 -> {
                selectedoption(tv_option10_8, 8)
            }
            R.id.tv_option10_9 -> {
                selectedoption(tv_option10_9, 9)
            }
            R.id.tv_option10_10 -> {
                selectedoption(tv_option10_10, 10)
            }
            R.id.tv_option10_11 -> {
                selectedoption(tv_option10_11, 11)
            }
            R.id.tv_option10_12 -> {
                selectedoption(tv_option10_12, 12)
            }
            R.id.tv_option10_13 -> {
                selectedoption(tv_option10_13, 13)
            }
            R.id.tv_option10_14 -> {
                selectedoption(tv_option10_14, 14)
            }
            R.id.tv_option10_15 -> {
                selectedoption(tv_option10_15, 15)
            }
            R.id.tv_option10_16 -> {
                selectedoption(tv_option10_16, 16)
            }
            R.id.tv_option10_17 -> {
                selectedoption(tv_option10_17, 17)
            }
            R.id.tv_option10_18 -> {
                selectedoption(tv_option10_18, 18)
            }
            R.id.tv_option10_19 -> {
                selectedoption(tv_option10_19, 19)
            }
            R.id.tv_option10_20 -> {
                selectedoption(tv_option10_20, 20)
            }
            R.id.tv_option10_21 -> {
                selectedoption(tv_option10_21, 21)
            }
            R.id.tv_option10_22 -> {
                selectedoption(tv_option10_22, 22)
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

        btn_next10_1.setOnClickListener{
            when (selectedoptionnum) {
                1 -> {
                    val intent = Intent(this, engineering_as_a_carrer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                2 -> {
                    val intent = Intent(this, computerscience::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                3 -> {
                    val intent = Intent(this, Aeronautical::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                4 -> {
                    val intent = Intent(this, Civileng::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                5 -> {
                    val intent = Intent(this, AutomobileEng::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                6 -> {
                    val intent = Intent(this, Agricultureengg::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                7 -> {
                    val intent = Intent(this, biomedicaengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                8 -> {
                    val intent = Intent(this, biotechnologist::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                9 -> {
                    val intent = Intent(this, broadcastengineer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                10 -> {
                    val intent = Intent(this, communicationalengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                11 -> {
                    val intent = Intent(this, geneticengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                12 -> {
                    val intent = Intent(this, mechanicalengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                13 -> {
                    val intent = Intent(this, petroleumengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                14 -> {
                    val intent = Intent(this, spacetechnologist::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                15 -> {
                    val intent = Intent(this, textileengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                16 -> {
                    val intent = Intent(this, chemicalengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                17 -> {
                    val intent = Intent(this, electricalengineer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                18 -> {
                    val intent = Intent(this, marineengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                19 -> {
                    val intent = Intent(this, mettalurgyengineering::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                20 -> {
                    val intent = Intent(this, environmentalengineer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                21 -> {
                    val intent = Intent(this, industrialengineer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
                 22 -> {
                    val intent = Intent(this, plasticengineer::class.java)
                    startActivity(intent)
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                }
            }

        }


    }

    private fun defaultOptionsView(){

        var options = ArrayList<TextView>()

        options.add(0,tv_option10_1)
        options.add(1,tv_option10_2)
        options.add(2,tv_option10_3)
        options.add(3,tv_option10_4)
        options.add(4,tv_option10_5)
        options.add(5,tv_option10_6)
        options.add(6,tv_option10_7)
        options.add(7,tv_option10_8)
        options.add(8,tv_option10_9)
        options.add(9,tv_option10_10)
        options.add(10,tv_option10_11)
        options.add(11,tv_option10_12)
        options.add(12,tv_option10_13)
        options.add(13,tv_option10_14)
        options.add(14,tv_option10_15)
        options.add(15,tv_option10_16)
        options.add(16,tv_option10_17)
        options.add(17,tv_option10_18)
        options.add(18,tv_option10_19)
        options.add(19,tv_option10_20)
        options.add(20,tv_option10_21)
        options.add(21,tv_option10_22)



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