package dao;

import java.util.List;

import domain.Recipient;
import org.springframework.data.repository.CrudRepository;



public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
