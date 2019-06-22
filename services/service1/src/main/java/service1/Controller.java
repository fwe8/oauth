package service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/allocations")
public class Controller {
    @GetMapping
    public List<Integer> list() {
        return Arrays.asList(1, 2, 3);
    }
}
