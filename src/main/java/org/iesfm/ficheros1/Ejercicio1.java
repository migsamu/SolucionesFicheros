package org.iesfm.ficheros1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio1 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio1.class);

    public static void main(String[] args) {
        File homeFolder = new File("/home/mikelsanvi");

        File[] files = homeFolder.listFiles();
        for(File file:files) {
            log.info(file.getName());
        }
    }
}
