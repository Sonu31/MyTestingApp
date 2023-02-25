package com.example.mytestingapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.datamodel.SingleStringmodel
import com.example.myapplication.repository.Repo

class MainViewModel:ViewModel() {

   private  val repo= Repo()

   val mutabledata = MutableLiveData<List<SingleStringmodel>>()
    val  livedata:LiveData<List<SingleStringmodel>> = mutabledata

    val mutabledata2 = MutableLiveData<List<SingleStringmodel>>()
    val  livedata2:LiveData<List<SingleStringmodel>> = mutabledata2

    init {
        println("MUTABLEDATA $mutabledata")

    }



    fun loadData()
    {
        repo.fatchimg(mutabledata)
//        repo.fatchstoragedata()
        repo.fatchimg2()
    }











//
//     val   livedata:LiveData<MutableList<>> = mutabledata
//
//
//    fun kk()
//    {
//        repo.fatchimg(mutabledata)
//
//    }


    //--------------------------------

//    val _textdata= MutableLiveData<String>()
//    val _btntextdata = MutableLiveData<String>()
//
//    val text2:LiveData<String>
//        get() = _textdata
//
//    val  textbtn2 :LiveData<String>
//        get() = _btntextdata
//
//
//    init {
//        _textdata.value= "my name is Sonam kumar"
//        _btntextdata.value= " Button name khan"
//    }
//
//
//
//
//
//    fun updatetext()
//    {
//        _textdata.value= "my name is Rohit kumar"
//        _btntextdata.value= "Android dev"
//    }
//
//
//
//    //  2. =============================================
//    var text= "Subscribe our channel"
//    var btntext= "subscribe"
//
//
//    fun updateTest()
//    {
//        text= "My name is sonu kumar"
//        btntext= "subscribed"
//    }
//
//    //   1. -------------------------------------------------------------
//    var cont= 0
//
//    fun incremetn()
//    {
//        cont++
//    }
//




}