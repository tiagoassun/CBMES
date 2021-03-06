/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.util;

import br.gov.es.cb.sdro.model.Tipocombustivel;
import java.util.List;

/**
 *
 * @author Heitor
 */
public class TipocombustivelDAO extends AbstractDAO<Tipocombustivel>{
    
    public Tipocombustivel buscaTipoCombustivelPorNome(String nome) {
        busca = "Tipocombustivel.findByDescricao";
        parametro = "descricao";
        Tipocombustivel tipocombustivel = buscaPorString(nome);
        return tipocombustivel;
    }
    public Tipocombustivel buscaTipoCombustivelPorID(int id){
        busca =  "Tipocombustivel.findByIdtipocombustivel";
        parametro = "idtipocombustivel";
        return buscaPorInteger(id);
    }
    
     public List<Tipocombustivel> buscaTipoCombustiveis(){
        busca = "Tipocombustivel.findAll";
        return (List<Tipocombustivel>) buscaListaSemParametro();
    }
    
    
     
     
}