import javax.swing.*;

public class Funcao {

    ConversorMoeda moedas = new ConversorMoeda();

    public void converterMoedas(double valorRecebido)
    {
        String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Real para Dólar", "Real para Euro","Real pra Libra", "Real para Peso Argentino", "Dólar para Real", "Euro para Real", "Libra para Real", "Peso Argentino para Real"}, "Escolha").toString();

        switch (opcao)
        {
            case "Real para Dólar":
                moedas.ConverterReaisADolar(valorRecebido);
                break;
            case "Real para Euro":
                moedas.converterReaisAEuro(valorRecebido);
                break;
        }
    }

}
