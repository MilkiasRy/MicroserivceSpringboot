package dao;

import java.util.List;

import domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;


public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

