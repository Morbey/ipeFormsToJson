package com.bnpparibas.bp2s.combo.ipeformstojson.service;

import org.springframework.data.domain.Page;

public interface IOperations<T> {

    Page<T> findPaginated(final int page, final int size);

}
