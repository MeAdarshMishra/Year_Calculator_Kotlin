package com.example.yearcalculator
//Year Calculator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
@SuppressLint("SetTextI18n")
fun onSubmit(view:View){
    val currentYear=Calendar.getInstance().get(Calendar.YEAR);
    result.text="AGE: "+(currentYear-input.text.toString().toInt());
}
}
