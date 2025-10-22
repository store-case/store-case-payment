package com.leedahun.storecasepayment.common.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessMessage {
    WRITE_SUCCESS("저장에 성공하였습니다."),
    READ_SUCCESS("조회에 성공하였습니다."),
    UPDATE_SUCCESS("수정에 성공하였습니다."),
    DELETE_SUCCESS("삭제에 성공하였습니다.");

    private final String message;
}
