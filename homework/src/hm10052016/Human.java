package hm10052016;

public class Human {

	private String name;
	private String kind;
	private boolean isSleepy = true;

	public Human(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

	public void cofe() {
		if (isSleepy) {
			System.out.println(kind + " '" + name + "' пьет кофе");
			isSleepy = false;
		} else {
			System.out.println(kind + " '" + name + "' врач запретил пить так много кофе!");
		}
	}

	public void transport() {
		if (!isSleepy) {
			System.out.println(kind + " '" + name + "' едет в маршрутке");
			isSleepy = true;
		} else {
			System.out.println(kind + " '" + name + "' сел(ла) не в ту маршрутку");
		}
	}

	public void feed(String food) {
		if (!isSleepy) {
			System.out.println(kind + " '" + name + "' ест " + food);
			isSleepy = false;
		} else {
			System.out.println(kind + " '" + name + "' пытается сообразить что делать с " + food);
		}
	}

	public void work() {
		if (isSleepy) {
			System.out.println(kind + " '" + name + "' не может работать, по тому что опять спит");
		} else {
			System.out.println(kind + " '" + name + "' работает, пока действует кофе");
			isSleepy = true;
		}
	}

}
