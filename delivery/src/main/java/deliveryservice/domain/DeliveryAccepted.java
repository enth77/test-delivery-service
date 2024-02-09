package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryAccepted extends AbstractEvent {

    private Long deliveryJobId;
    private Long riderId;
    private Date acceptanceDate;

    public DeliveryAccepted(DeliveryJob aggregate) {
        super(aggregate);
    }

    public DeliveryAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
