package org.example;

public class GuardaRoupa {

    //Não tinha um valor para orçamento
    private double orcamento = 500;




    public GuardaRoupa(double orcamento) {
        this.orcamento = orcamento;
    }

//  Não testa se o percentual esta entre 0 e 100

    public double precoComDesconto(double preco, double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Desconto inválido!");
        }
        return preco - (preco * percentual / 100);
    }


    //  Ele não aceitava um preço exatamente igual ao orçamento.

    public boolean cabeNoOrcamento(double preco) {
        return preco <= orcamento;
    }

// Aceitava preços iguais a 200
    public boolean ehDeGala(double preco) {
        return preco > 200;
    }


    public void registrarCompra(double preco) {
        this.orcamento = this.orcamento - preco;
    }

    public double getOrcamento() {
        return orcamento;
    }
}
