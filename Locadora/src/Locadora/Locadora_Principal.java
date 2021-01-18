package Locadora;

import Calculos.Desconto;
import Calculos.Veiculo;
import javax.swing.JOptionPane;

public class Locadora_Principal {

    public static void main(String[] args) {

        Desconto objLocadora = new Desconto();
        Veiculo objVeiculo = new Veiculo();

        JOptionPane.showMessageDialog(null, "Bem-vindo a Locadora Rodar é Bom.");
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        int escolha = JOptionPane.showConfirmDialog(null, "Olá Sr. " + nome + "\n"
                + "Deseja realizar uma alocação de veículo? ");

        switch (escolha) {
            case JOptionPane.YES_OPTION:
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                        + "Informe a sua idade: \n"));
                int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                        + "Informe a quantidade de dias que deseja alugar: \n"));
                if (idade >= 23 && dias >= 2) {
                    int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo do seu Carro\n"
                            + "Tipo 1: Renault KWID. Diária R$ 76,00 \n"
                            + "Tipo 2: Fiat Argo.  Diária R$ 72,00 \n"
                            + "Tipo 3: Nissan Versa. Diária R$ 78,00 \n"));
                    if (dias > 5) {

                        switch (tipo) {
                            case 1:
                                objLocadora.valorDescontoDias(tipo, dias);
                                objVeiculo.mostraRodizio(tipo);
                                objVeiculo.mostraRendimento(tipo);
                                objLocadora.valorTotalDias(tipo, dias);
                                JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                        + "Placa com final 2.\n"
                                        + "O dia do seu rodízio é:  " + objVeiculo.getPlaca() + "\n"
                                        + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                        + "O valor total de desconto: " + objLocadora.getTotalDescontoDias() + "\n"
                                        + "O valor total: " + objLocadora.getValorTotalDias() + "\n");

                                break;
                            case 2:
                                objLocadora.valorDescontoDias(tipo, dias);
                                objVeiculo.mostraRodizio(tipo);
                                objVeiculo.mostraRendimento(tipo);
                                objLocadora.valorTotalDias(tipo, dias);
                                JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                        + "Placa com final 2.\n"
                                        + "O dia do seu rodízio é:  " + objVeiculo.getPlaca() + "\n"
                                        + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                        + "O valor total de desconto: " + objLocadora.getTotalDescontoDias() + "\n"
                                        + "O valor total: " + objLocadora.getValorTotalDias() + "\n");
                                break;
                            case 3:
                                objLocadora.valorDescontoDias(tipo, dias);
                                objVeiculo.mostraRodizio(tipo);
                                objVeiculo.mostraRendimento(tipo);
                                objLocadora.valorTotalDias(tipo, dias);
                                JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                        + "Placa com final 2.\n"
                                        + "O dia do seu rodízio é:  " + objVeiculo.getPlaca() + "\n"
                                        + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                        + "O valor total de desconto: " + objLocadora.getTotalDescontoDias() + "\n"
                                        + "O valor total: " + objLocadora.getValorTotalDias() + "\n");
                                break;
                        }

                    } else {
                        int seguro = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                                + "Você utiliza Porto seguro? "
                                + "1. Para Sim ou 2. Para não "));

                        if (seguro == 1) {

                            switch (tipo) {
                                case 1:
                                    objLocadora.valorDescontoSeguro(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);
                                    objLocadora.valorTotalSeguro(tipo, dias);
                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDescontoSeguro() + "\n"
                                            + "O valor total: " + objLocadora.getValorTotalSeguro() + "\n");
                                    break;
                                case 2:
                                    objLocadora.valorDescontoSeguro(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);
                                    objLocadora.valorTotalSeguro(tipo, dias);
                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDescontoSeguro() + "\n"
                                            + "O valor total: " + objLocadora.getValorTotalSeguro() + "\n");
                                    break;
                                case 3:
                                    objLocadora.valorDescontoSeguro(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);
                                    objLocadora.valorTotalSeguro(tipo, dias);
                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDescontoSeguro() + "\n"
                                            + "O valor total: " + objLocadora.getValorTotalSeguro() + "\n");
                                    break;
                            }

                        } else {

                            switch (tipo) {
                                case 1:
                                    objLocadora.valorTotalSemDesconto(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);

                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDesconto() + "\n"
                                            + "O valor total: " + objLocadora.getTotalDesconto() + "\n");
                                    break;
                                case 2:
                                    objLocadora.valorTotalSemDesconto(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);

                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDesconto() + "\n"
                                            + "O valor total: " + objLocadora.getTotalDesconto() + "\n");
                                    break;
                                case 3:
                                    objLocadora.valorTotalSemDesconto(tipo, dias);
                                    objVeiculo.mostraRodizio(tipo);
                                    objVeiculo.mostraRendimento(tipo);

                                    JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                            + "Placa com final 2.\n"
                                            + "O dia do seu rodízio é: " + objVeiculo.getPlaca() + "\n"
                                            + "O carro faz um total de: " + objVeiculo.getConsumo() + "\n"
                                            + "O valor total de desconto: " + objLocadora.getTotalDesconto() + "\n"
                                            + "O valor total: " + objLocadora.getTotalDesconto() + "\n");
                                    break;
                            }

                        }
                    }

                } else {
                    if (idade < 23 && dias < 2) {

                        JOptionPane.showMessageDialog(null, "Olá Sr. " + nome + "\n"
                                + "Desculpe você não tem idade suficiente e os dias de locação não são o suficiente\n"
                                + "Mínimo de idade é 23 anos.\n"
                                + "e Mínimo de dias é 2.");

                    } else if (idade < 23) {
                        JOptionPane.showMessageDialog(null, "Olá Sr. " + nome + "\n"
                                + "Desculpe você não tem idade suficiente para fazer uma alocação. \n"
                                + "Idade mínima é de 23 anos.");
                    } else if (dias < 2) {
                        JOptionPane.showMessageDialog(null, "Olá Sr. " + nome + "\n"
                                + "Desculpe a quantidade de dias não é suficiente para fazer uma alocação. \n"
                                + "Mínimo é de 2 dias.");
                    }
                }

                int opcao = JOptionPane.showConfirmDialog(null, "Olá Sr. " + nome + "\n"
                        + "Deseja realizar o calculo de gasto do veículo sobre o combustivel? ");
                do {

                    switch (opcao) {
                        case JOptionPane.YES_OPTION:
                            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o seu Carro\n"
                                    + "Digite 1: Renault KWID. \n"
                                    + "Digite 2: Fiat Argo.  \n"
                                    + "Digite 3: Nissan Versa. \n"));
                            int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o combustivel\n"
                                    + "Digite 1: Para Gasolina\n"
                                    + "Digite 2: Para Álcool"));

                            float km = Float.parseFloat(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                                    + "Informe a distancia em km a percorrer: \n"));

                            switch (opcao2) {
                                case 1:
                                    float gasolina = Float.parseFloat(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                                            + "Informe  o preço da gasolina: \n"));
                                    switch (tipo) {
                                        case 1:

                                            objVeiculo.mostraGasolina(tipo, km, gasolina);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando gasolina:  " + objVeiculo.getValorGasolina() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");

                                            break;
                                        case 2:
                                            objVeiculo.mostraGasolina(tipo, km, gasolina);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando gasolina:  " + objVeiculo.getValorGasolina() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");
                                            break;
                                        case 3:
                                            objVeiculo.mostraGasolina(tipo, km, gasolina);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando gasolina:  " + objVeiculo.getValorGasolina() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");
                                            break;
                                    }
                                case 2:
                                    float alcool = Float.parseFloat(JOptionPane.showInputDialog(null, "Olá Sr. " + nome + "\n"
                                            + "Informe o preço do alcool: \n"));
                                    switch (tipo) {
                                        case 1:
                                            objVeiculo.mostraAlcool(tipo, km, alcool);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando Álcool:  " + objVeiculo.getValorAlcool() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");
                                            break;
                                        case 2:
                                            objVeiculo.mostraAlcool(tipo, km, alcool);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando Álcool:  " + objVeiculo.getValorAlcool() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");
                                            break;
                                        case 3:
                                            objVeiculo.mostraAlcool(tipo, km, alcool);
                                            JOptionPane.showMessageDialog(null, "O seu carro locado foi: " + objLocadora.carro + "\n"
                                                    + "Quantidade de litross: " + objVeiculo.getQuantidadaLitros() + "\n"
                                                    + "O valor gasto colocando Álcool:  " + objVeiculo.getValorAlcool() + "\n"
                                                    + "A distancia percorrida: " + km + "\n");
                                            break;
                                    }
                                    opcao = JOptionPane.showConfirmDialog(null, "Olá Sr. " + nome + "\n"
                                            + "Deseja realizar o calculo de gasto do veículo sobre o combustivel? ");
                            }

                        case JOptionPane.NO_OPTION:
                    }
                } while (opcao == JOptionPane.YES_OPTION);

            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Obrigado pela visita! ");

        }

        /*objTroco.calculoTroco(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor à pagar: ")));
            
         */
    }

}
