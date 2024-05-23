package leets.enhance.domain.weapon.presentation;

import leets.enhance.domain.weapon.application.WeaponService;
import leets.enhance.domain.weapon.dto.CreateWeaponRequest;
import leets.enhance.domain.weapon.dto.EnhanseResponse;
import leets.enhance.global.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static leets.enhance.domain.weapon.WeaponResponseMessage.*;
@RestController
@RequiredArgsConstructor
public class WeaponController {
    private final WeaponService weaponService;

    @PostMapping(value = "/enhance")
    public ResponseDto<EnhanseResponse> enhance(Authentication authentication) {
        return ResponseDto.of(OK.value(), SUCCESS_UPDATE.getMessage(),weaponService.executeEnhance(authentication));
    }

    @PostMapping(value = "/items")
    public ResponseDto createWeapon(Authentication authentication, @RequestBody CreateWeaponRequest createWeaponRequest) {
        weaponService.createWeapon(authentication, createWeaponRequest);
        return ResponseDto.of(OK.value(), SUCCESS_CREATE.getMessage());
    }
}
