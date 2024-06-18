//2024-06-18 update comments

package com.kefa.erpbackend.api.account;

import com.kefa.erpbackend.auditing.Auditable;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_idx")
    private Long accountIdx;        // 사업장번호

    @Column(name = "branch_idx")
    private Long branchIdx;         // 지점명

    @Column(name = "account_name")
    private String accountName;    // 사업장코드

    @Column(name = "location")
    private String location;        //  소재지

    @Column(name = "products")
    private String products;        // 생산품

    @Column(name = "owner")
    private String owner;           // 	대표자

    @Column(name = "engineer")
    private String engineer;        // 환경기술인

    @Column(name = "business_type")
    private int businessType;       // 	사업장종별

    @Column(name = "facility_type")
    private int facilityType;       // 시설종수

    @Column(name = "facility_number")
    private String facilityNumber;      // 시설번호

    @Column(name = "facility_discharge")
    private String facilityDischarge;   // 배출시설명

    @Column(name = "facility_prevention")
    private String facilityPrevention;  // 방지시설명

    @Column(name = "facility_prevention_permit")
    private String facilityPreventionPermit;    // 허가증 방지시설명

    @Column(name = "facility_prevention_unit")
    private String facilityPreventionUnit;      // 방지시설 단위

    @Column(name = "facility_prevention_volume")
    private int facilityPreventionVolume;   // 방지시설 용량

    @Column(name = "state")
    private String state;   // 상태

}
