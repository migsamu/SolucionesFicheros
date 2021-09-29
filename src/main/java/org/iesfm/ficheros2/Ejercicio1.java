package org.iesfm.ficheros2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static Logger log = LoggerFactory.getLogger(
            Ejercicio1.class
    );

    public static void main(String[] args) {
        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader("/tmp/hola.txt")
                        )
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                log.info(line);
            }
        } catch (IOException e) {
            log.error("Excepción al leer el archivo", e);
        }
    }
}
