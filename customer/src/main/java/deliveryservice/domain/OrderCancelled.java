package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long orderId;
    private Long customerId;
    private Long restaurantId;
    private String foodType;
    private Address deliveryAddress;
    private Date cancelDate;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
