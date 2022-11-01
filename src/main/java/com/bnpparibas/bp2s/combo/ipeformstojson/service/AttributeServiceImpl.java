package com.bnpparibas.bp2s.combo.ipeformstojson.service;

import com.bnpparibas.bp2s.combo.ipeformstojson.dao.AttributeRepository;
import com.bnpparibas.bp2s.combo.ipeformstojson.entity.Attribute;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {

    @Autowired
    private AttributeRepository dao;

    public List<Attribute> getAllAttributes() {
        return dao.findAll();
    }
}
