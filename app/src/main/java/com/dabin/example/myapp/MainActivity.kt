package com.dabin.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.zzanggu1)
        image1.setOnClickListener {
            Toast.makeText(this, "돼지야", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Zzanggu1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.zzanggu2)
        val image3 = findViewById<ImageView>(R.id.zzanggu3)
        val image4 = findViewById<ImageView>(R.id.zzanggu4)
        val image5 = findViewById<ImageView>(R.id.zzanggu5)
        val image6 = findViewById<ImageView>(R.id.zzanggu6)
        val image7 = findViewById<ImageView>(R.id.zzanggu7)

        image2.setOnClickListener {
            Toast.makeText(this, "뭘봐", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            Toast.makeText(this, "물 많이 먹고", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            Toast.makeText(this, "립밤", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            Toast.makeText(this, "썬크림", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            Toast.makeText(this, "밥 먹고 앉자", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            Toast.makeText(this, "불만 있어?", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Zzanggu7Activity::class.java)
            startActivity(intent)
        }
    }
}