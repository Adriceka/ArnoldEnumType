package edu.teamrocket.arnold.logica;

import java.util.EnumSet;

public enum Planeta {

    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);  
    
    public static final double G = 6.674e-11;

    private final double masa;  // kg
    private final double radio; // m

    private Planeta(double masa, double radio){
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    /** GRAVEDAD EN LA SUPERFICIE DEL PLANETA */
    public double gravedadSuperficial() {
        return G * masa / (radio * radio);
    }

    /** CALCULA LA MASA DEL HUMANO A PARTIR DE SU PESO EN LA TIERRA */
    public double masaHumano(double peso) {
        return peso / EARTH.gravedadSuperficial();
    }

    /** PESO DEL HUMANO EN ESTE PLANETA */
    public double pesoSuperficie(double peso) {
        return masaHumano(peso) * gravedadSuperficial();
    }

    /** PLANETAS TERRESTRES */
    public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    /** GIGANTES GASEOSOS */
    public static EnumSet<Planeta> getGigantesGaseosos() {
        return EnumSet.of(JUPITER, SATURN);
    }

    /** GIGANTES HELADOS */
    public static EnumSet<Planeta> getGigantesHelados() {
        return EnumSet.of(URANUS, NEPTUNE);
    }
}