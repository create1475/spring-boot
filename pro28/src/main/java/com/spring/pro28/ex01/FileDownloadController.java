package com.spring.pro28.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnails;

//@Controller
public class FileDownloadController {
	private static String CURR_INAGE_REPO_PATH="c:\\spring\\image_repo";
	
//	@RequestMapping("/download")
	public void download(@RequestParam("imageFileName") String imageFileName, HttpServletResponse response) throws Exception{
		OutputStream out = response.getOutputStream();
		String downfile = CURR_INAGE_REPO_PATH + "\\" + imageFileName;
		File file = new File(downfile);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("content-disposition", "attachment; fileName=" + imageFileName);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[1024 * 8];
		while(true) {
			 int count = in.read(buffer);
			 if(count == -1)
				 break;
			 out.write(buffer,0,count);
		}
		in.close();
		out.close();
	}
	
		
		
	}


