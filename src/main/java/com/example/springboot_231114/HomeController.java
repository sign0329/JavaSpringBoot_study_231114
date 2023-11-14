package com.example.springboot_231114;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
        // 이 함수의 리턴값을 그대로 브라우저에 출력하라는 의미.
    String showMain() {
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    String showAbout() {
        return "개발자 커뮤니티";
    }

    @GetMapping("/calc")
    @ResponseBody
    String showCalc(int a, int b) {

        return "계산기: %d".formatted(a + b);
    }

    @GetMapping("/calc2")
    @ResponseBody
    String showCalc2(Integer a, Integer b) {

        return "a:" + a + ", b:" + b;
    }

    @GetMapping("/calc3")
    @ResponseBody
    String showCalc3(
            @RequestParam(defaultValue = "0") int a,
            @RequestParam(defaultValue = "0") int b) {
        return "계산기: %d".formatted(a + b);
    }

    @GetMapping("/calc4")
    @ResponseBody
    String showCalc4(
            @RequestParam(defaultValue = "0") double a,
            @RequestParam(defaultValue = "0") double b) {
        return "계산기: %f".formatted(a + b);
    }

    @GetMapping("/calc5")
    @ResponseBody
    String showCalc5(
            @RequestParam(defaultValue = "-") String a,
            @RequestParam(defaultValue = "-") String b) {
        return "계산기: %s".formatted(a + b);
    }

    @GetMapping("/calc6")
    @ResponseBody
    int showCalc6(
            int a, int b) {
        return a + b;
    }

    @GetMapping("/calc8")
    @ResponseBody
    Person showCalc8(
            String name, int age) {
        return new Person(name, age);
    }

    @GetMapping("/calc9")
    @ResponseBody
    Person2 showCalc9(
                    String name, int age) {
        return new Person2(name, age);
    }
    @GetMapping("/calc10")
    @ResponseBody
    Map<String, Object> showCalc10(
            String name, int age) {
        Map<String, Object> personMap = Map.of( //object가 가장 큰 개념
                "name", name,
                "age", age
        );
        return personMap;
    }

//    @GetMapping("/calc11")
//    @ResponseBody
//    List<Person2> showCalc11(
//            String name, int age) {
//       List<Person2> persons = new ArrayList<>(){{
//         add(10);
//         add(123);
//         add(1234567);
//       }}
//
//        return List<Person2>
//    }

//    @GetMapping("/calc12")
//    @ResponseBody
//    List<Person2> showCalc12(
//            String name, int age) {
//        List<Person2> nums = new ArrayList<>(){{
//            add(10);
//            add(123);
//            add(1234567);
//        }}
//        return nums;
//    }
//    @GetMapping("/calc12")
//    @ResponseBody
//    int[] showCalc12(
//            String name, int age) {
//
//        return ;
//    }
//
//    @GetMapping("/calc13")
//    @ResponseBody
//    List<Person2> showCalc1()
//
//        return List<Person2>
//    }

}


    @AllArgsConstructor
    class Person {
        public String name;
        public int age;
    }

    @AllArgsConstructor
    class Person2 {
        @Getter
        private String name;
        @Getter
        private int age;
    }





