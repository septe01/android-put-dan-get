package com.example.task1layoutparsedata

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val code = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn-click
            btn_clickme.setOnClickListener {
                val intent = Intent(MainActivity@this,Operan::class.java)
                val num = numSatu.text
                val num2 = numDua.text
//                val hasilX:Int = num + num2
//                Log.i("hasil", hasilX.toString())
                intent.putExtra("numone", num.toString())
                intent.putExtra("numtwo", num2.toString())

                startActivityForResult(intent,code)
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == code && resultCode == Activity.RESULT_OK){
            val data1 = data!!.getStringExtra("numone")
            val data2 = data!!.getStringExtra("numtwo")
            val hasil :Int = data1.toInt() * data2.toInt()
            val result = "Hasil Perkaliah Di Atas : "+hasil.toString()
//            Log.e("info", result.toString())
            hslkali.setText(result.toString())
        }
    }
}







//val num = numSatu.text.toString().toInt()
//Log.i("hasil", hasilX.toString())