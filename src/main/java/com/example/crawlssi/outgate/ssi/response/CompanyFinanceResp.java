package com.example.crawlssi.outgate.ssi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanyFinanceResp {

    @JsonProperty("data")
    private CompanyFinancePaging data;

}
