package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long deliveryJobId;
    private Date completionDate;

    public DeliveryCompleted(DeliveryJob aggregate) {
        super(aggregate);
    }

    public DeliveryCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
