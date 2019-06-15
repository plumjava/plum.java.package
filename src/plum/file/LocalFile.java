/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plum.file;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Gestion de fichier au niveau du projet. Répertoire imposé : _localfile
 *
 *
 * @author thbogusz
 */
public class LocalFile {

    public static  String localDir = "_localfile";
    
    private BufferedReader reader = null;
    private OutputStream out = null;

    private String dataWrite = "";
    private Scanner scanner = null;

    /**
     * filename : nom.extension (UNIQUEMENT) Création du fichier si inexistant
     * Ecriture APPEND Fatal error si filename incorrect
     *
     *
     * @author thbogusz
     */
    private LocalFile(BufferedReader reader, OutputStream out) {
        this.reader = reader;
        this.out = out;
        
    }

    public static LocalFile open(String filename) {
        
        Path pathFile = Paths.get(localDir, filename);

        //mkdir pathFile.toString()
        Path dir = Paths.get(localDir);
        File f = dir.toFile();
        f.mkdir();

        OutputStream out = null;
        BufferedReader reader = null;

        try {
            out = new BufferedOutputStream(
                    Files.newOutputStream(pathFile, CREATE, APPEND));
        } catch (IOException x) {
            System.err.println(x);
        }

        //Charset charset;
        //charset = Charset.forName("US-ASCII");
        try {
            reader = Files.newBufferedReader(pathFile);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return new LocalFile(reader, out);
    }

    public long write() {

        String datan = dataWrite + "\n";

        byte datab[] = datan.getBytes();
        //bw.newLine();
        try {
            out.write(datab, 0, datab.length);
            out.flush();
        } catch (IOException x) {
            System.err.println(x);
        }

        long sizeDataWrite = dataWrite.length();
        dataWrite = "";

        return sizeDataWrite;

    }

    public boolean read() {
        String line = null;

        scanner = null;

        try {
            line = reader.readLine();
            if (line == null) {
                return false;
            }

            scanner = new Scanner(line).useDelimiter(";");
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return true;
    }

    public void put(String datap) {
        dataWrite += datap + ";";
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public long getLong() {
        return scanner.nextLong();
    }

    public float getFloat() {
        return scanner.nextFloat();
    }

    public Double getDouble() {
        String next = scanner.next();
       // next = next.replace(".", ",");
        
        return Double.parseDouble(next);
    }

    public String get() {
        return scanner.next();
    }

    public String getLine() {
        return scanner.nextLine();
    }

}
