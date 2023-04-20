package javalearn.oop;

/**
 * @author Lenovo
 * @create 2023/3/27 10:00
 **/
    public class Role {
        private String name;
        private int blood;

        public Role() {
        }

        public Role(String name, int blood) {
            this.name = name;
            this.blood = blood;
        }

        /**
         * 获取
         *
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         *
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取
         *
         * @return blood
         */
        public int getBlood() {
            return blood;
        }

        /**
         * 设置
         *
         * @param blood
         */
        public void setBlood(int blood) {
            this.blood = blood;
        }


        public void attack(Role role) {
            int hurt = (int) (Math.random() * 20) + 1;
            //this 表示方法的调用着
            int ReMianBlood = role.getBlood() - hurt;

            ReMianBlood = ReMianBlood < 0 ? 0 : ReMianBlood;

            //挨揍的血量改为
            role.setBlood(ReMianBlood);

            System.out.println(this.getName() + "举起拳头，打了" +role.getName()  + "一下" + "造成了" + hurt + "点伤害" + role.getName() + "还剩下" + ReMianBlood + "点血");


        }
}