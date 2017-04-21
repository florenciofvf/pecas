package br.com.florencio.pecas.forma;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import br.com.florencio.pecas.Celula;
import br.com.florencio.pecas.Forma;
import br.com.florencio.pecas.Peca;

public class Ponto implements Forma {

	@Override
	public List<Celula> criarCelulas(Peca peca, Color cor, int x, int y) {
		List<Celula> celulas = new ArrayList<>();

		Celula c0 = new Celula(cor, x, y);

		celulas.add(c0);

		return celulas;
	}

	@Override
	public void girar(Peca peca, byte sentido) {
	}
}