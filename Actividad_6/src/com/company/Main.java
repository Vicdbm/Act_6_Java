package com.company;

public class Main {

    public static void main(String[] args) {
        Calificar calif = new Calificar();
        calif.setNombreParticipante("Miguel");
        int[] misCalificaciones = {100, 84, 94, 98, 89};
        calif.setCalificaciones(misCalificaciones);

        calif.muestraCalificacion(calif.getNombreParticipante(), calif.promedio(calif.getCalificaciones()),calif.getCalificaciones());
    }
}
