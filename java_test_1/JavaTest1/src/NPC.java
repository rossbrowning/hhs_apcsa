public class NPC {
    String name;
    int hp,gold,stamina,magic;

    public NPC(String name, int hp, int gold, int stamina, int magic) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
        this.stamina = stamina;
        this.magic = magic;
    }
    public NPC() {
        this("John Doe", 10, 0, 10, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "NPC [name=" + name + ", hp=" + hp + ", gold=" + gold + ", stamina=" + stamina + ", magic=" + magic
                + "]";
    }
}
