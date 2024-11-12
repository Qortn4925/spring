package com.example.spring.api;

import com.example.spring.dto.a5.Book;
import com.example.spring.dto.a5.Company;
import com.example.spring.dto.a5.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/main5")
public class ApIController5 {

    @ResponseBody
    @GetMapping("sub1")
    public String sub1(){
        System.out.println("ApIController5.sub1");

        return "sub1";   // jsp 사용할때는 web-inf.asdsa/sub1.jsp 찾아서 보여줌
    }

    @ResponseBody
    @GetMapping("sub3")
    public String sub3(){
        System.out.println("ApIController5.sub3");
        return "seoul";
    }

    @ResponseBody
    @GetMapping("sub4")
    public Map<String, Object> sub4(){
        return Map.of("name","kim","age",44);
         // json  >  {name:"kim",age:44}
    }

    @ResponseBody
    @GetMapping("sub5")
    public Map<String, Object> sub5(){
        return Map.of("title","책제목","content","책 내용"
         ,"price",15000,"available",true);
    }

    @ResponseBody
    @GetMapping("sub6")
    public Map<String, Object> sub6(){
        return Map.of("name", "son", "items", List.of("치킨", "돈까스", "떡볶이"),
                "team", Map.of("name", "토트넘", "location", "london"));
    }

    @ResponseBody
    @GetMapping("sub7")
    public Map<String, Object> sub7(){
        return  Map.of("product",Map.of("name","상품명","price",15500,"quantity",3)
        , "company",Map.of("location",List.of("지역1","지역2")));
    }

    @ResponseBody
    @GetMapping("sub8")
    public Book sub8(){
        Book book = new Book();
        book.setPrice(50000);
        book.setAuthor("헬로우");
        book.setContent("껄껄");
        book.setTitle("제목");
        return book;
    }

    @ResponseBody
    @GetMapping("sub9")
    public Player sub9(){
        Player player = new Player();
        Company company = new Company();
        company.setAddress("회사주소");
        company.setName("회사 이름");
        player.setAddress("한국");
        player.setName("흥궈");
        player.setMarried(true);
        player.setItems( List.of("1","2"));
        player.setCompany(company);
        return player;
    }

    @ResponseBody
    @GetMapping("sub10")
    public List<Book> sub10(){
            List<Book> books = new ArrayList<Book>();
            Book book1 = new Book();
            Book book2 = new Book();
            Book book3 = new Book();
            book1.setTitle("제목");
            book1.setContent("내용");
            book1.setPrice(1000);
            book1.setAuthor("저자");
        book2.setTitle("제목1");
        book2.setContent("내용1");
        book2.setPrice(2000);
        book2.setAuthor("저자1");

        book3.setTitle("제목2");
        book3.setContent("내용2");
        book3.setPrice(2000);
        book3.setAuthor("저자2");

            books.add(book1);
            books.add(book2);
            books.add(book3);

        return books;
    }

}
