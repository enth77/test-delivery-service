package deliveryservice.external;

import java.util.Date;
import lombok.Data;

@Data
public class DeliveryJob {

    private Long deliveryJobId;
    private Long orderId;
    private Long riderId;
    private String deliveryStatus;
}
