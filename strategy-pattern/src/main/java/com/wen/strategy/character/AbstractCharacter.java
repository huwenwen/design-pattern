package com.wen.strategy.character;

import com.wen.strategy.skill.ISkill;
import com.wen.strategy.weapon.IWeapon;

/**
 * @author huwenwen
 * @since 12/11/2017
 */
public abstract class AbstractCharacter {
    String name;
    ISkill skill;
    IWeapon weapon;
    public void useSkill(){
        if(skill == null){
            System.out.println(name + " no skill");
            return;
        }
        skill.useSkill();
    }

    public void useWepon(){
        if(weapon == null){
            System.out.println(name + " no weapon");
            return;
        }
        weapon.useWeapon();
    }

    public void setSkill(ISkill skill) {
        this.skill = skill;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
