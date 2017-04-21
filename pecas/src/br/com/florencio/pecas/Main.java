package br.com.florencio.pecas;

import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		Visao visao = new Visao();
		visao.setSize(Constantes.LARGURA_JANELA, Constantes.ALTURA_JANELA);
		visao.setLocationRelativeTo(null);
		visao.setVisible(true);
	}

}