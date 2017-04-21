package br.com.florencio.pecas.forma;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import br.com.florencio.pecas.Celula;
import br.com.florencio.pecas.Constantes;
import br.com.florencio.pecas.Forma;
import br.com.florencio.pecas.Peca;

public class J implements Forma {

	@Override
	public List<Celula> criarCelulas(Peca peca, Color cor, int x, int y) {
		List<Celula> celulas = new ArrayList<>();

		celulas.add(new Celula(cor, x, y));
		celulas.add(new Celula(cor, x, y));
		celulas.add(new Celula(cor, x, y));
		celulas.add(new Celula(cor, x, y));

		girar(celulas, Constantes.GRAU_0, peca);

		return celulas;
	}

	@Override
	public void girar(Peca peca, byte sentido) {
		List<Celula> celulas = peca.getCelulas();

		if (Constantes.SENTIDO_HORARIO == sentido) {
			if (Constantes.GRAU_0 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_270, peca);
			} else if (Constantes.GRAU_270 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_180, peca);
			} else if (Constantes.GRAU_180 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_90, peca);
			} else if (Constantes.GRAU_90 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_0, peca);
			}
		} else if (Constantes.SENTIDO_ANTIHORARIO == sentido) {
			if (Constantes.GRAU_0 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_90, peca);
			} else if (Constantes.GRAU_90 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_180, peca);
			} else if (Constantes.GRAU_180 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_270, peca);
			} else if (Constantes.GRAU_270 == peca.getGrau()) {
				girar(celulas, Constantes.GRAU_0, peca);
			}
		}
	}

	private void girar(List<Celula> celulas, short grau, Peca peca) {
		Celula c0 = celulas.get(0);
		Celula c1 = celulas.get(1);
		Celula c2 = celulas.get(2);
		Celula c3 = celulas.get(3);

		c2.copiar(celulas);
		peca.setGrau(grau);

		if (Constantes.GRAU_0 == grau) {
			c0.leste();
			c0.sul();
			c1.leste();
			c3.oeste();
		} else if (Constantes.GRAU_90 == grau) {
			c0.norte();
			c0.leste();
			c1.norte();
			c3.sul();
		} else if (Constantes.GRAU_180 == grau) {
			c0.oeste();
			c0.norte();
			c1.oeste();
			c3.leste();
		} else if (Constantes.GRAU_270 == grau) {
			c0.sul();
			c0.oeste();
			c1.sul();
			c3.norte();
		}
	}
}