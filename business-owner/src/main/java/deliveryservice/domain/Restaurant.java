package deliveryservice.domain;

import deliveryservice.BusinessOwnerApplication;
import deliveryservice.domain.MenuRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurant_table")
@Data
//<<< DDD / Aggregate Root
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restaurantId;

    private String restaurantName;

    private String foodMenu;

    private String deliveryStatus;

    @PostPersist
    public void onPostPersist() {
        MenuRegistered menuRegistered = new MenuRegistered(this);
        menuRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RestaurantRepository repository() {
        RestaurantRepository restaurantRepository = BusinessOwnerApplication.applicationContext.getBean(
            RestaurantRepository.class
        );
        return restaurantRepository;
    }
}
//>>> DDD / Aggregate Root
