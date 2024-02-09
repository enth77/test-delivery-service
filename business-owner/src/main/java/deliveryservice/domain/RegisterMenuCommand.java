package deliveryservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterMenuCommand {

    private Long restaurantId;
    private String restaurantName;
    private String foodMenu;
}
