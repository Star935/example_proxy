package repository.impl;

import repository.Download;

public class DownloadImpl implements Download {

    @Override
    public void downloadFile(String file) {
        System.out.println("Descargando " + file + "....");
    }

    @Override
    public void showFile(String file) {
        System.out.println("Mostrando archivo " + file + "....");
    }

    @Override
    public void close() {
        System.out.println("Cerrando la conexión....");
    }
}
