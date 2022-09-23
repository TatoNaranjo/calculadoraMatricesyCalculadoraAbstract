package CalculadoraMatrices;

import javax.swing.JOptionPane;

public class Logica {
  Objetos obj = new Objetos();
    public void SumaMatrices() {

      
        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Primer Matriz en n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        obj.setTamaño2(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Segunda Matriz en n*n")));

        int matriz2[][] = new int[obj.getTamaño2()][obj.getTamaño2()];
        int matrizResultado[][] = new int[matriz2.length][matriz2.length];

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
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        String a = "";

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {

                a = a + ("[ " + matrizResultado[i][j] + " ]\t");
            }

            a = a + "\n";

        }

        JOptionPane.showMessageDialog(null, "El Resultado de la Suma de las Matrices es:\n" + a);
    }

    public void restaMatrices() {

        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Primer Matriz n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        obj.setTamaño2(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Segunda Matriz n*n")));

        int matriz2[][] = new int[obj.getTamaño2()][obj.getTamaño2()];
        int matrizResultado[][] = new int[matriz2.length][matriz2.length];

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
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        String a = "";

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {

                a = a + ("[ " + matrizResultado[i][j] + " ]\t");
            }

            a = a + "\n";

        }

        JOptionPane.showMessageDialog(null, "El Resultado de la Resta de las Matrices es:\n" + a);
    }

    public void trazaMatriz() {

        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Matriz n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];
        int traza = 0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz en la Posición [" + i + "]" + "[" + j + "]"));
            }
        }
        int i = 0;
        int j = 0;
        while (i < matriz1.length && j < matriz1.length) {
            traza = matriz1[i][j] + traza;
            i++;
            j++;
        }

        JOptionPane.showMessageDialog(null, "La traza es:" + traza);
    }

    //Metodos Para Obtener Determinantes
    public void determinante() {
    
        obj.setTamaño1(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Tamaño n de Tu Matriz n*n")));

        int matriz1[][] = new int[obj.getTamaño1()][obj.getTamaño1()];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero Para llenar Tu Matriz"));
            }
        }
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
