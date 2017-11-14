package com.wen.strategy;

import com.wen.strategy.character.AbstractCharacter;
import com.wen.strategy.character.Knight;
import com.wen.strategy.character.Mage;
import com.wen.strategy.weapon.WeaponKnife;
import com.wen.strategy.weapon.WeaponStaff;

/**
 * @author huwenwen
 * @since 12/11/2017
 */
public class Test {
    public static void main(String[] args) {
        AbstractCharacter character1 = new Knight("jack");
        AbstractCharacter character2 = new Mage("rose");
        character1.setWeapon(new WeaponKnife());
        character2.setWeapon(new WeaponStaff());
        character1.useSkill();
        character1.useWepon();
        character2.useSkill();
        character2.useWepon();
    }
}
