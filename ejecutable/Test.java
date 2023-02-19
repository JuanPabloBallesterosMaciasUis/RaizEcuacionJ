package ejecutable;

import javax.swing.JOptionPane;

public class Test
{

    public static void main(String[] args) {
        // Pedir al usuario los coeficientes de la ecuación
    String coeficienteA = JOptionPane.showInputDialog(null, "Introduce el coeficiente a:");
    String coeficienteB = JOptionPane.showInputDialog(null, "Introduce el coeficiente b:");
    String coeficienteC = JOptionPane.showInputDialog(null, "Introduce el coeficiente c:");
    
    // Convertir los coeficientes a tipo double
    double a = Double.parseDouble(coeficienteA);
    double b = Double.parseDouble(coeficienteB);
    double c = Double.parseDouble(coeficienteC);
    
    // Calcular el discriminante
    double discriminante = b*b - 4*a*c;
    
    // Verificar si la ecuación tiene raíces reales
    if (discriminante < 0) {
        JOptionPane.showMessageDialog(null, "La ecuación no tiene raíces reales.");
    } else {
        // Calcular las raíces y mostrar el resultado al usuario
        double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
        JOptionPane.showMessageDialog(null, "Las raíces de la ecuación son: " + x1 + " y " + x2);
    }
    }
}
    
