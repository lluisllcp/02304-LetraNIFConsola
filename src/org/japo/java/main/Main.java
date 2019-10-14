/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */


public class Main {

    // Instanciar Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        char letra;
        char letraMays;

        try {
            //Entrada del dato
            System.out.print("Introduzca su letra del NIF: ");
            letra = SCN.nextLine().charAt(0);
            /*letraMays transforma el char a Upper Case, hemos modificado también
            el siguiente System.out cambiando la variable "letra" por "letraMays"
            
            En realidad esta siguiente línea es poco útil ya que únicamente
            cambiando de %c a %C ya saca por consola la letra en mayúsculas.*/
            letraMays = Character.toUpperCase(letra);
            System.out.printf("Letra DNI................. : %c%n", letraMays);

            //Mostramos línea original modificada.
            System.out.println("//Mostramos línea original modificada.");
            System.out.printf("Letra DNI................. : %C%n", letra);
        } catch (Exception e) {
            System.out.println("OOOOOOOPS!");

        }

    }
}