package com.example.mytestingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mytestingapp.R
import com.example.mytestingapp.databinding.ActivitySecondactivityBinding
import com.example.mytestingapp.viewmodel.MainViewModel

class Secondactivity : AppCompatActivity() {

    var binding:ActivitySecondactivityBinding?=null

    var mainViewModel:MainViewModel?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondactivityBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        mainViewModel= ViewModelProvider(this)[MainViewModel::class.java]
        var postion= intent.getIntExtra("pojtion",0)

        mainViewModel?.let {
           it.loadData()
            it.livedata.observe(this@Secondactivity, Observer {
                Toast.makeText(this@Secondactivity, ""+it[postion].img, Toast.LENGTH_SHORT).show()
            })

        }





    }
}