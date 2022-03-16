package com.sparklead.shaaks.utils

import com.sparklead.shaaks.utils.Constants.OPEN_GOOGLE
import com.sparklead.shaaks.utils.Constants.OPEN_SEARCH
import java.lang.Exception

object BotResponse {
    fun basicResponses(_message:String):String{
        val random =(0..0).random()
        val message= _message.toLowerCase()

        return when{
            //Hello
         message.contains("divided") ->{
             when(random)
             {
                 0 -> "Science / commerce/ arts"

                 else ->"error"

             }
         }
            //how are you
            message.contains("science") ->{
             when(random)
             {
                 0 -> "would you like to choose bio or math"

                 else->"error"
             }
         }
            message.contains("bio") ->{
             when(random)
             {
                 0 -> "what is your area of interest:\n-\n-MD"

                 else->"error"
             }
         }
            message.contains("flip") && message.contains("coin") ->{
                var r=(0..1).random()
                val result = if (r==0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            //solve maths
            message.contains("solve")->{
                val equation:String?= message.substringAfter("solve")
                return  try{
val answer =SolveMath.solveMath(equation?:"0")
                   answer.toString()
                }catch (e: Exception){
                    "Sorry, I can't solve that!"
                }
            }
            //gets the current time
            message.contains("time") && message.contains("?")->{
                Time.timeStamp()
            }

            message.contains("open") && message.contains("google")->
            {
                OPEN_GOOGLE
            }
            message.contains("search")->
            {
                OPEN_SEARCH
            }

            else -> {
                when(random)
                {
                    0 -> "Explain clearly"
                    1-> "Try asking me something different!"
                    2->"Pardon me"
                    else->"error"
                }
            }
        }
    }
}