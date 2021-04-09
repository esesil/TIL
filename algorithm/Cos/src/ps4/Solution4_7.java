package ps4;

import java.util.Arrays;

class Solution4_7 {
    class Unit {
        public int HP;
        public Unit() {
            this.HP = 1000;
        }
        public void underAttack(int damage) { }
    }

    class Monster extends Unit { //
        public int attackPoint;
        public Monster(int attackPoint) {
            this.attackPoint = attackPoint;
        }
        public void underAttack(int damage) { //
            this.HP -= damage;
        }
        public int attack() { //
            return attackPoint;
        }
    }

    class Warrior extends Unit { //
        public int attackPoint;
        public Warrior(int attackPoint) {
            this.attackPoint = attackPoint;
        }
        public void underAttack(int damage) { //
            this.HP -= damage;
        }
        public int attack() { //
            return attackPoint;
        }
    }

    class Healer extends Unit { //
        public int healingPoint;
        public Healer(int healingPoint) { 
            this.healingPoint = healingPoint;
        }
        public void underAttack(int damage) {
            this.HP -= damage;
        }
        public void healing(Unit unit) {
            unit.HP += healingPoint;
        }
    }
    public int[] solution(int monsterAttackPoint, int warriorAttackPoint, int healingPoint) {
        Monster monster = new Monster(monsterAttackPoint);
        Warrior warrior = new Warrior(warriorAttackPoint);
        Healer healer = new Healer(healingPoint);
        
        //���簡 ���͸� �� �� ����
        monster.underAttack(warrior.attack());
        //���Ͱ� ���縦 �� �� ����
        warrior.underAttack(monster.attack());
        //���Ͱ� ������ �� �� ����
        healer.underAttack(monster.attack());
        //������ ������ ü���� �� �� ȸ��
        healer.healing(warrior);
        //������ ������ ü���� �� �� ȸ��
        healer.healing(monster);

        int[] answer = {monster.HP, warrior.HP, healer.HP};
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution4_7 sol = new Solution4_7();
        int monsterAttackPoint = 100;
        int warriorAttackPoint = 90;
        int healingPoint = 30;
        int[] ret = sol.solution(monsterAttackPoint, warriorAttackPoint, healingPoint);

        // ����] ��ư�� ������ ��°��� �� �� �ֽ��ϴ�.
        System.out.printf("solution �޼ҵ��� ��ȯ ���� ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" �Դϴ�.\n");
    }   
}