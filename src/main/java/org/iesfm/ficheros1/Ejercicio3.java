package org.iesfm.ficheros1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio3 {
    public static Logger log = LoggerFactory.getLogger(
            Ejercicio3.class
    );

    public static void showFiles(File folder) {
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                showFiles(file);
            } else if (file.isFile()) {
                log.info(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        File homeFolder = new File(
                "/home/mikel"
        );
        showFiles(homeFolder);
    }
}
