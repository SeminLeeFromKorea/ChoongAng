package com.adamsoft.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null 이 리턴
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤테일", "한국 최초의 자체 3D 엔진 MMORPG");
		

		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git 에 연결되신 분은 workspace 가 아니고
			//c 드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있습니다.
			//properties.store(new FileOutputStream("./myproject.properties"),"텍스트로 저장");
			properties.storeToXML(new FileOutputStream(
					"./myproject.xml"),"xml로 저장");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
