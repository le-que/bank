package com.example.demo.account.service;

import com.example.demo.repository.CorpRepository;
import com.example.demo.account.entity.Corporation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CorpService {
    private final CorpRepository corpRepository;

    @Autowired
    public CorpService(CorpRepository corpRepository) {
        this.corpRepository = corpRepository;
    }
    public List<Corporation> getcorps() {
        return corpRepository.findAll();
    }
    @PostMapping
    public void addNewCorp(Corporation corp) {
        Optional<Corporation> corpNumOptional = corpRepository
                .findByCorpId(corp.getCorpId());
        if (corpNumOptional.isPresent()) {
            throw new IllegalStateException("account num taken");
        }
        corpRepository.save(corp);
    }

    public void deletecorp(String corpId) {
        boolean exist = corpRepository.existsById(corpId);
        if (!exist) {
            throw new IllegalStateException("Corporation " + corpId + " does not exist");
        }
        corpRepository.deleteById(corpId);
    }
    @Transactional
    public void updateCorp (String corpId, int reserve) {
        Corporation a = corpRepository.findById(corpId).orElseThrow(() ->
                new IllegalStateException("Corporation " + corpId + " does not exist"));
        if (reserve <= 0) {
            throw new IllegalStateException("Reserve_assets needs to be greater than 0");
        } else {
            a.setReserve_assets(reserve);
        }
    }
}
