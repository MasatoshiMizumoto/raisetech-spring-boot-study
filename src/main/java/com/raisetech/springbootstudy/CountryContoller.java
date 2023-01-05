package com.raisetech.springbootstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryContoller {

  @GetMapping("/countries/{country}")
  public String countries(@PathVariable String country) {
    return "Hello " + country.substring(0, 1).toUpperCase() + country.substring(1) + "!";
  }
}
