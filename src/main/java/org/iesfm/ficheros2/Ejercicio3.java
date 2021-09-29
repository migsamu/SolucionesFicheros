package org.iesfm.ficheros2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio3 {

    public static Logger log = LoggerFactory.getLogger(
            Ejercicio3.class
    );

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();

        File quijoteFile = fileUtils.classpathFile("/el_quijote.txt");

        String quijoteStr = fileUtils.readFile(quijoteFile);

        log.info(quijoteStr);

    }
}
