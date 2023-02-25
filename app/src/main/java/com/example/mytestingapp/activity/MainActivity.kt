package com.example.mytestingapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mytestingapp.adapter.recyclerview.AdapterOneImage
import com.example.myapplication.interfaces.OnItemclickListner
import com.example.mylibrarysk.MYCLASS
import com.example.mytestingapp.viewmodel.MainViewModel
import com.example.mytestingapp.R
import com.example.mytestingapp.databinding.ActivityMainBinding
import com.example.mytestingapp.datamodel.StringModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var mainViewModel: MainViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        mainViewModel = ViewModelProvider(this@MainActivity)[MainViewModel::class.java]
        val loadData = mainViewModel?.loadData()

        MYCLASS.tosty(this@MainActivity,"Myname is Sonu")

        var sm = StringModel()


//      sm.image = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0f/ba/29/5c/img-worlds-of-adventure.jpg?w=1200&h=-1&s=1"





        binding.recyclerviewtest.apply {
            mainViewModel?.livedata?.observe(this@MainActivity, Observer { datalist ->

                println("LIVEDATAVIEWMODEL $datalist")

                var adapterOneImage =
                    AdapterOneImage(datalist, context, object : OnItemclickListner {
                        override fun onclick(position: Int) {


                            var intent = Intent(this@MainActivity,Secondactivity::class.java)
                            intent.putExtra("pojtion",position)
                            startActivity(intent)
                        }

                    })
                adapter = adapterOneImage
            })
        }//BINDING BRICKET


    }
}