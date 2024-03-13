/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancocomposite;

/**
 *
 * @author Robinson Concha
 */
public class TAcomposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        
        SectorAdministrativo administracion = new SectorAdministrativo();
        SectorCajas cajas = new SectorCajas();
        SectorContaduria contaduria = new SectorContaduria();
        SectorGerencia gerencia = new SectorGerencia();
        SectorRRHH rrhh = new SectorRRHH();
        
        banco.agregar(administracion);
        banco.agregar(cajas);
        banco.agregar(contaduria);
        banco.agregar(gerencia);
        banco.agregar(rrhh);
        
        Empleado cajero1 = new Empleado("José Pérez", "Cajero", 300);
        Empleado cajero2 = new Empleado("Pepe Torres", "Cajero", 300);
        
        cajas.agregar(cajero1);
        cajas.agregar(cajero2);
        
        Empleado gerente = new Empleado("Pato Concha", "Gerente", 500);
        gerencia.agregar(gerente);
        
        Empleado selector = new Empleado("Pedro Cañas", "RRHH", 350);
        rrhh.agregar(selector);
        
        Empleado contador = new Empleado("Ana López", "Contador", 380);
        contaduria.agregar(contador);
        
        System.out.println("Total Sueldos del Banco:" + banco.getSueldo());
    }  
}
