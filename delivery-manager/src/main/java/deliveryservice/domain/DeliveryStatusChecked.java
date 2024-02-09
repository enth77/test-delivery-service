package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStatusChecked extends AbstractEvent {

    private Long deliveryId;
    private String deliveryStatus;

    public DeliveryStatusChecked(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStatusChecked() {
        super();
    }
}
//>>> DDD / Domain Event
