package com.example.demo.account.controler;

import com.example.demo.account.entity.Corporation;
import com.example.demo.account.service.CorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/corp")
public class CorpController {
    private final CorpService corpService;

    @Autowired
    public CorpController(CorpService corpService) {
        this.corpService = corpService;
    }
    @GetMapping
    public List<Corporation> getcorps() {
        return corpService.getcorps();
    }

    @PostMapping
    public void addNewCorp(@RequestBody Corporation corp) {
        corpService.addNewCorp(corp);
    }

    @DeleteMapping(path = "{corpId}")
    public void deletecorp(@PathVariable("corpId") String corpId) {
        corpService.deletecorp(corpId);
    }

    @PutMapping(path = "{corpId}")
    public void updateCorp (
            @PathVariable("corpId") String accoutId,
            @RequestParam(required = true) Integer reserve) {
        corpService.updateCorp(accoutId, reserve);
    }
}

