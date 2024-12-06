package com.example.snackbar

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var editTextEtInput: EditText
    private lateinit var textTVOutput:TextView

    private lateinit var buttonSaveBTN:Button
    private lateinit var buttonExitBTN:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextEtInput = findViewById(R.id.editTextEtInput)
        textTVOutput = findViewById(R.id.textTVOutput)

        buttonSaveBTN = findViewById(R.id.buttonSaveBTN)
        buttonExitBTN = findViewById(R.id.buttonExitBTN)

    }
    fun onClick(view: View) {
        textTVOutput.text = editTextEtInput.text
        editTextEtInput.text.clear()
    }
    fun onClickTwo(view: View) {
        Snackbar.make(view,"Подтвердите удаление",Snackbar.LENGTH_LONG).setAction("Удалить"){
            textTVOutput.text = " "
            Snackbar.make(view,"Данные удалены",Snackbar.LENGTH_SHORT).show()
        }.show()
    }
}
