package deliveryservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceOrderCommand {

    private Long customerId;
    private Long restaurantId;
    private String foodType;
    private Address deliveryAddress;
}
