/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mh.utils;

import java.text.DecimalFormat;

/**
 *
 * @author enriquenogal
 */
public class Utils {

    public static double redondeoDosDecimales(double d) {
        return 1.0d * Math.round(d * 100.0d) / 100.0d;
    }
    
    public static String formateoDosDecimales(double d){
        return new DecimalFormat("0.00").format(d);
    }
}
