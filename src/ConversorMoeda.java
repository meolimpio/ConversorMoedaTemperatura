import javax.swing.*;

public class ConversorMoeda {
    public void ConverterReaisADolar(double valor)
    {
        double moedaDolar = valor/4.92;
        moedaDolar = (double)Math.round(moedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Você possui $ " + moedaDolar + " Dólares.");
    }

    public void converterReaisAEuro(double valor)
    {
        double moedaEuro = valor/5.30;
        moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Você possui $ " + moedaEuro + " Euros.");

    }
}
