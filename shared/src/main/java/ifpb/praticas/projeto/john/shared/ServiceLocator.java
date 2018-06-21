/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.praticas.projeto.john.shared;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ifpb
 */
public class ServiceLocator {

    private static final String SERVICE_CALCULO = "java:global/core/CalculadoraSimples";

    public Calculadora lookup() {
        try {
            Properties properties = new Properties();
            properties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
                    "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context context = new InitialContext(properties);
            return (Calculadora) context.lookup(SERVICE_CALCULO);
        } catch (NamingException ex) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
