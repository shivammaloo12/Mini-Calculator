package com.shivam.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition(view: View) {
        var num1=txtInput1EditText.editableText.toString()
        var num2=txtInput2EditText.editableText.toString()
        var resultNum=(num1.toInt()+num2.toInt()).toString()
        Toast.makeText(this,resultNum,Toast.LENGTH_LONG).show()
        txtReult.setText(resultNum)
    }

    fun subtraction(view: View) {
        var num1=txtInput1EditText.editableText.toString()
        var num2=txtInput2EditText.editableText.toString()
        var resultNum=(num1.toInt()-num2.toInt()).toString()
        Toast.makeText(this,resultNum,Toast.LENGTH_LONG).show()
        txtReult.setText(resultNum)
    }
    fun multiplication(view: View) {
        var num1=txtInput1EditText.editableText.toString()
        var num2=txtInput2EditText.editableText.toString()
        var resultNum=(num1.toInt()*num2.toInt()).toString()
        Toast.makeText(this,resultNum,Toast.LENGTH_LONG).show()
        txtReult.setText(resultNum)
    }
    fun division(view: View) {
        var num1=txtInput1EditText.editableText.toString()
        var num2=txtInput2EditText.editableText.toString()
        var resultNum=(num1.toInt()/num2.toInt()).toString()
        Toast.makeText(this,resultNum,Toast.LENGTH_LONG).show()
        txtReult.setText(resultNum)
    }


}