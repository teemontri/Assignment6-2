package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fail = Toast.makeText(applicationContext,"Some field is blank.", Toast.LENGTH_LONG)
        val clear1 = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
        var credit:Double
        var grade:Double
        var gpa:Double

        ok.setOnClickListener(){
            if (this.a1.text.toString() == "" || this.a2.text.toString() == "" || this.a3.text.toString() == "" || this.a4.text.toString() == ""
                    || this.a5.text.toString() == "" || this.c1.text.toString() == "" || this.c2.text.toString() == "" || this.c3.text.toString() == "" ||
                    this.c4.text.toString() == "" || this.c5.text.toString() == "" || this.P1.text.toString() == "" || this.P2.text.toString() == "" ||
                    this.P3.text.toString() == "" || this.P4.text.toString() == "" || this.P5.text.toString() == ""){
                fail.show()
            }else{
                val credit1 = c1.getText().toString().toDouble()
                val credit2 = c2.getText().toString().toDouble()
                val credit3 = c3.getText().toString().toDouble()
                val credit4 = c4.getText().toString().toDouble()
                val credit5 = c5.getText().toString().toDouble()
                val grad1 = P1.getText().toString().toDouble()
                val grad2 = P2.getText().toString().toDouble()
                val grad3 = P3.getText().toString().toDouble()
                val grad4 = P4.getText().toString().toDouble()
                val grad5 = P5.getText().toString().toDouble()
                credit = credit1 + credit2 + credit3 + credit4 + credit5
                grade = (grad1 * credit1) + (grad2 * credit2) + (grad3 * credit3) + (grad4 * credit4) + (grad5 * credit5)
                gpa = grade / credit
                val GPA = String.format("%.2f", gpa) ;
                TP.setText("$credit")
                tgpa.setText("$GPA")
            }
        }
        clear.setOnClickListener(){
            a1.setText(null)
            a2.setText(null)
            a3.setText(null)
            a4.setText(null)
            a5.setText(null)
            c1.setText(null)
            c2.setText(null)
            c3.setText(null)
            c4.setText(null)
            c5.setText(null)
            P1.setText(null)
            P2.setText(null)
            P3.setText(null)
            P4.setText(null)
            P5.setText(null)
            TP.setText(null)
            tgpa.setText(null)
            clear1.show()
        }
    }
}