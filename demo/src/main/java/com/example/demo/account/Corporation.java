package com.example.demo.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "corporation")
public class Corporation {
    @Id
    @Column(name = "corpId", columnDefinition = "VARCHAR(20)")
    private String corpId;
    @Column(name = "name", columnDefinition = "VARCHAR(100)")
    private String name;
    @Column(name = "reserve_assets", columnDefinition = "INTEGER")
    private int reserve_assets;

    public Corporation() {
    }

    public Corporation(String corpId, String name, int reserve_assets) {
        this.corpId = corpId;
        this.name = name;
        this.reserve_assets = reserve_assets;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReserve_assets() {
        return reserve_assets;
    }

    public void setReserve_assets(int reserve_assets) {
        this.reserve_assets = reserve_assets;
    }
}
