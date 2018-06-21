/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.praticas.projeto.john.core;

import ifpb.praticas.projeto.john.shared.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author ifpb
 */
@Remote(Calculadora.class)
@Stateless
public class CalculadoraSimples implements Calculadora{

    @Override
    public int somar(int a,int b) {
        return a + b;
        
    }
    
}
