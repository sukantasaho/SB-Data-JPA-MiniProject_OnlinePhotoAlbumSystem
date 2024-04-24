package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.services.IPhotoServiceManagement;

@SpringBootApplication
public class SbDataJpaMiniProjectOnlinePhotoAlbumSystemApplication 
{

	public static void main(String[] args) 
	{
		  ApplicationContext ctx = SpringApplication.run(SbDataJpaMiniProjectOnlinePhotoAlbumSystemApplication.class, args);
		    IPhotoServiceManagement service = ctx.getBean("pService", IPhotoServiceManagement.class);
		    service.savePhoto();
		    
		    ((ConfigurableApplicationContext) ctx).close();
	}

}
