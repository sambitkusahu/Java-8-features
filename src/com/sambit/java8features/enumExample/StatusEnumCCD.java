package com.sambit.java8features.enumExample;

public enum StatusEnumCCD {
    INVALID_COMPANY_ID_CODE("ccd.invalid.companyid"),
    INVALID_BANK_ID_CODE("ccd.invalid.companyid"),
    COMPANY_ID_MISSING("ccd.companyid.missing"),
    UNAUTHORIZED_ACCESS("ccd.unauthorized.access");
    private String key;

    StatusEnumCCD(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}

class Test_1{
    public static void main(String[] args) {
        String companyId = StatusEnumCCD.INVALID_COMPANY_ID_CODE.getKey();
        System.out.println("companyId = " + companyId);
    }
}
