package com.example.legacyapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Model{

    @JsonProperty("id")
    private Long memNo; // 회원번호

    @JsonProperty("name")
    private String memNm; // 회원명

    @JsonProperty("idn")
    private String idn;

    @JsonProperty("status")
    private String status; // 회원상태

    @JsonProperty("type")
    private String type; // 회원유형

    @JsonProperty("saller_tp")
    private String sallerTp; //회원구분

    @JsonProperty("corp_type")
    private String corpType;

    @JsonProperty("level")
    private String level; // 회원등급

    @JsonProperty("level_rate")
    private Double levelRate;//회원등급 적립율

    @JsonProperty("tel_no")
    private String telNo;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("postcode")
    private String postCode;

    @JsonProperty("address_1")
    private String address1;

    @JsonProperty("address_2")
    private String address2;

    @JsonProperty("pet_name")
    private String petName;

}
