package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Funciones genericas que puede usar cualquier programa
public class Util {

    public Boolean buscarCoincidencia(String cadena, String expresionRegular){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean buscarFormato(String fecha, String expresionRegular){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(fecha);
        if(coincidencia.matches()){
            return true;
        }else{
            return false;
        }
    }

    public  LocalDate convertirStringEnLocaDate (String fecha){
        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate nuevaFecha = LocalDate.parse(fecha, formatear);
        return nuevaFecha;
    }


}
