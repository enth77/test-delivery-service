package deliveryservice.domain;

import deliveryservice.DeliveryManagerApplication;
import deliveryservice.domain.DeliveryStatusChecked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryId;

    private Long orderId;

    private Long deliveryJobId;

    private String deliveryStatus;

    @PostPersist
    public void onPostPersist() {
        DeliveryStatusChecked deliveryStatusChecked = new DeliveryStatusChecked(
            this
        );
        deliveryStatusChecked.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryManagerApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
