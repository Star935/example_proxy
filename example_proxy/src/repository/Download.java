package repository;

public interface Download {
    void downloadFile(String file);
    void showFile(String file);
    void close();
}
