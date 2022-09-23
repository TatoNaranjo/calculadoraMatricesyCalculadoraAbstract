package CalculadoraMatrices;

public class Objetos {
//Contructor Sobrecargado
    public Objetos(int x1, int x2) {
        this.tamañoMatriz1 = x1;

        this.tamañoMatriz2 = x2;

    }
//Constructor Normal
    public Objetos() {
    }
//Inicio de Getters y Setters
    public int getTamaño1() {
        return tamañoMatriz1;
    }

    public void setTamaño1(int x1) {
        this.tamañoMatriz1 = x1;
    }

    public int getTamaño2() {
        return tamañoMatriz2;
    }

    public void setTamaño2(int x2) {
        this.tamañoMatriz2 = x2;
    }
//Fin Getters y Setters
    
    //Declaracion de Variables
    
    private int tamañoMatriz1;

    private int tamañoMatriz2;

}
