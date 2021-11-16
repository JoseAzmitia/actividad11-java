import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        byte option = 0;
        do{
            try {
                option = Byte.parseByte(JOptionPane.showInputDialog("""
                        Calculadora de Figuras
                        Selecciona una opción
                        1. Calcular Área
                        2. Calcular Perímetro
                        0. Salir"""));
            }catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
                showMenu();
            }
            switch (option) {
                case 1 -> FiguraA();
                case 2 -> FiguraP();
                case 0 -> option = 0;
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while (option != 0);
    }

    public static void FiguraP(){
        byte option = 0;
        do{
            try {
                option = Byte.parseByte(JOptionPane.showInputDialog("""
                        Calculadora de Perímetro
                        Selecciona una opción
                        1. Circulo
                        2. Triangulo
                        3. Cuadrado
                        0. Regresar"""));
            }catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
                FiguraP();
            }
            switch (option) {
                case 1 -> {
                    double radio;
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio (metros)"));
                    Circle circulo = new Circle(radio);
                    JOptionPane.showMessageDialog(null, "La circunferencia del circulo es: " + circulo.getPerimeter() + "m");
                }
                case 2 -> {
                    double lado1, lado2, lado3;
                    lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado 1 (metros)"));
                    lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado 2 (metros)"));
                    lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado 3 (metros)"));
                    Triangle triangulo = new Triangle(lado1, lado2, lado3);
                    JOptionPane.showMessageDialog(null, "El perímetro del triangulo es: " + triangulo.getPerimeter() + "m");
                }
                case 3 -> {
                    double lado;
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de un lado (metros)"));
                    Square cuadrado = new Square(lado);
                    JOptionPane.showMessageDialog(null, "El perímetro del cuadrado es: " + cuadrado.getPerimeter() + "m");
                }
                case 0 -> option = 0;
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while (option != 0);
    }

    public static void FiguraA(){
        byte option = 0;
        do{
            try {
                option = Byte.parseByte(JOptionPane.showInputDialog("""
                        Calculadora de Área
                        Selecciona una opción
                        1. Circulo
                        2. Triangulo
                        3. Cuadrado
                        0. Regresar"""));
            }catch (Throwable e){
                JOptionPane.showMessageDialog(null, "Opción inválida");
                FiguraA();
            }
            switch (option) {
                case 1 -> {
                    double radio;
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio (metros)"));
                    Circle circulo = new Circle(radio);
                    JOptionPane.showMessageDialog(null, "El área del circulo es: " + circulo.getArea() + " metro cuadrado");
                }
                case 2 -> {
                    double base, altura;
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base (metros)"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura (metros)"));
                    Triangle triangulo = new Triangle(base, altura);
                    JOptionPane.showMessageDialog(null, "El área del triangulo es: " + triangulo.getArea() + " metro cuadrado");
                }
                case 3 -> {
                    double lado;
                    lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de un lado (metros)"));
                    Square cuadrado = new Square(lado);
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + cuadrado.getArea() + " metro cuadrado");
                }
                case 0 -> option = 0;
                default -> JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while (option != 0);
    }
}
