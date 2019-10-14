package com.example.task1layoutparsedata

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_operan.*

class Operan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operan)

        val numSatu = intent.getStringExtra("numone")
        val numDua = intent.getStringExtra("numtwo")

        val Total:Int = numSatu.toInt() + numDua.toInt()

        tvstr1.setText(numSatu.toString())
        tvstr2.setText(numDua.toString())
        tvjumlah.setText(Total.toString())

    }

    override fun onBackPressed() {
        val intent = Intent()
        val dat1 = tvstr1.text
        val dat2 = tvstr2.text

        intent.putExtra("numone", dat1.toString())
        intent.putExtra("numtwo", dat2.toString())
//        Log.i("test", data2.toString())
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}



