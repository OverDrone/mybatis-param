package mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @Autowired
  private MainMapper mapper;

  //no exception
  @GetMapping("/test1")
  public String test1() {
    return mapper.test1("123");
  }

  //Exception: There is no getter for property named 'rec' in 'class mybatis.MainRecord'
  @GetMapping("/test2")
  public String test2() {
    return mapper.test2(new MainRecord("123"));
  }

  //no exception, requires -parameters javac option
  @GetMapping("/test3")
  public String test3() {
    return mapper.test3(new MainRecord("123"), null);
  }
}
