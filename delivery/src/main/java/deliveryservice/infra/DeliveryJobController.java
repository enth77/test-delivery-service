package deliveryservice.infra;

import deliveryservice.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/deliveryJobs")
@Transactional
public class DeliveryJobController {

    @Autowired
    DeliveryJobRepository deliveryJobRepository;

    @RequestMapping(
        value = "deliveryJobs/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DeliveryJob acceptDelivery(
        @PathVariable(value = "id") Long id,
        @RequestBody AcceptDeliveryCommand acceptDeliveryCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /deliveryJob/acceptDelivery  called #####");
        Optional<DeliveryJob> optionalDeliveryJob = deliveryJobRepository.findById(
            id
        );

        optionalDeliveryJob.orElseThrow(() -> new Exception("No Entity Found"));
        DeliveryJob deliveryJob = optionalDeliveryJob.get();
        deliveryJob.acceptDelivery(acceptDeliveryCommand);

        deliveryJobRepository.save(deliveryJob);
        return deliveryJob;
    }

    @RequestMapping(
        value = "deliveryJobs/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DeliveryJob completeDelivery(
        @PathVariable(value = "id") Long id,
        @RequestBody CompleteDeliveryCommand completeDeliveryCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /deliveryJob/completeDelivery  called #####");
        Optional<DeliveryJob> optionalDeliveryJob = deliveryJobRepository.findById(
            id
        );

        optionalDeliveryJob.orElseThrow(() -> new Exception("No Entity Found"));
        DeliveryJob deliveryJob = optionalDeliveryJob.get();
        deliveryJob.completeDelivery(completeDeliveryCommand);

        deliveryJobRepository.save(deliveryJob);
        return deliveryJob;
    }
}
//>>> Clean Arch / Inbound Adaptor
