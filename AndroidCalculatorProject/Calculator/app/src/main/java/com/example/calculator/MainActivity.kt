package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var n1:Float= 0F
    var n2:Float=0F
    fun getval():Boolean{
        var s1:String=num1.text.toString()
        var s2:String=num2.text.toString()
        if (s1 == "" || s2 == "") {
            res.setText("Please enter a value")
            return false
        } else {
            try {
                // converting string to int.
                n1 = s1.toFloat()

                // converting string to int.
                n2 = s2.toFloat()
            }
            catch (e:Exception){
                res.setText("Enter numbers properly")
                return false
            }
        }

        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            if (getval()){
                var r=n1+n2
                var ans="add result= "+r.toString()
                res.setText(ans)
            }
        }
        sub.setOnClickListener {
            if (getval()){
                var r=n1-n2
                var ans="sub result= "+r.toString()
                res.setText(ans)
            }
        }
        mul.setOnClickListener {
            if (getval()){
                var r=n1*n2
                var ans="mul result= "+r.toString()
                res.setText(ans)
            }
        }
        div.setOnClickListener {
            if (getval() && n2!=0F){
                var r=n1/n2
                var ans="div result= "+r.toString()
                res.setText(ans)
            }
            else{
                res.setText("divisor cannot be 0")
            }
        }
        mod.setOnClickListener {
            if (getval() && n2!=0F){
                var r=n1%n2
                var ans="mod result= "+r.toString()
                res.setText(ans)
            }
            else{
                res.setText("divisor cannot be 0")
            }
        }
        power.setOnClickListener {
            if (getval()){
                var r=Math.pow(n1.toDouble(),n2.toDouble())
                var ans="power result= "+r.toString()
                res.setText(ans)
            }
        }
    }


}