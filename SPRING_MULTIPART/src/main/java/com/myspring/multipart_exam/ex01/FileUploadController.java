package com.myspring.multipart_exam.ex01;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;


// 파일 업로드 컨트롤러를 구현합니다. 파일과 매개변수를 같이 전송하므로 Map을 사용합니다.
// 매개변수의 name/value를 다시 map의 key/value로 저장합니다.
// 파일 이름을 ArrayList에 저장한 후 다시 map에 key/value로 저장합니다. 
@Controller
public class FileUploadController  {
	private static final String CURR_IMAGE_REPO_PATH = "c:\\spring\\image_repo";
	@RequestMapping(value="/form")
	public String form() {
		// 업로드창인 uploadForm.jsp를 반환합니다.
		return "uploadForm"; 
	  }
	
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	public ModelAndView upload(MultipartHttpServletRequest multipartRequest,HttpServletResponse response)
	  throws Exception{
		multipartRequest.setCharacterEncoding("utf-8");
		
		// 매개변수 정보와 파일 정보를 저장할 Map을 생성합니다.
		Map map = new HashMap();
		Enumeration enu=multipartRequest.getParameterNames();
		
		// 전송된 매개변수 값을 key/value로 map에 저장합니다.
		while(enu.hasMoreElements()){
			String name=(String)enu.nextElement();
			String value=multipartRequest.getParameter(name);
			//System.out.println(name+", "+value);
			map.put(name,value);
		}
		
		// 파일을 업로드한 후 반환된 파일 이름이 저장된 fileList를
		// 다시 map에 저장합니다.
		List fileList= fileProcess(multipartRequest);
		map.put("fileList", fileList);
		ModelAndView mav = new ModelAndView();

		// map을 결과창으로 포워딩합니다.
		mav.addObject("map", map);
		mav.setViewName("result");
		return mav;
	}
	
	private List<String> fileProcess(MultipartHttpServletRequest multipartRequest) throws Exception{
		List<String> fileList= new ArrayList<String>();
		
		// 첨부된 파일 이름을 가져옵니다.
		Iterator<String> fileNames = multipartRequest.getFileNames();
		while(fileNames.hasNext()){
			String fileName = fileNames.next();
			
			// 파일 이름에 대한 MultipartFile 객체를 가져옵니다.
			MultipartFile mFile = multipartRequest.getFile(fileName);
			
			// 실제 파일 이름을 가져옵니다.
			String originalFileName = mFile.getOriginalFilename();
			
			// 파일 이름을 하나씩 fileList에 저장합니다.
			fileList.add(originalFileName);
			File file = new File(CURR_IMAGE_REPO_PATH +"\\"+ fileName);
			// 첨부된 파일이 있는지 체크합니다.
			if(mFile.getSize()!=0){ //File Null Check
				// 경로에 파일이 없으면 그 경로에 해당하는
				// 디렉터리를 만든 후 파일을 생성합니다.
				if(! file.exists()){ //경로상에 파일이 존재하지 않을 경우

					        //경로에 해당하는 디렉토리들을 생성
					if(file.getParentFile().mkdirs()){						
						file.createNewFile(); //이후 파일 생성
					}
				}
				
				// 임시로 저장된 multipartFile을 실제 파일로 전송합니다.
				mFile.transferTo(new File(CURR_IMAGE_REPO_PATH +"\\"+ originalFileName)); 
			}
		}
		
		// 첨부한 파일 이름이 저장된 fileList를 반환합니다.
		return fileList;
	}
}
