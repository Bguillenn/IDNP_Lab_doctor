package com.example.idnp_lab04

import java.util.*

class Person {
    var nombres: String = "No name"
    var apePat: String = "No ape pat"
    var apeMat: String = "No ape mat"
    var fecNac: Date = Date()
    var sexo: Char = 'M'
    var dni: String = "12345678"
    var direccion: String = "No direction"
    var imgPath: String = "noUserImage"

    constructor(nombres:String, apePat: String, apeMat: String, fecNac: Date, sexo:Char, dni:String, direccion:String, imgPath:String){
        this.nombres = nombres
        this.apePat = apePat
        this.apeMat = apeMat
        this.fecNac = fecNac
        this.sexo = sexo
        this.dni = dni
        this.direccion = direccion
        this.imgPath = imgPath
    }
}