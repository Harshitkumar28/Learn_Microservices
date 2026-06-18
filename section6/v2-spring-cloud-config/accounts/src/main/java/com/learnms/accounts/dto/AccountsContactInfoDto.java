package com.learnms.accounts.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// here it is fixed, means cannot be changed later, only getter, no setter
// here field name should be same as there in accounts.yaml
// why use this, cz we don't need to change the contents of these fields every time

@ConfigurationProperties(prefix = "accounts") // this 'accounts' is there in accounts.yaml
@Getter @Setter
public class AccountsContactInfoDto{

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
