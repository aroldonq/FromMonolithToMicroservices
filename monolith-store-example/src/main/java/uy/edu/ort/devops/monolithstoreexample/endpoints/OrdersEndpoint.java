package uy.edu.ort.devops.monolithstoreexample.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uy.edu.ort.devops.monolithstoreexample.domain.OrderStatus;
import uy.edu.ort.devops.monolithstoreexample.logic.OrdersLogic;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersEndpoint {

    @Autowired
    private OrdersLogic logic;

    @PostMapping(path = "", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public OrderStatus buy(@RequestBody List<String> products) {
        return logic.buy(products);
    }
}
