package com.spring.pro27.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnails;

@Controller
public class FileDownloadController {
	private static String ARTICLE_IMAGE_REPO="C:\\board\\article_image";
	
	@RequestMapping("/download.do")
	protected void download(@RequestParam("imageFileName") String imageFileName, @RequestParam("articleNO") String articleNO, HttpServletResponse response) throws Exception{
		OutputStream out = response.getOutputStream();
		String filePath = ARTICLE_IMAGE_REPO + "\\" + articleNO + "\\"+imageFileName;
		File file = new File(downfile);
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName = imageFileName.substring(0,lastIndex);
		File thumbnail = new File(ARTICLE_IMAGE_REPO + "\\" + "thumbnail" + "\\" + fileName + ".png");
		if(file.exists()) {
			thumbnail.getParentFile().mkdir();
			Thumbnails.of(file).size(50,50).outputFormat("png").toFile(thumbnail);
			
		}
		FileInputStream in = new FileInputStream(thumbnail);
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

