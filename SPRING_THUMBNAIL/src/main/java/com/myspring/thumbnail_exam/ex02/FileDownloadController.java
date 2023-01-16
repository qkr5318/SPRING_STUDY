package com.myspring.thumbnail_exam.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.coobird.thumbnailator.Thumbnails;

// 원본 이미지에 대해 썸네일 이미지 파일을 생성한 후 다운로드할 수 있도록 합니다.
// Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail)은 가로와 세로 크기가 50픽셀인 png 썸네일 이미지를 생성한 후 파일로 저장하는 구문입니다.

@Controller
public class FileDownloadController {
	private static String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo2";

	// 원본 이미지에 대한 썸네일 이미지 파일 생성 후 다운로드 : C:\spring\image_repo\thumbnail 폴더에 썸네일 이미지 생성
	// 실습 후에 thumbnail 폴더에 있는 썸네일 이미지는 삭제하고 아래에 있는 "썸네일 이미지 바로 출력하기" 실습하기 바람.

	@RequestMapping("/download")
	protected void download(@RequestParam("imageFileName") String imageFileName,
			                 HttpServletResponse response) throws Exception {
		System.out.println("==> 다운로드");
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
		File image = new File(filePath);
		
//		// 확장자를 제외한 원본 이미지 파일의 이름을 가져옵니다.
		int lastIndex = imageFileName.lastIndexOf(".");
		String fileName = imageFileName.substring(0,lastIndex);
		
//		// 원본 이미지 파일 이름과 같은 이름의 썸네일 파일에 대한
//		// File 객체를 생성합니다.
		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
		
//		// 원본 이미지 파일을 가로와 세로 크기가 50픽셀인 png 형식의 썸네일 이미지 파일로 생성합니다.
		if (image.exists()) { 
			thumbnail.getParentFile().mkdirs();			
		    Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail);
		}

//		// 생성된 썸네일 파일을 브라우저로 전송합니다.
		FileInputStream in = new FileInputStream(thumbnail);
		byte[] buffer = new byte[1024 * 8];
		while (true) {
			// 버퍼에 읽어들인 문자개수
			int count = in.read(buffer); 
			
			// 버퍼의 마지막에 도달했는지 체크
			if (count == -1) 
				break;
			out.write(buffer, 0, count);
		}
		in.close();
		out.close();
	}
	

// 쇼핑몰의 상품 목록 이미지 같은 경우, 썸네일 이미지 파일을 따로 생성할
// 필요 없이 썸네일 이미지를 바로 다운로드하면 훨씬 빨리 표시할 수 있습니다.
	
// 썸네일 이미지 바로 출력하기 : 위와 달리 앞서와는 C:\spring\image_repo\thumbnail 폴더에 썸네일 이미지는 생성되지 않음
	
//	@RequestMapping("/download")
//	protected void download(@RequestParam("imageFileName") String imageFileName,
//			                 HttpServletResponse response) throws Exception {
//		OutputStream out = response.getOutputStream();
//		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
//		File image = new File(filePath);
//		int lastIndex = imageFileName.lastIndexOf(".");
//		String fileName = imageFileName.substring(0,lastIndex);
//		File thumbnail = new File(CURR_IMAGE_REPO_PATH+"\\"+"thumbnail"+"\\"+fileName+".png");
//		if (image.exists()) { 
//
//	// 원본 이미지에 대한 썸네일 이미지를 생성한 후
//	// OutputStream 객체에 할당합니다.
//	Thumbnails.of(image).size(50,50).outputFormat("png").toOutputStream(out);
//		}else {
//			return;
//		}
//	// 썸네일 이미지를 OutputStream 객체를 이용해 브라우저로 전송합니다.
//		byte[] buffer = new byte[1024 * 8];
//		out.write(buffer);
//		out.close();
//	}

}
