package am.narekb.lbcontexttest.controller;

import java.util.HashMap;
import java.util.Map;

import am.narekb.lbcontexttest.repository.ConditionalSampleRepository;
import am.narekb.lbcontexttest.repository.UnconditionalSampleRespository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class MainController {
    private UnconditionalSampleRespository unconditionalSampleRepository;
    private ConditionalSampleRepository conditionalSampleRepository;

    public MainController(UnconditionalSampleRespository unconditionalSampleRepository, ConditionalSampleRepository conditionalSampleRepository) {
        this.unconditionalSampleRepository = unconditionalSampleRepository;
        this.conditionalSampleRepository = conditionalSampleRepository;
    }

    @GetMapping("/")
    public Map<String, Long> index() {
        Map<String, Long> mapResult = new HashMap<>();
        mapResult.put("Unconditional samples", unconditionalSampleRepository.count());
        mapResult.put("Conditional samples", conditionalSampleRepository.count());

        return mapResult;
    }
}
