/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        double importeCena;
        int numeroComensales;

        try {
            System.out.print("Importe cantidad cena: ");
            importeCena = SCN.nextDouble();

            System.out.print("Introduce el numero de comensales: ");
            numeroComensales = SCN.nextInt();

            double total = importeCena / numeroComensales;

            System.out.println("Importe cena (€)..: " + importeCena);
            System.out.println("Número comensales.: " + numeroComensales);
            System.out.printf(Locale.ENGLISH, "Pago por Comensal.: %.2f€%n ", total);

        } catch (Exception e) {
            System.out.printf("ERROR: Entrada incorrecta ");
        } finally {
            SCN.nextLine();
        }

    }

}
