package org.iesfm.ficheros2;

import java.io.File;

public class Ejercicio4 {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();

        File quijoteFile = fileUtils.classpathFile("/el_quijote.txt");

        String quijoteStr = fileUtils.readFile(quijoteFile);

        fileUtils.writeToFile(new File("/tmp/el_quijote.txt"), quijoteStr);
    }
}
