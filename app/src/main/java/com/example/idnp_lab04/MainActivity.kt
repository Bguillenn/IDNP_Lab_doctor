package com.example.idnp_lab04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.view.animation.AlphaAnimation

import android.view.animation.Animation
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.contract.ActivityResultContracts.*
import com.example.idnp_lab04.NewPatientActivity.Companion.PATIENT


class MainActivity : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemClickListener {

    lateinit var items: ArrayList<String>

    private val patientActivity = registerForActivityResult(StartActivityForResult()){ activityResult ->
        val name = activityResult.data?.getStringExtra(PATIENT)
        if (name != null) {
            items.add(name)
        }

        var listView = findViewById<ListView>(R.id.lvPacientes)
        var myAdapter = PatientAdapter(this, R.layout.list_view_patient_layout, items)
        listView.adapter = myAdapter

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fab = findViewById<FloatingActionButton>(R.id.fabNewPatient)
        var listView = findViewById<ListView>(R.id.lvPacientes)

        //TODO metodos para los pacientes
        items = ArrayList<String>()
        items.add("Juan")
        items.add("Pepe")
        items.add("Renzo")
        items.add("Carlos")
        items.add("Brayan")
        items.add("Karen")
        items.add("Cristian")
        items.add("Jhonatan")


        //Creamos nuestro adapter y lo establecemos
        var myAdapter = PatientAdapter(this, R.layout.list_view_patient_layout, items)
        listView.adapter = myAdapter


        listView.setOnItemClickListener(this)
        fab.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.fabNewPatient -> fabClickHandler()
        }

    }



    fun fabClickHandler(){

        var intent: Intent = Intent(this, NewPatientActivity::class.java)
        patientActivity.launch(intent)

        Toast.makeText(this, "Esto es una prueba", Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(adapterView: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        //Animation
        val animation1: Animation = AlphaAnimation(0.3f, 1.0f)
        animation1.duration = 500
        view!!.startAnimation(animation1)

        //Actions
        Toast.makeText(this, "Has pulsado ${items.get(pos)}", Toast.LENGTH_SHORT).show()
    }

}