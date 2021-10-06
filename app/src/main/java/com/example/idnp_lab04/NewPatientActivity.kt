package com.example.idnp_lab04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class NewPatientActivity : AppCompatActivity(), View.OnClickListener {


    companion object{
        const val PATIENT = "PATIENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_patient)

        var fabSave = findViewById<FloatingActionButton>(R.id.np_fab_save)
        var fabCancel = findViewById<FloatingActionButton>(R.id.np_fab_cancel)
        /*
        var npNombre = findViewById<TextInputEditText>(R.id.np_input_nombres)
        var npApePat = findViewById<TextInputEditText>(R.id.np_input_apepat)
        var npApeMat = findViewById<TextInputEditText>(R.id.np_input_apemat)
        var npDni = findViewById<TextInputEditText>(R.id.np_input_dni)
        var npDir = findViewById<TextInputEditText>(R.id.np_input_direccion)*/

        fabSave.setOnClickListener(this)
        fabCancel.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.np_fab_save -> fabSaveHandler()
            R.id.np_fab_cancel -> fabCancelHandler()
        }
    }

    fun fabSaveHandler() {
        var npName = findViewById<TextInputEditText>(R.id.np_tit_name).getText().toString()
        var npApePat = findViewById<TextInputEditText>(R.id.np_tit_apePat).getText().toString()
        var npApeMat = findViewById<TextInputEditText>(R.id.np_tit_apeMat).getText().toString()
        var npDni = findViewById<TextInputEditText>(R.id.np_tit_dni).getText().toString()
        var npDir = findViewById<TextInputEditText>(R.id.np_tit_direccion).getText().toString()


        val intent = Intent()
        intent.putExtra(PATIENT,npName)
        setResult(RESULT_OK, intent)
        finish()
    }

    fun fabCancelHandler() {
        finish()
    }
}