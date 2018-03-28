package ch.keepcalm.react.spring;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ReactiveAccountRepository extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findByCurrency(Currency currency);
}
