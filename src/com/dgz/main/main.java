/**
 * 
 */
package com.dgz.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author DamonTung
 * @date 2015年10月12日
 * @description 
 */
public class main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//testProcess();
		try {
			getSystemPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void getSystemPath() throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.setProperty("one", "the first value...");
		FileOutputStream fileOutputStream = new FileOutputStream("config.properties");
		properties.store(fileOutputStream, "----此处是文件头，可加注释----");
		System.getProperties().list(System.out);
	}
	public static void testProcess(){
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("D:\\Program Files (x86)\\Notepad++\\notepad++.exe");
			Thread.sleep(5000);
			p.destroy();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
