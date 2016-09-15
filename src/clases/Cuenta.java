/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Shadia^^
 */
public class Cuenta {
    private int numeroCuenta;
    private long identificacion;
    private double saldo_actual;
    private double interes_anual;

    public Cuenta(int numeroCuenta, long identificacion, double saldo_actual,double interes_anual) {
        this.numeroCuenta = numeroCuenta;
        this.identificacion = identificacion;
        this.saldo_actual = saldo_actual;
        this.interes_anual = interes_anual;
    }
    public Cuenta(int numeroCuenta, long identificacion,double interes_anual) {
        this.numeroCuenta = numeroCuenta;
        this.identificacion = identificacion;
        this.saldo_actual = 0;
        this.interes_anual = interes_anual;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    public double actualizarSaldo(){
    
     double aux, aux2;
           
      aux = this.saldo_actual+(this.interes_anual/365);
       this.saldo_actual = aux;
         
       return this.saldo_actual;
       
    }
    public double ingresar(){
       double aux;
        double s;
        int respu,sw;
        
         
            sw = 1;

            
                aux = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el total a ingresar"));

                s =  this.saldo_actual + aux;
                this.saldo_actual = s;
                
                respu = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (respu == 0) {
                    
                    sw = 1;
                } else {
                    sw = 0;
                }
                
                return this.saldo_actual;
            }
   public double retirar(){
       double aux;
        double s;
        
        int respu, sw;
        
            sw = 1;
            
            if (this.saldo_actual == 0) {
                JOptionPane.showMessageDialog(null, "En su cuenta no se encuentra saldo");
            } else {
                aux = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor total a retirar"));
                while (aux > this.saldo_actual) {
                    aux = Double.parseDouble(JOptionPane.showInputDialog("Saldo insuficiente para realizar el retiro, vuelva a intentar"));
                }
                s = this.saldo_actual - aux;
                this.saldo_actual = (s);
            }
            respu = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (respu == 0) {
                    
                    sw = 1;
                } else {
                    sw = 0;
                }
         
        return this.saldo_actual;
   }
    
       public String mostrar(){
        String aux;
       aux = "No. de la cuenta: "+this.getNumeroCuenta()+"\n"
           + "No. de Identificación: "+this.getIdentificacion()+"\n"
           + "Saldo Actual: "+this.getSaldo_actual()+"\n"
           + "Interes Anual: "+this.getInteres_anual();
        return aux;
       }

              
}
