package com.IzaiasValentim.donationapi.entity.dto;

import com.IzaiasValentim.donationapi.entity.Donation;

public class DonationCreationDTO {
    private String donor_Name;
    private String phone;
    private String email;
    private Double amountDonated;
    private Boolean anonymous;
    private String transferVoucher;

    public DonationCreationDTO() {
    }

    public String getDonor_Name() {
        return donor_Name;
    }

    public void setDonor_Name(String donor_Name) {
        this.donor_Name = donor_Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAmountDonated() {
        return amountDonated;
    }

    public void setAmountDonated(Double amountDonated) {
        this.amountDonated = amountDonated;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public String getTransferVoucher() {
        return transferVoucher;
    }

    public void setTransferVoucher(String transferVoucher) {
        this.transferVoucher = transferVoucher;
    }

    Donation dtoToDonation() {
        Donation donatioRetured = new Donation();
        donatioRetured.setAmountDonated(this.getAmountDonated());
        donatioRetured.setTransferVoucher(this.getTransferVoucher());
        donatioRetured.setVerified(false);

        if (this.getAnonymous()) {

            donatioRetured.setDonor_Name("");
            donatioRetured.setEmail("");
            donatioRetured.setPhone("");
            donatioRetured.setAnonymous(true);
        } else {
            donatioRetured.setDonor_Name(this.getDonor_Name());
            donatioRetured.setEmail(this.getEmail());
            donatioRetured.setPhone(this.getPhone());
            donatioRetured.setAnonymous(false);
        }
        return donatioRetured;
    }

}
