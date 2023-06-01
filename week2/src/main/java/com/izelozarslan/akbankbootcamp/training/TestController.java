package com.izelozarslan.akbankbootcamp.training;

import org.springframework.web.bind.annotation.*;

//@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/test1")
    public String get1(){
        String str = "get1";
        System.out.println(str);
        return str;
    }

    @GetMapping("/test01")
    public String get01(){
        String str = "get01";
        System.out.println(str);
        return str;
    }

    @PostMapping ("/test01")
    public String post01(){
        String str = "post01";
        System.out.println(str);
        return str;
    }

    @PutMapping("/test01")
    public String put01(){
        String str = "put01";
        System.out.println(str);
        return str;
    }

    @PatchMapping("/test01")
    public String patch01(){
        String str = "patch01";
        System.out.println(str);
        return str;
    }

    @DeleteMapping("/test01")
    public String delete01(){
        String str = "delete01";
        System.out.println(str);
        return str;
    }



   /* @GetMapping("/test")
    public void test() {
        System.out.println("test");
    }*/
}
