package com.example.rene.proyecto;

/*  En esta Seccion instancio una clase llamada Calificaciones la cual a su vez detalla
* las variables en flotante, se capturan los valores de todas las variables de calificaciones
* y luego ejecuto una operacion matematica que me permite calcular el promedio
* de las notas introducidas.*/

public class Calificaciones {
    private float cal1;
    private float cal2;
    private float cal3;
    private float calF;

    Calificaciones(float a, float b, float c)
    {
        this.cal1 = a;
        this.cal2 = b;
        this.cal3 = c;

    }

    public float getCal1() {
        return cal1;
    }

    public void setCal1(float cal1) {
        this.cal1 = cal1;
    }

    public float getCal2() {
        return cal2;
    }

    public void setCal2(float cal2) {
        this.cal2 = cal2;
    }

    public float getCal3() {
        return cal3;
    }

    public void setCal3(float cal3) {
        this.cal3 = cal3;
    }

    public float getCalF() {
        return calF;
    }

    public void setCalF(float calF) {
        this.calF = calF;
    }

    public float calcularPromedio(){
        calF = cal1 + cal2 + cal3;
        return calF/3;

    }
}
