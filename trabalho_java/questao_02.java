public class areas{
    public static void main(String args[]){
        
        double a,b,c,pi;
        a = 3;
        b = 2;
        c = 5;
        pi = 3.14159;
        
        double areaTriangulo = a * b;
        double areaCirculo = pi * (c * c);
        double areaTrapezio = (a+b) * c;
        double areaQuadrado = b*b;
        double areaRetangulo = a*b;
    
        System.out.println("A área do triangulo é: " + areaTriangulo);
        System.out.println("A área do circulo é: " + areaCirculo);
        System.out.println("A área do trapezio é: " + areaTrapezio);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do retangulo é: " + areaRetangulo);
    }
}