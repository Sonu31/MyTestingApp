package com.example.mylibrarysk

import android.content.Context
import android.widget.Toast

object MYCLASS {
    public  fun tosty(context: Context,message:String)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}