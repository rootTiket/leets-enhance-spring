package leets.enhance.domain.weapon.dto;

import leets.enhance.domain.weapon.WeaponResponseMessage;

public record EnhanceResponse(
        WeaponResponseMessage weaponResponseMessage,
        Integer level
) {
}
