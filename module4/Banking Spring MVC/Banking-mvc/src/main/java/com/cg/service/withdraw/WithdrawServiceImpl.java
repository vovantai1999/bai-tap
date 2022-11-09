package com.cg.service.withdraw;

import com.cg.model.Customer;
import com.cg.model.Withdraw;
import com.cg.repository.WithdrawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class WithdrawServiceImpl implements WithdrawService{
    @Autowired
    private WithdrawRepository withdrawRepository;

    @Override
    public Iterable<Withdraw> findAll() {
        return withdrawRepository.findAll ();
    }

    @Override
    public Withdraw getById(Long id) {
        return null;
    }

    @Override
    public Optional<Withdraw> findById(Long id) {
        return withdrawRepository.findById ( id );
    }

    @Override
    public Withdraw save(Withdraw withdraw) {
        return withdrawRepository.save ( withdraw );
    }

    @Override
    public Iterable<Customer> remove(Long id) {
        withdrawRepository.deleteById ( id );
        return null;

    }
}