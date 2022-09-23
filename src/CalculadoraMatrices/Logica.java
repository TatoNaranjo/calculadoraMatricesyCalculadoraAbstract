package CalculadoraMatrices;

import javax.swing.JOptionPane;

public class Logica {
    //Creación del objeto para la Clase Objetos
  Objetos obj = new Objetos();
  //Inicio del Metodo Suma Matrices
    public void SumaMatrices() {

      //Se validan los 2 tamaños n de las matrices y se guardan en las variables encapsuladas.
        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Primer Matriz en n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        obj.setTamaño2(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Segunda Matriz en n*n")));

        int matriz2[][] = new int[obj.getTamaño2()][obj.getTamaño2()];
        int matrizResultado[][] = new int[matriz2.length][matriz2.length];
       //Se Leen las Matrices y se van Rellenando Posición Por Posición
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        //Se suman las Matrices y se guarda el Resultado
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        String a = "";
//Guardamos todo en Un String para Imprimir en la Interfaz
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {

                a = a + ("[ " + matrizResultado[i][j] + " ]\t");
            }

            a = a + "\n";

        }
   //Se Imprime en un Option Pane
        JOptionPane.showMessageDialog(null, "El Resultado de la Suma de las Matrices es:\n" + a);
    }
//Fin del Metodo Suma de Matrices
    
    //inicio del Metodo Resta de Matrices
    
    public void restaMatrices() {

        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Primer Matriz n*n")));
         //Se validan los 2 tamaños n de las matrices y se guardan en las variables encapsuladas.
        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        obj.setTamaño2(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Segunda Matriz n*n")));

        int matriz2[][] = new int[obj.getTamaño2()][obj.getTamaño2()];
        int matrizResultado[][] = new int[matriz2.length][matriz2.length];
    //Se Rellenan las matrices con las diferentes 
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Primera Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Segunda Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        //Se restan Las Matrices y se guardan en una matriz Resultado
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        String a = "";
        //Se guardan los resultados de la matriz en un String
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {

                a = a + ("[ " + matrizResultado[i][j] + " ]\t");
            }

            a = a + "\n";

        }
        //Se Imprime el String.
        JOptionPane.showMessageDialog(null, "El Resultado de la Resta de las Matrices es:\n" + a);
    }
    //Fin del Metodo de Resta de Matrices
    
    //Inicio del Metodo de Traza de Matrices
    public void trazaMatriz() {
        //Se Pide el tamaño de la matriz y se guarda en una variable Matriz
        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Matriz n*n")));
        
        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        //Inicializamos una matriz y la rellenamos con los valores del usuario
        //inicializamos una variable resultado en 0
        int traza = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        //Hacemos el Cálculo de la traza por medio de contadores
        int i = 0;
        int j = 0;
        while (i < matriz1.length && j < matriz1.length) {
            traza = matriz1[i][j] + traza;
            i++;
            j++;
        }
        //Se imprimen los Resultados de la Traza
        JOptionPane.showMessageDialog(null, "La traza es:" + traza);
    }
    //Fin del Metodo de Traza de Matrices.
    
    //Metodos Para Obtener Determinantes
    public void determinante() {
      //Solicitamos el Tamaño de la Matriz y la guardamos en una nueva variable matriz.
        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Matriz n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        //Solicitamos numeros para Rellenar la Matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz"));
            }
        }
        //Recibimos el Resultado del Metodo DeterminanteMatriz
        JOptionPane.showMessageDialog(null, "La determinante de  la matriz es \t" + determinanteMatriz(matriz1, obj.getTamaño1()));
    }

    static void ObtenerCofactor(int matriz1[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (fila != p && columna != q) {
                    temp[i][j++] = matriz1[fila][columna];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }

            }

        }
    }
    
    //Terminando el Cofactor

    static int determinanteMatriz(int matriz1[][], int n) {
        int determinante = 0;
        if (n == 1) {
            return matriz1[0][0];
        }
        int temp[][] = new int[n][n];
        int multiplicador = 1;
        for (int f = 0; f < n; f++) {
            ObtenerCofactor(matriz1, temp, 0, f, n);
            determinante += multiplicador * matriz1[0][f] * determinanteMatriz(temp, n - 1);
            multiplicador = -multiplicador;
        }
        return determinante;
    }
}
