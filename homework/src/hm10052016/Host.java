package hm10052016;

public class Host {

	public static void main(String[] args) {

		Human Valeriya = new Human("Девушка", "Валерия");
		Valeriya.cofe(); // пьет кофе, бодрится
		Valeriya.feed("бутер"); // ест, бодрится
		Valeriya.transport(); // едет, засыпает
		Valeriya.work(); // работает, устает - засыпает
		Valeriya.cofe(); // пьет кофе, бодрится
		Valeriya.work(); // работает, устает - засыпает
		Valeriya.cofe(); // пьет кофе, бодрится
		Valeriya.feed("бутер"); // ест, бодрится
		Valeriya.work(); // работает, устает - засыпает
		Valeriya.work(); // работает, устает - засыпает
		Valeriya.transport(); // едет, засыпает

	}

}
