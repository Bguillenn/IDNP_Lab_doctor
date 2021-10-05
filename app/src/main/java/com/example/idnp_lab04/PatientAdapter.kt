package com.example.idnp_lab04

import android.content.Context
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView


//TODO: Cambiar string por clase Person
class PatientAdapter: BaseAdapter {

    lateinit var context: Context
    var layout: Int = 0
    lateinit var items: ArrayList<String>


    constructor(context: Context, layout: Int, items:ArrayList<String>){
        this.context = context
        this.layout = layout
        this.items = items
    }

    override fun getCount(): Int {
        return this.items.size
    }

    override fun getItem(pos: Int): Any {
        return this.items.get(pos)
    }

    override fun getItemId(id: Int): Long {
        return id.toLong();
    }

    override fun getView(pos: Int, convertView: View?, viewGroup: ViewGroup?): View {
        var v = convertView
        var layoutInflater = LayoutInflater.from(this.context)
        v = layoutInflater.inflate(R.layout.list_view_patient_layout, null)

        var currentItem: String = this.items.get(pos)

        //Establecemos los datos en la vista del layout
        //TODO: aca tenemos que cargar imagen, nombre, ape pat y dni

        var etNombre = v.findViewById<TextView>(R.id.patient_name)
        etNombre.text = currentItem
        return v
    }

}