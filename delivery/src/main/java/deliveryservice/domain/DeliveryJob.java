package deliveryservice.domain;

import deliveryservice.DeliveryApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryJob_table")
@Data
//<<< DDD / Aggregate Root
public class DeliveryJob {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryJobId;

    private Long orderId;

    private Long riderId;

    private String deliveryStatus;

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryJobRepository repository() {
        DeliveryJobRepository deliveryJobRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryJobRepository.class
        );
        return deliveryJobRepository;
    }

    //<<< Clean Arch / Port Method
    public void acceptDelivery(AcceptDeliveryCommand acceptDeliveryCommand) {
        //implement business logic here:

        DeliveryAccepted deliveryAccepted = new DeliveryAccepted(this);
        deliveryAccepted.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void completeDelivery(
        CompleteDeliveryCommand completeDeliveryCommand
    ) {
        //implement business logic here:

        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
