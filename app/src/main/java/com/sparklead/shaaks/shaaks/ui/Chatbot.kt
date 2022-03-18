package com.sparklead.shaaks.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sparklead.shaaks.R
import com.sparklead.shaaks.data.Message
import com.sparklead.shaaks.utils.BotResponse
import com.sparklead.shaaks.utils.Constants.OPEN_GOOGLE
import com.sparklead.shaaks.utils.Constants.OPEN_SEARCH
import com.sparklead.shaaks.utils.Constants.RECEIVE_ID
import com.sparklead.shaaks.utils.Constants.SEND_ID
import com.sparklead.shaaks.utils.Time
import kotlinx.android.synthetic.main.activity_chatbot.*
import kotlinx.coroutines.*

class chatbot : AppCompatActivity() {
    private  lateinit var adapter: MessagingAdapter
    private val botList= listOf("Harsh","Aditya","Kuber","Samitha","Sarthak")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatbot)
        recyclerView()
        clickEvents()
        val random = (0..4).random()
        customMessage("Hello! Today you're speaking with ${botList[random]}, Please enter your class?")
    }
   private fun clickEvents(){
      btn_send.setOnClickListener {
          sendMessage()
      }
       et_message.setOnClickListener {
           GlobalScope.launch {
               delay(100)
               withContext(Dispatchers.Main){
                   rv_messages.scrollToPosition(adapter.itemCount-1)
               }
           }
       }
   }

    private fun recyclerView(){
        adapter = MessagingAdapter()
        rv_messages.adapter =adapter
        rv_messages.layoutManager =LinearLayoutManager(applicationContext)
    }
    private fun sendMessage(){
        val message =et_message.text.toString()
        val timestamp=Time.timeStamp()

        if(message.isNotEmpty())
        {
            et_message.setText("")

            adapter.insertMessage(Message(message, SEND_ID,timestamp))

            rv_messages.scrollToPosition(adapter.itemCount-1)
            botResponse(message)

        }
    }
    private fun botResponse(message: String){
        val timestamp=Time.timeStamp()
        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main){
                val response =BotResponse.basicResponses(message)

                adapter.insertMessage(Message(response, RECEIVE_ID,timestamp))
                rv_messages.scrollToPosition(adapter.itemCount-1)
                when(response){
                    OPEN_GOOGLE->{
                       val site =Intent(Intent.ACTION_VIEW)
                        site.data= Uri.parse("https://www.google.com/")
                        startActivity(site)
                    }
                    OPEN_SEARCH ->{
                        val site =Intent(Intent.ACTION_VIEW)
                        val searchTerm:String?= message.substringAfter("search")
                        site.data=Uri.parse("https://www.google.com/search?&q=$searchTerm")
                        startActivity(site)
                    }
                }
            }
        }

    }

    override fun onStart() {
        super.onStart()

        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main){
                rv_messages.scrollToPosition(adapter.itemCount-1)
            }
        }
    }

    private fun customMessage(message :String){
        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main){
val timestamp = Time.timeStamp()
                adapter.insertMessage(Message(message,RECEIVE_ID,timestamp))


                rv_messages.scrollToPosition(adapter.itemCount-1)
            }
        }
    }
}