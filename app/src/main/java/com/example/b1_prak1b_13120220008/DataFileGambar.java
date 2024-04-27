package com.example.b1_prak1b_13120220008;


import java.io.File;

public class DataFileGambar {
    private File file;
    private String pathfile;


    public DataFileGambar (String pathFile, File file) {
        this.pathfile = pathFile;
        this.file = file;
    }
    public String getPathfile() {
        return pathfile;
    }

    public void setPathfile(String pathfile) {
        this.pathfile = pathfile;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}