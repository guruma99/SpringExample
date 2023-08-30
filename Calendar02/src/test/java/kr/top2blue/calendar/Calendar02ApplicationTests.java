package kr.top2blue.calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Calendar02ApplicationTests {

	// @Test
	void contextLoads() {
		Document doc = null;
		try {
			// 사이트의 접속하여 문서의 내용을 가져온다.
			doc = Jsoup.connect("https://www.naver.com/").get();
			// 그 중에서 title태그안의 내용을 가져온다,
			System.out.println(doc.title());
			assertEquals(doc.title(), "NAVER"); // 같은지 테스트 한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Test
	void getImges() {
		// 사이트에 접속하여 내용을가져온다.
		Document doc = null;
		try {
			// 사이트의 접속하여 문서의 내용을 가져온다.
			doc = Jsoup.connect(
					"https://www.google.com/search?q=%EC%9E%A5%EB%AF%B8&tbm=isch&ved=2ahUKEwiO4quw0ICBAxXNs1YBHb06D3EQ2-cCegQIABAA&oq=%EC%9E%A5%EB%AF%B8&gs_lcp=CgNpbWcQAzIICAAQgAQQsQMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BwgAEBgQgAQ6CwgAEIAEELEDEIMBOgQIABADUJEHWPwJYNMLaABwAHgAgAFxiAH0BJIBAzAuNpgBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=6j3tZI7FPM3n2roPvfW8iAc&bih=941&biw=1920")
					.get();
			// 모든 이미지 태그를 가져와서 출력해보자
			Elements images = doc.select("img");
			System.out.println(images.size() + "개의 이미지가 있습니다.");

			for (Element el : images) {
				// System.out.println(el); //이미지태그 자체를 가져온다.
				// 이미지의 이름만 가져오고 싶다?. 속성을 읽어야 한다.
				System.out.println(el.attr("src"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Test
	void getImges2() {
		// 사이트에 접속하여 내용을가져온다.
		Document doc = null;
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("duck02.html");
			// 사이트의 접속하여 문서의 내용을 가져온다.
			doc = Jsoup.connect("http://huggiescomics.blogspot.com/2016/09/2_7.html").get();
			// 모든 이미지 태그를 가져와서 출력해보자
			Elements images = doc.select("div#post-body-4706464316838312012 a");
			System.out.println(images.size() + "개의 이미지가 있습니다.");

			int count = 0; //
			for (Element el : images) {
				// System.out.println(el); //이미지태그 자체를 가져온다.
				// 이미지의 이름만 가져오고 싶다?. 속성을 읽어야 한다.
				System.out.println(el.attr("href"));
				pw.write(el.toString() + "\n"); // 태그자체를 저장하고
			
				//이미지를 파일로 저장해보자
				//첫번째 인자 번호, 두번째 이미지 주소
				ImageUtil.imageSave(++count, el.attr("href"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close(); // 반드시 닫는다.
		}
	}
	
	
	// 음력을 읽어와보자
	   @Test
	   void getNunar() {
	      // 사이트에 접속하여 문서의 내용을 가져온다.
	      Document doc = null;
	      try {
	    	  // 이렇게만 하면 이번달 달력만 가져온다.
	    	  // 원하는 년/월의 달력을 가져와야 한다.
	         doc = Jsoup.connect("https://astro.kasi.re.kr/life/pageView/5").get();
	         Elements elements = doc.select("table tbody tr");
	         for(Element el : elements) {
	            System.out.println(el);
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	   }
	
}