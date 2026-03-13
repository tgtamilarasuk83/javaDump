package Handson7;

import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Path;

public class io {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		Path p2 = fs.getPath("C:\\Program Files (x86)\\Adobe\\Adobe Sync\\CoreSync\\en_us");
		Path p3 = fs.getPath("C:\\Program Files (x86)\\Adobe\\Adobe Sync\\CoreSync\\en_us");


		System.out.println("isAbsolute  "+p2.isAbsolute());
		System.out.println("Compare  "+p3.compareTo(p2));
		System.out.println("Compare  "+p3.equals(p2));
	
		System.out.println("getRoot  "+p2.getRoot());
		System.out.println("hashCode  "+p2.hashCode());
		System.out.println("getParent  "+p2.getParent());
		System.out.println("normalize  "+p2.normalize());
		System.out.println("getFileName  "+p2.getFileName());
		System.out.println("getNameCount  "+p2.getNameCount());
		System.out.println("startsWith   "+p2.startsWith("tamil"));
		System.out.println("getFileSystem"+p2.getFileSystem());
	}
}