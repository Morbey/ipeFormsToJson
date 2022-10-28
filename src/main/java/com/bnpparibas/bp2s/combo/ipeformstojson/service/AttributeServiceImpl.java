package com.bnpparibas.bp2s.combo.ipeformstojson.service;

import com.bnpparibas.bp2s.combo.ipeformstojson.dao.AttributeRepository;
import com.bnpparibas.bp2s.combo.ipeformstojson.entity.Attribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {

    @Autowired
    private AttributeRepository dao;

    @Override
    public Page<Attribute> findPaginated(int page, int size) {
        return dao.findAll(PageRequest.of(page, size));
    }

}
