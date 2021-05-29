package sprcom.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping("/staging")
  public String getCapitalName(@RequestParam String name) {
    var capitalName = "Capital not found";
    if (name.equals("India"))
      capitalName = "Delhi";
    else if (name.equals("US"))
      capitalName = "Washington";
    return capitalName;
  }

  @GetMapping("/tempconversion")

  public double tempConversion(@RequestParam double temperature, String unit) {
    if (unit.equals("F"))
      return (temperature - 32) * (5.0 / 9.0);
    else
      return (temperature * (9.0 / 5.0)) + 32;
  
    }

}
