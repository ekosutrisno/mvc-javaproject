package mvcapp.AppV1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

  @GetMapping("/home")
  public String viewHome() {
    return "home";
  }

  @GetMapping("/index")
  public String viewIndex() {
    return "index";
  }

}