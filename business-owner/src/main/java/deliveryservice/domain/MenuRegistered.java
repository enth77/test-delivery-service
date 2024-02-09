package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MenuRegistered extends AbstractEvent {

    private Long restaurantId;
    private String restaurantName;
    private String foodMenu;

    public MenuRegistered(Restaurant aggregate) {
        super(aggregate);
    }

    public MenuRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
