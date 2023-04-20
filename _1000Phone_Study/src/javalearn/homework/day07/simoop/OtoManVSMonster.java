package javalearn.homework.day07.simoop;

/**
 * @author Lenovo
 * @create 2023/3/24 14:48
 **/
public class OtoManVSMonster {
    public static class OtoMan {
        private String name;
        private double hp;//血量
        private double attack;//攻击力
        private double defense;//防御力

        /*飞行能恢复0.0005%，奔跑能恢复0.000015%，模拟互相战斗至一方死亡*/
        public void ottManFly() {
            System.out.println("飞行恢复血量");
            hp = hp * 1.05;
        }

        public void ottManAttackSkill() {
            if (hp < 0.3 * hp) {
                attack += 2000;
                System.out.println("光线攻击");
            } else {
                System.out.println("Health is above 30%, cannot use attack skill");
            }
        }
    }
    public static class Monster {
        private String name;
        private double hp;//血量
        private double attack;//攻击力
        private double defense;//防御力

        public void monsterAttackSkill() {
            if (hp < 1500) {
                System.out.println("蛮力攻击");
                attack += 800;
            } else {
                System.out.println("hp is over 1500, cannot use attack skill");
            }
        }

        public void monsterRun() {
            System.out.println("奔跑恢复血量");
            hp = hp * 1.15;
        }

    }

        public static void main(String[] args) {
            OtoMan otoMan = new OtoMan();
            otoMan.name = "OtoMan";
            otoMan.hp = 10000;
            otoMan.attack = 1200;
            System.out.println("奥特曼名字："+otoMan.name + "的血量为：" + otoMan.hp + "，攻击力为：" + otoMan.attack + "，防御力为：" + otoMan.defense);
            Monster monster = new Monster();
            monster.name = "Monster";
            monster.hp = 8100;
            monster.attack = 800;
            System.out.println("怪兽名字："+monster.name + "的血量为：" + monster.hp + "，攻击力为：" + monster.attack );
            int round = 1;
            while (otoMan.hp > 0 && monster.hp > 0 && round <= 20){
                System.out.println("第" + round + "回合");
                otoMan.ottManAttackSkill();
                if (otoMan.hp < 0.3 * otoMan.hp) {
                    otoMan.ottManFly();
                } else if (otoMan.hp < 0.5 * otoMan.hp) {
                    otoMan.ottManAttackSkill();
                }
                monster.monsterAttackSkill();
                otoMan.hp -= (monster.attack+otoMan.attack*1.05);
                monster.hp -= otoMan.attack;
                otoMan.hp += 0.0005 * otoMan.hp;
                monster.hp += 0.00015 * monster.hp;
                System.out.println("DJ对OGR造成了" + otoMan.attack + "点伤害，OGR还剩" + monster.hp + "点血量，DJ自己受到了" + otoMan.attack * 0.1 + "点伤害，DJ还剩" + otoMan.hp + "点血量");
                System.out.println("OGR对DJ造成了" + monster.attack + "点伤害，DJ还剩" + otoMan.hp + "点血量");

                round++;
            }
            if (otoMan.hp <= 0) {
                System.out.println("Monster wins!");
            } else {
                System.out.println("OtoMan wins!");
            }
        }



    }