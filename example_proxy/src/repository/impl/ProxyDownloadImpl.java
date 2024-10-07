package repository.impl;

import repository.Download;

public class ProxyDownloadImpl implements Download {
    private Boolean permission;
    private DownloadImpl download;

    public ProxyDownloadImpl(Boolean canDownload) {
        this.permission = canDownload;
    }

    @Override
    public void downloadFile(String file) {
        if (permission && file != null) { // Verify that permission is true and that the file is not empty.
            if (download == null) { // Checks if a Download instance exists
                System.out.println("Generating new instance....");
                download = new DownloadImpl(); // Generates an instance of the Download
            }
            download.downloadFile(file); // Sends the file to the DownloadImpl
        } else {
            System.out.println("You are not allowed to download images");
        }
    }

    @Override
    public void showFile(String file) {
        if (permission && file != null){
            if (download == null) {
                download = new DownloadImpl();
            }
            download.showFile(file);
        } else {
            System.out.println("You are not allowed to load images");
        }
    }

    @Override
    public void close() {
        if (download == null) {
            System.out.println("The connection is already closed");
        } else {
            download.close();
            download = null;
        }
    }
}
