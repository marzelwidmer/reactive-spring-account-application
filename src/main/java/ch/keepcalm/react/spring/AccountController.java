package ch.keepcalm.react.spring;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final ReactiveAccountRepository reactiveAccountRepository;

    public AccountController(ReactiveAccountRepository reactiveAccountRepository) {
        this.reactiveAccountRepository = reactiveAccountRepository;
    }

    @GetMapping(value = "/search/bycurrency")
    Flux<Account> findByCurrency(@RequestParam String currency) {
        return reactiveAccountRepository.findByCurrency(Currency.fromValue(currency));
    }

    @GetMapping(value = "/{id}")
    Mono<Account> findById(@PathVariable String id) {
        return reactiveAccountRepository.findById(id);
    }

    @PostMapping(value = "/")
    Mono<Account> save(@RequestBody Account account) {
        return reactiveAccountRepository.save(account);
    }

    @GetMapping(value = "/")
    Flux<Account> findAll() {
        return reactiveAccountRepository.findAll();
    }
}