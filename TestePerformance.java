import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		metodoArray();
		metodoSet();
	}

	public static void metodoSet() {

		Collection<Integer> numeros = new HashSet<Integer>();

		long inicioAdd = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}
		long fimAdd = System.currentTimeMillis();

		long inicioBusca = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fimBusca = System.currentTimeMillis();

		long tempoDeExecucaoAdd = fimAdd - inicioAdd;
		long tempoDeExecucaoBusca = fimBusca - inicioBusca;
		

		System.out.println("Tempo gasto adicionando com Set: " + tempoDeExecucaoAdd);
		System.out.println("Tempo gasto buscando com Set: " + tempoDeExecucaoBusca);

	}

	public static void metodoArray() {

		Collection<Integer> numeros = new ArrayList<Integer>();


		long inicioAdd = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000; i++) {
			numeros.add(i);
		}
		long fimAdd = System.currentTimeMillis();

		long inicioBusca = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fimBusca = System.currentTimeMillis();

		long tempoDeExecucaoAdd = fimAdd - inicioAdd;
		long tempoDeExecucaoBusca = fimBusca - inicioBusca;
		

		System.out.println("Tempo gasto adicionando com Array: " + tempoDeExecucaoAdd);
		System.out.println("Tempo gasto buscando com Array: " + tempoDeExecucaoBusca);

	}

}
