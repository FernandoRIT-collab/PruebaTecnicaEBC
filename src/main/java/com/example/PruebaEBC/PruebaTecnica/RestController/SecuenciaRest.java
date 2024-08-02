/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PruebaEBC.PruebaTecnica.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("/api")
public class SecuenciaRest {

    @PutMapping("/secuence/collatz")
    public List<Integer> getSecuenciaCollatz(@RequestParam(name = "n") int n) {
        List<Integer> secuencia = new ArrayList<>();

        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que 0.");
        }
        
        while (n != 1) {
            secuencia.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        secuencia.add(n);
        return secuencia;
    }

    @PutMapping("/secuence/fizzbuzz")
    public List<String> getFizzBuzz(@RequestParam(name = "n") int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

}
