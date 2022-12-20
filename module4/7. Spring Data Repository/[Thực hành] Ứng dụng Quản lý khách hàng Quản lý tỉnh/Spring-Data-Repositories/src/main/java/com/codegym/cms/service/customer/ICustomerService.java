package com.codegym.cms.service.customer;

import com.codegym.cms.service.IGeneralService;
import com.codegym.cms.model.Customer;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
