package leets.enhance.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR", "서버 오류가 발생했습니다."),
    INVALID_TOKEN(401, "INVALID_TOKEN", "유효하지 않은 토큰입니다."),
    EXPIRED_TOKEN(403, "EXPIRED_TOKEN", "만료된 토큰입니다."),
    INVALID_ID(404, "INVALID_ID", "올바르지 않은 아이디입니다."),
    INVALID_PASSWORD(404, "INVALID_PASSWORD", "올바르지 않은 비밀번호입니다."),
    USER_CONFLICT(409, "USER_CONFLICT", "이미 가입된 계정입니다."),
    ID_CONFLICT(409, "ID_CONFLICT", "이미 사용중인 아이디입니다."),
    USER_NOT_FOUND(404,"USER_NOT_FOUND","유저를 찾을 수 없습니다"),
    WEAPON_NOT_FOUND(404,"WEAPON_NOT_FOUND","무기를 찾을 수 없습니다"),
    ALREADY_EXIST(404,"ALREADY_EXIST","이미 무기를 가지고 있습니다."),
    NO_ITEM(404,"NO_ITEM","확률강화권이 부족합니다");
    private final int httpStatus;
    private final String code;
    private final String message;
}
