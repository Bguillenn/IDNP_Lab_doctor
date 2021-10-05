package com.example.idnp_lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NewPatientActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_patient)

        var fabSave = findViewById<FloatingActionButton>(R.id.np_fab_save)
        var fabCancel = findViewById<FloatingActionButton>(R.id.np_fab_cancel)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.np_fab_save -> fabSaveHandler()
            R.id.np_fab_cancel -> fabCancelHandler()
        }
    }

    fun fabSaveHandler() {

    }

    fun fabCancelHandler() {

    }
}