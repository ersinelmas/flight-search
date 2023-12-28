import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departureAirport;
    private String arrivalAirport;
    private String departureDateTime;
    private String returnDateTime;
    private double price;
}