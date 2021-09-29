package org.iesfm.ficheros1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    private static Logger log = LoggerFactory.getLogger(Ejercicio4.class);

    private static void createDir(String path) {
        File folder = new File(path);
        folder.mkdir();
    }

    private static void createFile(String path) throws IOException {
        File folder = new File(path);
        folder.createNewFile();
    }

    public static void main(String[] args) {

        try {
            createDir("/tmp/d1");
            createDir("/tmp/d2");
            createFile("/tmp/d1/f11.txt");
            createFile("/tmp/d2/f21.txt");
            log.info("Estructura de carpetas creada correctamente");
        } catch (IOException e) {
            log.error("Error creando archivos", e);
        }
    }
}
