package com.mycompany.uf4;
import java.util.Scanner;

/*
+---------------------------------------------------------------+
| Author: MadeBomb - Alex Ballesteros                           |
| Github: https://github.com/madebomb25/Scanner-Validator-Class |
|                                                               |
| Version: 0.1                                                  |
+---------------------------------------------------------------+
*/
public class Validate {
    
    /* MENSAJES POR DEFECTO */
    String intMessage = "El número no cumple el formato solicitado. Escribe un número corto sin decimales: ";
    String longMessage = "El número no cumple el formato solicitado. Escribe un número sin decimales: ";
    
    String floatMessage = "El número no cumple el formato solicitado. Escribe un número entero corto o con decimales: ";
    String doubleMessage = "El número no cumple el formato solicitado. Escribe un número entero o con decimales: ";
    
    String optionNotFound = "No se ha elegido una opción correcta de la lista. Vuelva a intentarlo: ";
    
    
    Scanner sc;
    
    public Validate(Scanner sc) {
        this.sc = sc;
    }
    
    /* VALIDACIÓN DE NÚMEROS */
    
    /*
    Se pide un número por terminal en caso de que no existiera algo ya en el buffer.
    Si se puede considerar un entero o es convertible a uno, devuelve como valor.
    En caso contrario, se le pide al usuario que introduzca otro número.
    
    El mensaje que se le muestra al usuario puede modificarse cambiando el valor del atributo 'intMessage'.
    Recuerda que hacerlo modificará el mensaje para todas las validaciones del mismo tipo para una instancia
    del objeto Validate. Si deseas modificar el mensaje para validaciones concretas, puedes usar la variación del método
    con un parámetro adicional como mensaje customizado. También puedes crear una nueva instancia si así lo deaseas.
    */
    public int validateInt() {
        while (!sc.hasNextInt()) {
            System.out.println(intMessage);
            sc.nextLine();
        }
        
        return sc.nextInt();
    }
    
    /*
    Se pide un número por terminal en caso de que no existiera algo ya en el buffer.
    Si se puede considerar un tipo 'long' o es convertible a uno, se devuelve como valor.
    En caso contrario, se le pide al usuario que introduzca otro número.
    
    El mensaje que se le muestra al usuario puede modificarse cambiando el valor del atributo 'longMessage'.
    Recuerda que hacerlo modificará el mensaje para todas las validaciones del mismo tipo para una instancia
    del objeto Validate. Si deseas modificar el mensaje para validaciones concretas, puedes usar la variación del método
    con un parámetro adicional como mensaje customizado. También puedes crear una nueva instancia si así lo deaseas.
    */
    public long validateLong() {
        while(!sc.hasNextLong()) {
            System.out.println(longMessage);
            sc.nextLine();
        }
        
        return sc.nextLong();
    }
    
    /*
    Se pide un número por terminal en caso de que no existiera algo ya en el buffer.
    Si se puede considerar un decimal o es convertible a uno, se devuelve como valor.
    En caso contrario, se le pide al usuario que introduzca otro número.
    
    Es importante recalcar que Java permite conversión de números 'double' a float a cambio
    de en el algunos casos perder parte de la información de este. Introducir números
    muy grandes o con muchos decimales de precisión puede significar perder parte de la información
    si la conversión al tipo float no es perfecta.
    
    El mensaje que se le muestra al usuario puede modificarse cambiando el valor del atributo 'floatMessage'.
    Recuerda que hacerlo modificará el mensaje para todas las validaciones del mismo tipo para una instancia
    del objeto Validate. Si deseas modificar el mensaje para validaciones concretas, puedes usar la variación del método
    con un parámetro adicional como mensaje customizado. También puedes crear una nueva instancia si así lo deaseas.
    */
    public float validateFloat() {
        while (!sc.hasNextFloat()) {
            System.out.println(floatMessage);
            sc.nextLine();
        }
        
        return sc.nextFloat();
    }
    
