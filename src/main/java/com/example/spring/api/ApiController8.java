package com.example.spring.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Map;

@RestController
@RequestMapping("/api/main8")
public class ApiController8 {
    @PostMapping("sub1")
    public void method1(String city, String country  , @RequestParam MultipartFile file) {
        System.out.println(city);
        System.out.println("country = " + country);
        System.out.println("file.getOriginalFilename() = " + file.getOriginalFilename());
        System.out.println("file.getSize() = " + file.getSize());


        // 파일  저장
        try{

            InputStream is = file.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            String outputFilePath="C:/Temp/"+file.getOriginalFilename();
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
try(bis;bos;fos;is){
            byte[] b = new byte[1024];
            int length;
            while ((length=bis.read(b))!=-1){
                bos.write(b,0,length);
            }
            bos.flush();}

        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    @PostMapping("sub2")
    public void method2(@RequestParam String title,@RequestParam MultipartFile attached) {
        System.out.println("title = " + title);
        System.out.println("attached.getOriginalFilename() = " + attached.getOriginalFilename());
//              밑에 과정 삭제
//            attached.transferTo(new File("C:/Temp"+attached.getOriginalFilename()));
        try {
            InputStream is = attached.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            String outputFilePath = "C:/Temp/" +attached.getOriginalFilename();
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try (bis; bos; fos; is;) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, length);
                }
                bos.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("sub3")
    public void method3(@RequestParam String title,@RequestParam(name="files[]") MultipartFile[] attached) throws IOException {
        for(MultipartFile file: attached){
            file.transferTo(new File("C:/Temp"+file.getOriginalFilename()));
        }
    }
    @PostMapping("sub4")
    public void method(String name, @RequestParam(name="files[]") MultipartFile[] attached) throws IOException {
        for(MultipartFile file: attached ){
            file.transferTo(new File("C:/Temp/"+file.getOriginalFilename()));

        }
    }
}
