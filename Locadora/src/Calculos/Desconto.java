package Calculos;

public class Desconto {

    public double desconto, totalDesconto, totalDescontoSeguro, totalDescontoDias;
    public String carro;

    public double valorTotal, valorTotalSeguro, valorTotalDias;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    // Variavel desconto, somente para constar o valor.

    public double getTotalDesconto() {
        return totalDesconto;
    }

    public void setTotalDesconto(double totalDesconto) {
        this.totalDesconto = totalDesconto;
    }

    public void valorTotalSemDesconto(int tipo, int dias) {

        switch (tipo) {
            case 1:
                carro = "Renault KWID";
                totalDesconto = dias * 76;

                break;
            case 2:
                carro = "Fiat Argo";
                totalDesconto = dias * 72;
                break;
            case 3:
                carro = "Nissan Versa";
                totalDesconto = dias * 78;
                break;
            default:
                break;
        }

    }

    // Metodo sem desconto.
    //////////////////////////////////////////////////////////
    public double getTotalDescontoDias() {
        return totalDescontoDias;
    }

    public void setTotalDescontoDias(double totalDescontoDias) {
        this.totalDescontoDias = totalDescontoDias;
    }

    public void valorDescontoDias(int tipo, int dias) {

        switch (tipo) {
            case 1:
                carro = "Renault KWID";
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;

                break;
            case 2:
                carro = "Fiat Argo";
                totalDesconto = dias * 72;
                totalDescontoDias = (totalDesconto / 100) * 10;
                break;
            case 3:
                carro = "Nissan Versa";
                totalDesconto = dias * 78;
                totalDescontoDias = (totalDesconto / 100) * 10;
                break;
            default:
                break;
        }

    }
    // Metodo de desconto por dias que o usuário alugou o carro
    //////////////////////////////////////////////////////////

    public double getTotalDescontoSeguro() {
        return totalDescontoSeguro;
    }

    public void setTotalDescontoSeguro(double totalDescontoSeguro) {
        this.totalDescontoSeguro = totalDescontoSeguro;
    }

    public void valorDescontoSeguro(int tipo, int dias) {

        switch (tipo) {
            case 1:
                carro = "Renault KWID";
                totalDesconto = dias * 76;
                totalDescontoSeguro = (totalDesconto / 100) * 15;

                break;
            case 2:
                carro = "Fiat Argo";
                totalDesconto = dias * 72;
                totalDescontoSeguro = (totalDesconto / 100) * 15;
                break;
            case 3:
                carro = "Nissan Versa";
                totalDesconto = dias * 78;
                totalDescontoSeguro = (totalDesconto / 100) * 15;
                break;
            default:
                break;
        }

    }
    // Metodo de desconto por seguro, seguro Porto Seguro.
    //////////////////////////////////////////////////////////

    public double getValorTotalSeguro() {
        return valorTotalSeguro;
    }

    public void setValorTotalSeguro(double valorTotalSeguro) {
        this.valorTotalSeguro = valorTotalSeguro;
    }

    public void valorTotalSeguro(int tipo, int dias) {

        switch (tipo) {
            case 1:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;
                valorTotalSeguro = totalDesconto - totalDescontoSeguro;

                break;
            case 2:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;
                valorTotalSeguro = totalDesconto - totalDescontoSeguro;
                break;
            case 3:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;
                valorTotalSeguro = totalDesconto - totalDescontoSeguro;
                break;
            default:
                break;
        }

    }

    public double getValorTotalDias() {
        return valorTotalDias;
    }

    public void setValorTotalDias(double valorTotalDias) {
        this.valorTotalDias = valorTotalDias;
    }

    public void valorTotalDias(int tipo, int dias) {

        switch (tipo) {
            case 1:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;
                valorTotalDias = totalDesconto - totalDescontoSeguro;

                break;
            case 2:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;
                valorTotalDias = totalDesconto - totalDescontoSeguro;
                break;
            case 3:
                totalDesconto = dias * 76;
                totalDescontoDias = (totalDesconto / 100) * 10;

                valorTotalDias = totalDesconto - totalDescontoSeguro;
                break;
            default:
                break;
        }

    }

}
