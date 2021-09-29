package org.iesfm.ficheros2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio2 {
    public static Logger log = LoggerFactory.getLogger(
            Ejercicio2.class
    );

    public static void main(String[] args) {
        File folder = new File("/home/mikelsanvi/files");
        FileUtils fileUtils = new FileUtils();
        for(File file: folder.listFiles()) {
            log.info(fileUtils.readFile(file));
        }
    }
}
