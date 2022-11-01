package com.bnpparibas.bp2s.combo.ipeformstojson.rest;

import com.bnpparibas.bp2s.combo.ipeformstojson.entity.Attribute;
import com.bnpparibas.bp2s.combo.ipeformstojson.service.AttributeServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeDirectoryRestController {

  @Autowired
  AttributeServiceImpl attributeServiceImpl;

  @CrossOrigin(origins = "http://localhost:4200")
  @RequestMapping(value = "/attributes", method = RequestMethod.GET)
  public List<Attribute> getAttributes() {
    return attributeServiceImpl.getAllAttributes();
  }


}
