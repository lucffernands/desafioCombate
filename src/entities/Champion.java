package entities;

public class Champion {

	public String name;
	public int life;
	public int attack;
	public int armor;

	public Champion() {

	}

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if (other.attack < armor) {
			life -= 1;
		} else {
			int damage = other.attack - armor;
			life -= damage;
		}
	}

	public String status() {
		if (life <= 0) {
			return name + ": 0 de vida (morreu)";
		} else {
			return name + ": " + life + " de vida";
		}
	}

}
