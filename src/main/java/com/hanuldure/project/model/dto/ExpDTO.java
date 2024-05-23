package com.hanuldure.project.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Alias("ExpDTO")
public class ExpDTO {
    private int expSeq; //체험번호
    private int userSeq; //농업인 번호

    private String expTitle; //체험제목
    private String expContent; //체험 내용

    private String expStart; //시작일시
    private String expEnd; //종료일시
    private String expDuration;
    private String expGetStart; //모집시작일시
    private String expGetEnd; //모집 마감일시

    private int expMin; //최소인원
    private int expMax; //최대 인원
    private int expAppliers; //신청 인원

    private String expAddr; //주소
    private String expAddrDetail; //상세 주소

    private String expImg; //체험 이미지
    private int expPrice; //체험 비용

    private String expRequestDatetime;  // 주최신청일시
    private int expStatus;  // 승인여부

    /* AllArgsConstructor - expDuration*/
    public ExpDTO(int expSeq, int userSeq, String expTitle, String expContent, String expStart, String expEnd, String expDuration, String expGetStart, String expGetEnd, int expMin, int expMax, int expAppliers, String expAddr, String expAddrDetail, String expImg, int expPrice, String expRequestDatetime, int expStatus) {
        this.expSeq = expSeq;
        this.userSeq = userSeq;
        this.expTitle = expTitle;
        this.expContent = expContent;
        this.expStart = expStart;
        this.expEnd = expEnd;
        this.expDuration = expDuration;
        this.expGetStart = expGetStart;
        this.expGetEnd = expGetEnd;
        this.expMin = expMin;
        this.expMax = expMax;
        this.expAppliers = expAppliers;
        this.expAddr = expAddr;
        this.expAddrDetail = expAddrDetail;
        this.expImg = expImg;
        this.expPrice = expPrice;
        this.expRequestDatetime = expRequestDatetime;
        this.expStatus = expStatus;
    }
    /* Prototype 값 입력용 필드*/
    /*
    private int revSeq; //체험후기 번호
    private String revContent; //후기 내용
    private String revWriteDate; //작성일시

    private String userName; //작성자 닉네임
    private int expTime; //소요시간
    */
}
