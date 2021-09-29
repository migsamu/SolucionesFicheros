package org.iesfm.ficheros1;

import java.io.File;

public class Ejercicio5 {

    private static void moveFile(String path, String destination) {
        File file = new File(path);
        file.renameTo(new File(destination));
    }

    private static void delete(String path) {
        File folder = new File(path);
        folder.delete();
    }

    public static void main(String[] args) {
        moveFile("/tmp/d1/f11.txt","/tmp/d1/f12.txt");
        moveFile("/tmp/d2/f21.txt","/tmp/d1/f21.txt");
        delete("/tmp/d2");
    }
}
