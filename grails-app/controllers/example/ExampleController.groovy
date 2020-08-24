package example

import example.client.ProductClient
import org.springframework.beans.factory.annotation.Autowired

class ExampleController {

    @Autowired
    ProductClient productClient

    def index() {

        productClient.sendProduct("Nike", "Blue Trainers")

    }
}
