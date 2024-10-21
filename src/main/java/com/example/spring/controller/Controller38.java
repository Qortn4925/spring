package com.example.spring.controller;
import com.example.spring.dto.c38.Customer;
import com.example.spring.dto.c38.Employee;
import com.example.spring.mapper.Mapper08;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("main38")
@RequiredArgsConstructor
public class Controller38 {
    private final Mapper08 mapper08;

//     쿼리에 직접 입력하기 , ( 개발자 본인이 수정하는 경우)
    @GetMapping("sub1")
    public void method1() {
        mapper08.update1();
    }
//     sub2 요청 들어오면  > 만들어둔 mapper08 인스턴스의 >  update 메소드를 사용할거임
//     update2 메소드는 파라미터로 값 입력 받아서 전달
    @GetMapping("sub2")
    public void method2() {
        mapper08.update2("흥민", "득점왕", "토트넘",
                "런던", "3333", "영국", 2);
    }

//    파라미터에 각각의 값이 아닌 , dto 클래스 만들어서  그걸 통해 전달 받음
    @GetMapping("sub3")
    public void method3() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("카카");
        customer.setContactName("아이콘");
        customer.setAddress("리우");
        customer.setCity("상파울로");
        customer.setCountry("브라질");
        customer.setPostalCode("5555");
        mapper08.update3(customer);
    }

//     리퀘스트 파라미터로
    // /main38/sub4?name=지성&contactName=코치&address=신촌&city=서울&country=한국&postalCode=777&id=2
    @GetMapping("sub4")
    public void method4(String name, String contactName,
                        String address, String city,
                        String country, String postalCode,
                        Integer id) {
        mapper08.update2(name, contactName, address, city, postalCode, country, id);
    }
    // /main38/sub5?name=정환&contactName=포워드&address=강남&city=인천&country=한국&postalCode=999&id=2
    @GetMapping("sub5")
    public void method5(Customer customer) {
        mapper08.update3(customer);
    }

    @GetMapping("sub7")
    public void method7(Integer id, Model model) {
        Customer customer = mapper08.select1(id);
        model.addAttribute("customer", customer);

    }

//     이러면 작성하지 않은 폼 부분은  공백을 가짐 > 기존걸 가져오기
    @PostMapping("sub8")
    public void method8(Customer customer) {
         mapper08.update3(customer);
    }

    @GetMapping("sub9")
    public void method9(Integer id , Model model) {
        Employee employee = mapper08.select2(id);
        model.addAttribute("employee",employee);

    }

    @PostMapping("sub10")
    public void method10(Employee employee) {
        mapper08.update4(employee);
    }
    
    @GetMapping("sub11")
    public void method11(){
        Customer customer = new Customer();
        customer.setName("한강");
        customer.setContactName("노벨상");
        customer.setPostalCode("5555");
        customer.setCountry("한국");
        customer.setCity("광주");
        customer.setAddress("서울");
        System.out.println("입력전 = " + customer);
        mapper08.insert(customer);
        System.out.println("입력후 = " + customer);
    }

    @GetMapping("sub12")
    public void method12(){
        Employee employee =  new Employee();
        employee.setBirthDate("11111111");
        employee.setPhoto("사지");
        employee.setFirstName("cjt");
        System.out.println("employee = " + employee);
        mapper08.insert2(employee);
        System.out.println("입력후 " + employee);
    }
}