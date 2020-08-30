package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showDatePickerDialog(v: View) {
        val newDateFragment = BirthDayPickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }
    fun showGender(view: View) {
        val selectID: Int = radio.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked: RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        } catch (t: Throwable) {
            gender = ""
        }
        text_show.text =
            "Username:${edit_user.text}\nPassword: ${edit_pass.text}\nGender: ${gender}\nE-mail: ${edit_email.text}\nBirthday: ${text_birthDay.text}"
    }
    fun reset(v: View) {
        edit_user.text.clear()
        edit_pass.text.clear()
        edit_email.text.clear()
        radio.clearCheck()
        text_birthDay.text = "mm/dd/yy"
        text_show.text = "Show Information"
    }
}