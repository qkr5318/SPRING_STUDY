package com.myspring.multipart_exam.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


// 먼저 파일 다운로드 컨트롤러인 FileDownloadController 클래스를 작성합니다.
// 여기서는 버퍼 기능을 이용해 빠르게 브라우저로 이미지 파일을 전송합니다.
@Controller
public class FileDownloadController {
	// 파일 저장 위치를 지정합니다.
	private static String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";

	// @RequestParam 활용해서 다운로드할 이미지 파일 이름을 전달합니다.
	@RequestMapping("/download")
	public void download(@RequestParam("imageFileName") String imageFileName,
			                 HttpServletResponse response)throws Exception {
		System.out.println("==>download실행");
		OutputStream out = response.getOutputStream();
		String downFile = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;

		// 다운로드할 파일 객체를 생성합니다.
		File file = new File(downFile);

		response.setHeader("Cache-Control", "no-cache");

		// 헤더에 파일 이름을 설정합니다.
		response.addHeader("Content-disposition", "attachment; fileName=" + imageFileName);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[1024 * 8]; // 8kbyte 버퍼 생성
		
		// 버퍼를 이용해 한 번에 8kbyte씩 브라우저로 전송합니다.
		while (true) {
			int count = in.read(buffer); // 버퍼에 읽어들인 문자개수
			if (count == -1) // 버퍼의 마지막에 도달했는지 체크
				break;
			out.write(buffer, 0, count);
		}
		in.close();
		out.close();
	}

}
