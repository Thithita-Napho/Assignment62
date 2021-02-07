package com.example.assignment6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.", Toast.LENGTH_LONG)
        var c1 = 0
        var c2 = 0
        var c3 = 0
        var c4 = 0
        var c5 = 0
        var p1 = 0.0
        var p2 = 0.0
        var p3 = 0.0
        var p4 = 0.0
        var p5 = 0.0
        var sumC = 0
        var sumP = 0.00
        var gpa = 0.00

        btOk.setOnClickListener(){
            if (this.sub1.text.toString() == "" || this.sub2.text.toString() == "" || this.sub3.text.toString() == ""|| this.sub4.text.toString() == ""
                    || this.sub5.text.toString() == ""|| this.credit1.text.toString() == ""|| this.credit2.text.toString() == ""|| this.credit3.text.toString() == ""
                    || this.credit4.text.toString() == ""|| this.credit5.text.toString() == ""|| this.point1.text.toString() == ""|| this.point2.text.toString() == ""
                    || this.point3.text.toString() == ""|| this.point4.text.toString() == ""|| this.point5.text.toString() == ""){
                a.show()
            }
            else
                {
                 c1= this.credit1.text.toString().toInt()
                 c2= this.credit1.text.toString().toInt()
                 c3= this.credit1.text.toString().toInt()
                 c4= this.credit1.text.toString().toInt()
                 c5= this.credit1.text.toString().toInt()
                 p1= this.point1.text.toString().toDouble()
                 p2= this.point1.text.toString().toDouble()
                 p3= this.point1.text.toString().toDouble()
                 p4= this.point1.text.toString().toDouble()
                 p5= this.point1.text.toString().toDouble()
                    sumC=c1+c2+c3+c4+c5
                    sumP=p1+p2+p3+p4+p5
                 gpa = sumP/sumC
                    TotalCreadit.setText(sumC.toString())
                    textGPA.setText(gpa.toString())
        }

        }

        btClear.setOnClickListener(){
            sub1.setText(null)
            sub2.setText(null)
            sub3.setText(null)
            sub4.setText(null)
            sub5.setText(null)
            credit1.setText(null)
            credit2.setText(null)
            credit3.setText(null)
            credit4.setText(null)
            credit5.setText(null)
            point1.setText(null)
            point2.setText(null)
            point3.setText(null)
            point4.setText(null)
            point5.setText(null)
            TotalCreadit.setText(null)
            textGPA.setText(null)
        }

    }
}