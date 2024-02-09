package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long customerId;
    private Long restaurantId;
    private String foodType;
    private Address deliveryAddress;
    private Date orderDate;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
