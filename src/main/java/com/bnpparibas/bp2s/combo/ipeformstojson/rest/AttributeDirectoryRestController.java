package com.bnpparibas.bp2s.combo.ipeformstojson.rest;

import com.bnpparibas.bp2s.combo.ipeformstojson.entity.Attribute;
import com.bnpparibas.bp2s.combo.ipeformstojson.exception.MyResourceNotFoundException;
import com.bnpparibas.bp2s.combo.ipeformstojson.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeDirectoryRestController {
  @Autowired
  private AttributeService service;

  @RequestMapping(value = "/attribute/get", params = { "page", "size" }, method = RequestMethod.GET, produces = "application/json")
  public Page<Attribute> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size) {

    Page<Attribute> resultPage = service.findPaginated(page, size);
    if (page > resultPage.getTotalPages()) {
      throw new MyResourceNotFoundException();
    }
    return resultPage;
  }
}
