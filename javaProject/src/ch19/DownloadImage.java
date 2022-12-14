package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website="https://image.tving.com/upload/cms/caip/CAIP0900/P001651316.jpg/dims/resize/F_webp,480";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);
		//byte 배열
		byte[] buffer=new byte[2048]; //버퍼용 바이트 배열[2mb]
		//파일을 저장 
		//try~with문 (Java 1.7부터 도입됨)
		//finally가 없어도 리소스를 자동으로 종료시킨다
		//try(리소스 선언부) {
		//}catch(Exception e){
		//}
		try(InputStream in=url.openStream(); 
				OutputStream out=new FileOutputStream("C:\\test\\test.jpg")) {
			int length=0; //length 읽은 바이트수 리턴
			//더이상 읽을 내용이 없으면 -1로 처리한다
			while((length=in.read(buffer)) != -1) { //읽을 내용이 있으면
				System.out.println(length+"바이트 읽음.");
				out.write(buffer,0,length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
