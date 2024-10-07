package repository.impl;

import repository.Download;

public class DownloadImpl implements Download {

    @Override
    public void downloadFile(String file) {
        System.out.println("Downloading " + file + "....");
    }

    @Override
    public void showFile(String file) {
        System.out.println("Showing the file " + file + "....");
    }

    @Override
    public void close() {
        System.out.println("Closing the connection....");
    }
}
