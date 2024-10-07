package repository.impl;

import repository.Download;

public class ProxyDownloadImpl implements Download {
    private Boolean canDownload;
    private DownloadImpl download;

    public ProxyDownloadImpl(Boolean canDownload) {
        this.canDownload = canDownload;
    }

    @Override
    public void downloadFile(String file) {
        if (canDownload && file != null) {
            if (download == null) {
                System.out.println("Generando nueva instancia....");
                download = new DownloadImpl();
            }
            download.downloadFile(file);
        } else {
            System.out.println("No tiene permitido descargar imagenes");
        }
    }

    @Override
    public void showFile(String file) {
        if (canDownload && file != null){
            if (download == null) {
                download = new DownloadImpl();
            }
            download.showFile(file);
        } else {
            System.out.println("No tiene permitido cargar imagenes");
        }
    }

    @Override
    public void close() {
        if (download == null) {
            System.out.println("La conexión se encuentra cerrada");
        } else {
            download.close();
            download = null;
        }
    }
}
