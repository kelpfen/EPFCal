package com.example.epfcalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        fun getSaving(age: Int): Double {

            when(age){
                in 16 ..20 -> return 5000.00
                in 21 ..25 -> return 14000.00
                in 26 ..30 -> return 29000.00
                in 31 ..35 -> return 50000.00
                in 36 ..40 -> return 78000.00
                in 41 ..45 -> return 116000.00
                in 46 ..45 -> return 165000.00
                in 51 ..55 -> return 228000.00
                else -> return 0.00

            }
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDOB.setOnClickListener(){
            val c:Calendar = Calendar.getInstance();
            val currentDay = c.get(Calendar.DAY_OF_MONTH);
            val currentMonth = c.get(Calendar.MONTH);
            val currentYear = c.get(Calendar.YEAR);


            val dpd = DatePickerDialog (this, DatePickerDialog.OnDateSetListener{
                view, year, month, day -> txtDOB.setText(day.toString() + "/" + (month + 1).toString() +"/" + year.toString())
                val age = currentYear - year;
                textView5.setText(age.toString())
                val saving = getSaving(age);
                textView7.setText(saving.toString());
            }, currentYear, currentMonth, currentDay)

            dpd.show();

        }




}



    }

