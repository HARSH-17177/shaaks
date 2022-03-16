package com.sparklead.shaaks.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.sparklead.shaaks.R
import com.sparklead.shaaks.data.Message
import com.sparklead.shaaks.utils.Constants.RECEIVE_ID
import com.sparklead.shaaks.utils.Constants.SEND_ID
import kotlinx.android.synthetic.main.message_item.view.*

class MessagingAdapter:RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {
    var messageList = mutableListOf<Message>()
    inner class MessageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
 init {
    itemView.setOnClickListener{
messageList.removeAt(adapterPosition)
        notifyItemRemoved(adapterPosition)
    }
 }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
     return MessageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message_item,parent,false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
      val currentMessage = messageList[position]
        when(currentMessage.id)
        {
            SEND_ID ->{
                holder.itemView.tv_message.apply {
                    text=currentMessage.message
                    visibility=View.VISIBLE
                }
             holder.itemView.tv_bot_message.visibility =View.GONE
            }
            RECEIVE_ID -> {
holder.itemView.tv_bot_message.apply {
    text=currentMessage.message
    visibility=View.VISIBLE
}
  holder.itemView.tv_message.visibility=View.GONE
            }

        }
    }

    override fun getItemCount(): Int {
       return messageList.size
    }
    fun insertMessage(message: Message)
    {
        this.messageList.add(message)
        notifyItemInserted(messageList.size)

    }
}