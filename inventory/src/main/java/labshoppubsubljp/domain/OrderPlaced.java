package labshoppubsubljp.domain;

import java.util.*;
import labshoppubsubljp.domain.*;
import labshoppubsubljp.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
}
