import repository.Download;
import repository.impl.ProxyDownloadImpl;

public class Main {
    public static void main(String[] args) {
        Download canDownloadTrue = new ProxyDownloadImpl(true);
        System.out.println("--------------------------------");
        canDownloadTrue.downloadFile("Imagen_de_perrito_bonito.png");
        canDownloadTrue.showFile("Imagen_de_gatitos.png");
        canDownloadTrue.close();

        System.out.println("--------------------------------");
        canDownloadTrue.downloadFile("Imagen_de_patos.png");

        System.out.println("--------------------------------");
        Download canDownloadFalse = new ProxyDownloadImpl(false);
        canDownloadFalse.downloadFile("imagen_de_perrito_bonito2.png");
        canDownloadFalse.showFile("imagen_de_gatitos.png");
        canDownloadFalse.close();
        System.out.println("--------------------------------");

    }
}