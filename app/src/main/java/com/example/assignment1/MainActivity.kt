package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd:Button=findViewById(R.id.btnAdd)
        val spinnerTextView:TextView=findViewById(R.id.spinnerText)
        val spinner:Spinner=findViewById(R.id.spinner)
        val edAddItem:EditText=findViewById(R.id.edAddItem)
        val spinnerOptions= arrayOf("Abdullah","Ali")
        var spinnerOptionIndex:Int=0

//        print("Test")
//        log("test")
        spinner.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerOptions)

            spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    spinnerTextView.text=spinnerOptions[p2]
                    spinnerOptionIndex=p2
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }


            }
        btnAdd.setOnClickListener{view ->
            val edText:String=edAddItem.text.toString()
            spinnerOptions[spinnerOptionIndex]=edText
            spinnerTextView.text=edText

//            spinnerOptions +="jamal"

        }

    }
}

