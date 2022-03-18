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
         message.contains("9") || message.contains("nine") || message.contains("10") || message.contains("ten") ->{
             when(random)
             {
                 0 -> "which of the mentioned is your subject\n-science\n-commerce"

                 else ->"error"

             }
         }

            message.contains("science") ->{
             when(random)
             {
                 0 -> "Want to know more about Science subject\n-i want to know\n-i dont want to know"

                 else->"error"
             }
         }
            message.contains("want")&& message.contains("know") ->{
             when(random)
             {
                 0 -> "Science is the pursuit and application of knowledge and understanding of the natural and social world following a systematic methodology based on evidence. Science is further divided into three broad categories:\n- Physics\n- Chemistry\n- Biology\n(in class 11 you have option  between subject cominations like physics+chemistry+math and physics+chemistry+bio if you want to continue further studies by opting science )\nfor more information enter\n- pcm\n- pcb"

                 else->"error"
             }
         }   message.contains("dont")&& message.contains("want") ->{
             when(random)
             {
                 0 -> "for more query enter your class again"

                 else->"error"
             }
         }   message.contains("pcm") ->{
             when(random)
             {
                 0 -> "Want know about pcm?\n-tell me more\n-not require"

                 else->"error"
             }
         }message.contains("tell") && message.contains("more") ->{
             when(random)
             {
                 0 -> "PCM stands for Physics, Chemistry and Mathematics. This course stream is related to the advance study and their applications in the above mentioned subjects. The practical explanation and uses is taught in this stream and the students opting for this stream have a really good interest in mathematics and physics"

                 else->"error"
             }
         }
            message.contains("not") ->{
             when(random)
             {
                 0 -> "for more query enter your class again "

                 else->"error"
             }
         }  message.contains("11")|| message.contains("12") || message.contains("eleven")|| message.contains("twelve")  ->{
             when(random)
             {
                 0 -> "please enter your subject combination or branch\n-pcm\n-pcb\n-commerce\n-arts"

                 else->"error"
             }
         }

            message.contains("pcb") ->{
                when(random)
                {
                    0 -> "want to know more about pcb\n-yeah\n-not require"

                    else->"error"
                }
            }   message.contains("yeah") ->{
                when(random)
                {
                    0 -> "PCB stands for Physics, Chemistry and Biology. This course stream is related to the advance study and their applications in the above mentioned subjects. The practical explanation and uses is taught in this stream and the students opting for this stream have a really good interest in biology and aspires to advance into biological study of the living organisms."

                    else->"error"
                }
            } message.contains("commerce") ->{
                when(random)
                {
                    0 -> "want to know more about commerce\n-yup\n-not require"

                    else->"error"
                }
            } message.contains("yup") ->{
                when(random)
                {
                    0 -> "Commerce is the conduct of trade among economic agents. Generally, commerce refers to the exchange of goods, services, or something of value, between businesses or entities. The commerce in a business can be divided into four categories: B2B, B2C, and  D2C"

                    else->"error"
                }
            }message.contains("arts") ->{
                when(random)
                {
                    0 -> "want to know more about arts \n-yes\n-not require"

                    else->"error"
                }
            }message.contains("yes") ->{
                when(random)
                {
                    0 -> "Arts is the study of the various forms of the cultural and social activities in more detailed and organised way. The study is related to understanding the behaviour and different aspects of a culture and providing best suited solution for the continuation and growth of the culture. The study of arts aslo relates to the preservation of the culture of the society and taking necessary actions accordingly."

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