package br.com.florencio.pecas;

import java.awt.Color;

public class Constantes {

	private Constantes() {
	}

	public static final boolean LIMITE_OPACO = false;

	public static final boolean DESENHAR_PECA_CIRCULAR = true;

	public static final boolean GERAR_PECAS_COLORIDAS = true;

	public static final short DESLOCAMENTO_X_POS_TERRITORIO = 50;

	public static final short DESLOCAMENTO_X_TERRITORIO = 100;

	public static final short DESLOCAMENTO_Y_TERRITORIO = 50;

	public static final byte TOTAL_FASES = 10;

	public static final short TOTAL_POR_FASE = 10;

	public static final int TOTAL_PECAS = TOTAL_FASES * TOTAL_POR_FASE;

	public static final short INTERVALO_MOVIMENTO = 200;

	public static final short INTERVALO_DECREMENTO = 5;

	public static final byte TOTAL_CAMADAS = 22;

	public static final byte TOTAL_COLUNAS = 11;

	public static final byte MINIMO_PECA_JOGO = 3;

	public static final byte HORIZONTAL = 0;

	public static final byte VERTICAL = 1;

	public static final byte LADO_QUADRADO = 15;

	public static final byte BORDA_QUADRADO = 3;

	public static final short LARGURA_JANELA = 600;

	public static final short ALTURA_JANELA = 600;

	public static final byte DIRECAO_NORTE = 0;

	public static final byte DIRECAO_SUL = 1;

	public static final byte DIRECAO_LESTE = 2;

	public static final byte DIRECAO_OESTE = 3;

	public static final byte SENTIDO_HORARIO = 0;

	public static final byte SENTIDO_ANTIHORARIO = 1;

	public static final short GRAU_0 = 0;

	public static final short GRAU_90 = 90;

	public static final short GRAU_180 = 180;

	public static final short GRAU_270 = 270;

	public static final Color[] CORES = { Color.BLACK, Color.BLUE, Color.RED, Color.GREEN, Color.CYAN, Color.MAGENTA,
			Color.ORANGE };
}