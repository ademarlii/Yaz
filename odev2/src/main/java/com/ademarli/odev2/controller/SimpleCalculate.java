package com.ademarli.odev2.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/start")

public class SimpleCalculate {
    @GetMapping("/sum")
    public int sum(@RequestParam int a,@RequestParam int b) {
        return a+b;
    }

    @PostMapping("/multiply")
    public int multiply(@RequestParam MultiplyRequest request ) {
        return request.getA()*request.getB();

    }

    public static class MultiplyRequest {
        private int a;
        private int b;

        // Getter ve Setter'lar
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }



}
