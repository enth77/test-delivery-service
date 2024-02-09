package deliveryservice.external;

import java.util.Date;
import lombok.Data;

@Data
public class Restaurant {

    private Long restaurantId;
    private String restaurantName;
    private String foodMenu;
    private String deliveryStatus;
}
