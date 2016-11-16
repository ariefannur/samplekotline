package com.arief.samplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            if(!etUsername.text.isEmpty()  && !etPassword.text.isEmpty()) {
                if (etUsername.text.equals("arief") && etPassword.text.equals("12345"))
                    txtHello.setText("Selamat datang " + etUsername.text.toString())
                else
                    Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()

            }else {
                Toast.makeText(this, "username dan password tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
