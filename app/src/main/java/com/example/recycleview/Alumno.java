package com.example.recycleview;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable{
    //variables
    private int id;
    private String carrera;
    private String nombre;
    private Integer img;
    private String matricula;

    //constructores
    public Alumno() {
    }

    public Alumno(String carrera, String nombre, Integer img, String matricula) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.img = img;
        this.matricula = matricula;
    }

    //encapsulamiento
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // funciones
    public static ArrayList<Alumno> llenarAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String carrera = "Ing. Tec. Información";

        alumnos.add(new Alumno(carrera, "PERAZA SAIZ ANGEL ADRIAN", R.drawable.a01, "2018030155"));
        alumnos.add(new Alumno(carrera, "GOMEZ CAMARENA JOSE RICARDO", R.drawable.a02, "2017030274"));
        alumnos.add(new Alumno(carrera, "PEÑA SOLIS DIEGO ARMANDO", R.drawable.a03, "2017030432"));
        alumnos.add(new Alumno(carrera, "GARCIA SILVA ADRIAN", R.drawable.a04, "2018030098"));
        alumnos.add(new Alumno(carrera, "GARCIA RODRIGUEZ JESUS EFRAIN", R.drawable.a05, "2018030099"));
        alumnos.add(new Alumno(carrera, "LIZARRAGA CAMACHO JESUS ARMANDO", R.drawable.a06, "2018030103"));
        alumnos.add(new Alumno(carrera, "GARCIA GOMEZ JUAN ANTONIO", R.drawable.a07, "2018030108"));
        alumnos.add(new Alumno(carrera, "LIZARRAGA LUNA JUAN FRANCISCO", R.drawable.a08, "2018030119"));
        alumnos.add(new Alumno(carrera, "OSUNA HIGUERA ALEJANDRO", R.drawable.a09, "2018030121"));
        alumnos.add(new Alumno(carrera, "MARIN GALINDO KIMBERLY VANESSA", R.drawable.a10, "2018030155"));

        return alumnos;
    }
}
