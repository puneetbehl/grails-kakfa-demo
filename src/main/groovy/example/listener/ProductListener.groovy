package example.listener

import io.micronaut.configuration.kafka.annotation.*;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class ProductListener {

    @Topic("my-products")
    public void receive(@KafkaKey String brand, String name) {
        System.out.println("Got Product - " + name + " by " + brand)
    }
}
