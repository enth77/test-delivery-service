package deliveryservice.domain;

import deliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveryJobs",
    path = "deliveryJobs"
)
public interface DeliveryJobRepository
    extends PagingAndSortingRepository<DeliveryJob, Long> {}
