package com.mendix;

public enum Case_Types {
    PLEV_S1("Plevin Stage 1"),
    PLEV_S2("Plevin Stage 2"),
    UDC_S1("Undisclosed Commissions Stage 1"),
    UDC_S2("Undisclosed Commissions Stage 2"),
    BEC_S1("Business Energy Stage 1"),
    BEC_S2("Business Energy Stage 2"),
    MF_S1("Motor Finance Stage 1"),
    PXN_S1("Paxen Motor Finance Stage 1"),
    ELR_S1("Elara Motor Finance Stage 1"),
    CCL_BEC_S1("CCL Business Energy Stage 1");

    private final String caption;

    private Case_Types(String captionString) {
        this.caption = captionString;
    }

    public String getCaption() {
        return caption;
    }

}