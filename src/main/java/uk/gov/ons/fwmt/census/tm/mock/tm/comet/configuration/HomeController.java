package uk.gov.ons.fwmt.census.tm.mock.tm.comet.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeController {
  @RequestMapping(value = "/")
  public String index() {
    System.out.println("swagger-ui.html");
    return "redirect:swagger-ui.html";
  }
}
