package Arrays;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DownloadImage {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Enter the URLs of the images
        String[] imageUrls = new String[10];
        System.out.println("Enter 10 image URLs:");
        for(int i = 0; i < imageUrls.length; i++) {
            imageUrls[i] = input.nextLine();
        }
        
        // Enter the directory to save the images in
        System.out.print("Enter the directory to save the images in: ");
        String directory = input.nextLine();
        File dir = new File(directory);
        if(!dir.exists()) {
            dir.mkdirs();
        }
        
        // Download the images
        for(int i = 0; i < imageUrls.length; i++) {
            String imageUrl = imageUrls[i];
            String fileName = imageUrl.substring(imageUrl.lastIndexOf('/') + 1);
            String fileType = fileName.substring(fileName.lastIndexOf('.') + 1);
            if(fileType.equalsIgnoreCase("jpg") || fileType.equalsIgnoreCase("jpeg") || fileType.equalsIgnoreCase("png") || fileType.equalsIgnoreCase("gif")) {
                try {
                    URL url = new URL(imageUrl);
                    URLConnection connection = url.openConnection();
                    connection.connect();
                    InputStream in = connection.getInputStream();
                    FileOutputStream out = new FileOutputStream(directory + "/" + fileName);
                    
                    byte[] buffer = new byte[1024];
                    int bytesRead = 0;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                    
                    in.close();
                    out.close();
                    System.out.println("Image downloaded successfully: " + fileName);
                } catch (Exception e) {
                    System.out.println("Error downloading image: " + e.getMessage());
                }
            } else {
                System.out.println("Skipping non-image file: " + fileName);
            }
        }
    }
}

