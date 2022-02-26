package com.company;

public class Calificar {
    private String nombreParticipante;
    private int[] calificaciones = new int[5];

    public int promedio(int[] calificaciones) {
        int suma = 0;

        for (int i = 0; i<calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return suma/calificaciones.length;
    }

    public char calificacion(int promedio) {
        char letra='A';
        if (promedio >= 91 && promedio <= 100) letra = 'A';
        else if (promedio >= 81 && promedio <= 90) letra = 'B';
        else if (promedio >= 71 && promedio <= 80) letra = 'C';
        else if (promedio >= 61 && promedio <= 70) letra = 'D';
        else if (promedio >= 51 && promedio <= 60) letra = 'E';
        else if (promedio <= 50) letra = 'F';
        return letra;
    }

    public void muestraCalificacion(String nombre, int promedio, int[] calificaciones) {
        System.out.println("Nombre del estudiante: "+nombre);
        for (int i=0; i<calificaciones.length; i++) {
            System.out.println("Calificacion "+(i+1)+": "+calificaciones[i]);
        }

        System.out.println("Promedio: "+promedio);

        System.out.println("Calificacion: "+calificacion(promedio));
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }
}
