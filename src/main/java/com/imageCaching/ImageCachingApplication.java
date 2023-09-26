package com.imageCaching;

import com.imageCaching.modal.ImageFileProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;


@SpringBootApplication
public class ImageCachingApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(ImageCachingApplication.class, args);
		System.out.println("hello");
		Path p = Paths.get("C:/Users/This PC/Desktop/Pune_Mumbai");
		System.out.print("out" + p);

		ImageFileProcessor imcache = new ImageFileProcessor();
		System.out.println("brfore the loop");
		for (Object s: imcache.getImageList()){
			System.out.println("inside the loop");
			//System.out.println(s); // 12 mins to read the and print the data
		}


	}

//	@Bean
//	CommandLineRunner commandLineRunner() {
//		return args -> {
//			Image image = new Image();
//			Path p = Paths.get("C:/Users/This PC/Desktop/Pune_Mumbai");
//			//image.setPath(p);
//			System.out.print("print path");
//			System.out.println("image path" + image.getPath());
//			File file = new Image().dir;
//			System.out.println("after file");
//			System.out.println(file);
////			String[] Extensions = new String[]{"gif", "png", "jpg"};
//			FilenameFilter fileFilter = new Image().Image_Filter;
//			System.out.println(fileFilter);
//			System.out.println("inside isDir");
//			if (file.isDirectory()) {
//				for (File f : file.listFiles(fileFilter)) {
//					BufferedImage Bimage = null;
//					try {
//						System.out.println("inside try");
//						Bimage = ImageIO.read(f);
//						//System.out.println("print path and name");
//						//System.out.println(f.getAbsolutePath());
//						//System.out.println("path" + f.getPath());
//						//System.out.println("name" + f.getName());
//					} catch (IOException e) {
//						System.out.print(e);
//					}
//				}
//			}
//		};
//	}
}