    /*
    Se pide un número por terminal en caso de que no existiera algo ya en el buffer.
    Si se puede considerar un tipo 'double' o es convertible a uno, se devuelve como valor.
    En caso contrario, se le pide al usuario que introduzca otro número.
    
    A diferencia de 'validateFloat()' este método soporta conversión completa de un valor de tipo
    'float' a 'double', ya que 'double' es un tipo de dato que puede contener una mayor cantidad de datos
    que 'float' (float solo guarda 32 bits, double 64).
    
    El mensaje que se le muestra al usuario puede modificarse cambiando el valor del atributo 'doubleMessage'.
    Recuerda que hacerlo modificará el mensaje para todas las validaciones del mismo tipo para una instancia
    del objeto Validate. Si deseas modificar el mensaje para validaciones concretas, puedes usar la variación del método
    con un parámetro adicional como mensaje customizado. También puedes crear una nueva instancia si así lo deaseas.
    */
    public double validateDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println(doubleMessage);
            sc.nextLine();
        }
        
        return sc.nextDouble();
    }
    
    /* VALIDACIÓN DE STRINGS */
    
    /*
    Se pide que se escriba una opción por términal (no las incluye el método, deben imprimirse antes). Si
    la opción es válida y existe dentro del array de opciones dado como parámetro, entonces se devuelve esa opción.
    
    Si no es válida, se indica por el términal que se vuelva a introducir una opción hasta que esta sea correcta.
    
    El mensaje que se le muestra al usuario puede modificarse cambiando el valor del atributo 'optionNotFound'.
    Recuerda que hacerlo modificará el mensaje para todas las validaciones del mismo tipo para una instancia
    del objeto Validate. Si deseas modificar el mensaje para validaciones concretas, puedes usar la variación del método
    con un parámetro adicional como mensaje customizado. También puedes crear una nueva instancia si así lo deaseas.
    */
    public String validateOptions(Scanner sc, String[] options) {
        String input = sc.nextLine();
        for (int i=0; i<options.length; i++) {
            if (input.equals(options[i])) {
                return input;
            }
        }
        
        return optionNotFound;
    } 
    
    
    /* VARIACIONES CON MENSAJES INDIVIDUALES */
    
    /*
    Variaciones de los métodos anteriores, pero con la opción de indicar el mensaje
    personalizado mediante un parámetro y no modificando el atributo.
    
    Util cuando solo se desea usar un mensaje en concreto para una única validación.
    */
    
    public int validateInt(String customMessage) {
        while (!sc.hasNextInt()) {
            System.out.println(customMessage);
            sc.nextLine();
        }
        
        return sc.nextInt();
    }
    
    public long validateLong(String customMessage) {
        while(!sc.hasNextLong()) {
            System.out.println(customMessage);
            sc.nextLine();
        }
        
        return sc.nextLong();
    }
    
    public float validateFloat(String customMessage) {
        while (!sc.hasNextFloat()) {
            System.out.println(customMessage);
            sc.nextLine();
        }
        
        return sc.nextFloat();
    }
    
    public double validateDouble(String customMessage) {
        while (!sc.hasNextDouble()) {
            System.out.println(customMessage);
            sc.nextLine();
        }
        
        return sc.nextDouble();
    }
    
    public String validateOptions(Scanner sc, String[] options, String customMessage) {
        String input = sc.nextLine();
        for (int i=0; i<options.length; i++) {
            if (input.equals(options[i])) {
                return input;
            }
        }
        
        return customMessage;
    }
    
    
    /* MÉTODOS EXPERIMENTALES/SIN TERMINAR O QUE NO FUNCIONAN */
    
    String decimalFoundMessage = "No se aceptan números con decimales, intenta volver a introducir el número: ";
    String largeFoundMessage = "El número dado es demasiado largo, intenta escribir otro más corto: ";
    String elseMessage = "No se ha introducido un número, vuelve a escribirlo.";
    
    /*
    Se pide por consola que se escriba un número. Si el valor es un entero, 
    es devuelto. En caso contrario, se muestra un mensaje indicando porque 
    el número no es correcto.
    
    El método seguirá ejecutandose hasta que el valor introducido sea un número entero.
    */
    public int extendedValidateInt() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
               
            } else if (sc.hasNextLong()) {
                System.out.println(largeFoundMessage);
                
            } else if (sc.hasNextDouble()){
                
                String num = sc.next();
                System.out.println(num);
                
                if (num.indexOf(",") == -1) {
                    System.out.println("Long pero no doubleh");
                    
                } else {
                    /*
                    int precision = num.length() - num.indexOf(",") - 1;
                    System.out.println("Precision: "+precision);
                
                    if (precision > 7) {
                        System.out.println("Es double");
                    } else {
                        System.out.println("Es float");
                    }
                    */
                    
                    /*
                    1. Contar inicio string hasta el punto num de digitos
                    2. If negativo, cuento 1 mas pa lante
                    3. Resto indexOf(.) - 0 (si positivo) o -1 si es negativo.
                    4. Si hay 38 digitos, es float, sino double
                    5. Chequear si todo lo de antes de la coma es double o no.
                    6. Si es double, no chequear nada mas. Si es float, chequear
                    que la otra parte no sea double.
                    */
                }
            } else {
                System.out.println(elseMessage);
            }
            sc.nextLine();
        }
    }
    
    /*
    Se pide por consola que se escriba un número. Si el valor introducido puede
    ser convertido a 'float', es devuelto. En caso contrario, se muestra un mensaje 
    indicando porque el número no es correcto.
    
    El método seguirá ejecutandose hasta que el valor introducido sea un número
    que pueda ser convertido a 'float'.
    */
    
    public float extendedValidateFloat() {
        while (true) {
            if (sc.hasNextFloat()) {
                return sc.nextFloat();
                
            } else if (sc.hasNextDouble()) {
                System.out.println(largeFoundMessage);
            } else {
                System.out.println(elseMessage);
            }
            sc.nextLine();
        }
    }
    
    /*
    Se pide por consola que se escriba un número. Si el valor introducido puede
    ser convertido a 'double', es devuelto. En caso contrario, se muestra un mensaje 
    indicando porque el número no es correcto.
    
    El método seguirá ejecutandose hasta que el valor introducido sea un número
    que pueda ser convertido a 'double'.
    
    Nota: al contener 'double' 32 bits extras de información (64 en total), los números
    de tipo 'float' (que solo tienen 32) pueden ser convertidos a 'double' sin perder 
    información. Si se hace al reves, se pueden perder datos.
    */
    
    public double extendedValidateDouble() {
        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println(elseMessage);
            }
            sc.nextLine();
        }
    }
    
    
    
    /*
    Se pide por consola que se escriba un número. Si el valor introducido puede
    ser convertido a 'long', es devuelto. En caso contrario, se muestra un mensaje 
    indicando porque el número no es correcto.
    
    El método seguirá ejecutandose hasta que el valor introducido sea un número
    que pueda ser convertido a 'long'.
    
    Nota: al contener 'long' 32 bits extras de información (64 en total), los números
    de tipo 'int' (que solo tienen 32) pueden ser convertidos a 'long' sin perder 
    información. Si se hace al reves, se pueden perder datos.
    */
    
    public long extendedValidateLong() {
        while (true) {
            if (sc.hasNextLong()) {
                return sc.nextLong();
                
            } else if (sc.hasNextDouble()) {
                
                System.out.println(decimalFoundMessage);
            } else {
                System.out.println(elseMessage);
            }
            sc.nextLine();
        }
    }
}
