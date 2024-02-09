package deliveryservice.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "business-owner", url = "${api.url.business-owner}")
public interface RestaurantService {
    @RequestMapping(method = RequestMethod.POST, path = "/restaurants")
    public void deregisterMenu(@RequestBody Restaurant restaurant);
}
