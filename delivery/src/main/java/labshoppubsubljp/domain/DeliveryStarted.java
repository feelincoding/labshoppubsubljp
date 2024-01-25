package labshoppubsubljp.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsubljp.domain.*;
import labshoppubsubljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long productId;
    private String status;
    private Integer qty;
    private Long orderId;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
