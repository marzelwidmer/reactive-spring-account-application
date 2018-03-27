package ch.keepcalm.react.spring;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "accounts")
@Data
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Account {

    @Id
    private String id;

    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy mm:ss")
    private Date creationDate;

    private Double amount;

    private Currency currency;


    public Account(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
