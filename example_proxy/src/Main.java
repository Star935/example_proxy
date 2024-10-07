import repository.Download;
import repository.impl.ProxyDownloadImpl;

import java.util.Scanner;

public class Main {
    private static Download download = new ProxyDownloadImpl(true);
    private static Download downloadFalse = new ProxyDownloadImpl(false);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (option) {
                case 1:
                    downloadFile();
                    break;
                case 2:
                    filter();
                    break;
                case 3:
                    closingConnection();
                    break;
                case 4:
                    System.out.println("¡Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }

    private static void showMenu() { // Method that contains the options menu
        System.out.println("\n--------------- Menu ---------------");
        System.out.println("1. Download a file");
        System.out.println("2. Download a file without permission");
        System.out.println("3. Closing a connection");
        System.out.println("4. Close the program");
        System.out.print("Choose an option: ");
    }

    private static void downloadFile() {
        System.out.println("------------------------------------");
        download.downloadFile("duck_image.png");
        download.showFile("dog_image.png");
        System.out.println("------------------------------------");
    }

    private static void filter() {
        System.out.println("------------------------------------");
        downloadFalse.downloadFile("duck_image.png");
        downloadFalse.showFile("dog_image.png");
        downloadFalse.close();
        System.out.println("------------------------------------");
    }

        private static void closingConnection() {
        System.out.println("------------------------------------");
        download.close();
        System.out.println("------------------------------------");
    }

}