package com.example.myapplication.repository

import androidx.compose.runtime.key
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.datamodel.SingleStringmodel
import com.example.mytestingapp.datamodel.StringModel
import com.example.mytestingapp.datamodel.Testimgmodel.MYJSON
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ListResult
import com.google.firebase.storage.StorageReference

class Repo {

    private val database = Firebase.database
    val myref = database.getReference("allwishescard")

    val company = {
        println("GeeksforGeeks")
    }

    fun fatchimg(livedata: MutableLiveData<List<SingleStringmodel>>) {
        myref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {


                val mydata: List<SingleStringmodel> = snapshot.children.map { snapshots ->
                    snapshots.getValue(SingleStringmodel::class.java)!!
                }

                println("ROHIT" + mydata)

                livedata.postValue(mydata)


            }

            override fun onCancelled(error: DatabaseError) {
            }
        })
    }




//    if (snapshot.exists()) {
//        for (i in snapshot.children) {
//            val student = i.getValue(Students::class.java)
//            if (student != null) {
//                studentsList.add(student)
//            }
//        }

    val myref2 = database.getReference("gooapps")

//    fun fatchimg2(mlivedata:MutableLiveData<List<SingleStringmodel>> )
    fun fatchimg2( )
      {

          var  list:ArrayList<MYJSON> = ArrayList()
          myref2.addValueEventListener(object :ValueEventListener {
              override fun onDataChange(snapshot: DataSnapshot) {

                  val arrli:ArrayList<SingleStringmodel> =  ArrayList()
                  var mydata: List<SingleStringmodel> = ArrayList()
                  for (dum in snapshot.priority.toString()) {
                      mydata = snapshot.children.map { snapshots ->
                          snapshots.getValue(SingleStringmodel::class.java)!!
                      }
                      println("JKNDS  $mydata")

                  }

//                  var  list :List<SingleStringmodel> =  snapshot.children.map { data->
//              data.getValue(SingleStringmodel::class.java)!!

//                      mlivedata.postValue(list)



              }

              override fun onCancelled(error: DatabaseError) {
              }
          })
      }


      fun fatchstoragedata()

      {
          val storage: FirebaseStorage = FirebaseStorage.getInstance()
//           val storageRef: StorageReference = storage.reference
          val storageRef:StorageReference = storage.reference.child("goodmorning")

          val imagelist:ArrayList<StringModel>   = ArrayList()

          val listalltask : Task<ListResult> = storageRef.listAll()
          listalltask.addOnSuccessListener { result ->

          val items:List<StorageReference> = result.items

          items. forEachIndexed { index, item ->
              item.downloadUrl.addOnCompleteListener {

                  imagelist.add(StringModel(it.toString()))
                  println("STORAGEDATA $imagelist")


              }.addOnSuccessListener {

              }
          }

          }
      }






//            items.forEachIndexed{index, item ->
//                item.downloadUrl.addOnSuccessListener {
//                    Log.d("item", "$it")
//                    imagelist.add(Item(it.toString()))
//                }.addOnCompleteListener{
//
//
////                    binding.gifRecyclerview.apply {
////
////
////                        println("SKRAM==$imagelist")
////                        val adpterOneImage = com.example.myapplication.adapter.recyclerview.AdpterOneImage(
////                            imagelist,
////                            this@MainActivity,
////                            object : OnItemclickListner {
////                                override fun onclick(position: Int) {
////
////                                    Toast.makeText(this@MainActivity, "P", Toast.LENGTH_SHORT)
////                                        .show()
////                                    TODO("Not yet implemented")
////                                }
////
////                            })
////                        adapter= adpterOneImage
////
////                    }
//
//                }
//
//            }
//        }


}