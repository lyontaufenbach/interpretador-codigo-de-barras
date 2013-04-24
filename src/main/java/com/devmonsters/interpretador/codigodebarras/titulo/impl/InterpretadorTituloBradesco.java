package com.devmonsters.interpretador.codigodebarras.titulo.impl;

import com.devmonsters.interpretador.codigodebarras.titulo.AbstractInterpretadorTitulo;
import com.devmonsters.interpretador.codigodebarras.titulo.InstituicaoFinanceira;

public class InterpretadorTituloBradesco extends AbstractInterpretadorTitulo {

    private static final long serialVersionUID = 2179905398761560975L;

    public InterpretadorTituloBradesco(final String codigoDeBarras) {
        super(codigoDeBarras);
    }

    @Override
    public InstituicaoFinanceira getInstituicaoFinanceira() {
        return InstituicaoFinanceira.BRADESCO;
    }

    @Override
    public boolean isValidoParaInterpretacao() {
        return super.getCodigoDeBarras().startsWith(this.getInstituicaoFinanceira().getCodigo());
    }

    @Override
    public String getNossoNumero() {
        return super.getCodigoDeBarras().substring(23, 36);
    }

    @Override
    public String getAgencia() {
        return super.getCodigoDeBarras().substring(19, 23);
    }

    @Override
    public String getContaCobranca() {
        return super.getCodigoDeBarras().substring(36, 43);
    }

    @Override
    public String getCodigoCarteira() {
        return super.getCodigoDeBarras().substring(23, 25);
    }

    @Override
    public boolean isContaCobrancaRastreavel() {
        return true;
    }
}